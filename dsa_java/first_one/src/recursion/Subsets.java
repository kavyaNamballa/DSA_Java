package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] arr = {1,2,3};
        subset(arr,new ArrayList<Integer>(),list,0);
        System.out.println(list);
    }
    static void subset(int[] arr,ArrayList<Integer> p,ArrayList<ArrayList<Integer>> list,int i){
        if(arr.length==i){
            list.add(new ArrayList<>(p));
//            System.out.println(p);
            return;
        }
        subset(arr,p,list,i+1);
        p.add(arr[i]);
        subset(arr,p,list,i+1);
        p.remove(p.size()-1);
    }
}
