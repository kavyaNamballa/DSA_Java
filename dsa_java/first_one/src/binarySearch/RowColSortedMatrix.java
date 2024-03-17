package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class RowColSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
//        n = sc.nextInt();
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(mat,39)));
    }
    static int[] search(int[][] mat,int target){
        int r = 0;
        int c = mat.length-1;
        while(r<mat.length && c>=0){
            if(mat[r][c] == target){
                return new int[]{r,c};
            }
            else if(mat[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
