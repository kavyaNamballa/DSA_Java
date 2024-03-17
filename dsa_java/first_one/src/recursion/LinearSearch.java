package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,4,5,9};
        System.out.println(search(arr,9,0));
        System.out.println(searchMultiple(arr,9,0));
    }
    static int search(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        return (arr[i]==target)?i:search(arr,target,i+1);
    }
    static ArrayList searchMultiple(int[] arr,int target,int i){
        ArrayList<Integer> li = new ArrayList<>();
        if(i==arr.length){
            return li;
        }
        if(arr[i]==target){
            li.add(i);
        }
        ArrayList<Integer> ansFromBelow = searchMultiple(arr,target,i+1);
        li.addAll(ansFromBelow);
        return li;
    }
}
