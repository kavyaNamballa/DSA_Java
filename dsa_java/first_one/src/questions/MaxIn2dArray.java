package questions;

import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21,3,4},
                {12,13,14,9},
                {41,10,11,46},
                {32,122}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        if(arr.length ==0){
            return -1;
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] >= max){
//                    max = arr[i][j];
//                }
//            }
//        }
        for(int[] li:arr){
            for(int elem:li){
                if(elem>max){
                    max = elem;
                }
            }
        }
        return max;
    }
}
