package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsIterDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        Arrays.sort(arr);
        System.out.println(subset(arr));
        System.out.println(subset2(arr));
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int j = 0;j<arr.length;j++){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> li = new ArrayList<>(outer.get(i));
                if(j>0 && arr[j]==arr[j-1]) {
                    if (li.contains(arr[j])) {
                        li.add(arr[j]);
                        outer.add(li);
                    }
                }
                else{
                    li.add(arr[j]);
                    outer.add(li);
                }

            }
        }
        return outer;
    }
    static List<List<Integer>> subset2(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s,e=0;
        for(int j = 0;j<arr.length;j++){
            int size = outer.size();
            s = 0;
            if(j>0 && arr[j]==arr[j-1]){
                s = e;
            }
            e = size;
            for (int i = s; i < e; i++) {
                List<Integer> li = new ArrayList<>(outer.get(i));
                li.add(arr[j]);
                outer.add(li);
            }
        }
        return outer;
    }
}
