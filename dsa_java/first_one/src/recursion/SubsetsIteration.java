package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> li = new ArrayList<>(outer.get(i));
                li.add(num);
                outer.add(li);
            }
        }
        return outer;
    }
}
