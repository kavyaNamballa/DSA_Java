package binarySearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21,3,4},
                {12,13,14,9},
                {41,10,11,46},
                {32,122}
        };
        int[] ans = search(arr,100);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length ==0){
            return null;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


}
