package binarySearch;

import java.util.Arrays;

public class Sorted2dArrBS {
    public static void main(String[] args) {
//        int[][] mat = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
        int[][] mat = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };
        System.out.println(Arrays.toString(search(mat,10)));
    }
    static int[] search(int[][] mat,int target){
        int rows = mat.length;
        int cols = mat[0].length;// be cautious!! matrix may be empty
        int l = 0,r = rows-1,c = cols-1;
        while(l<(r-1)){
            int mid = l + (r-l)/2;
            if(mat[mid][c]==target){
                return new int[]{mid,c};
            }
            else if(mat[mid][c] > target){
                r = mid;
            }
            else{
                l = mid;
            }
        }
        System.out.println("l,r :"+l+" "+r);
        int res = binarySearch(mat,target,l);
        if(res!=-1){
            return new int[]{l,res};
        }
        else{
            res = binarySearch(mat,target,r);
            if(res!=-1) return new int[]{r,res};
            else return new int[]{-1,-1};
        }
    }
    static int binarySearch(int[][] arr,int target,int row){
        int s = 0,e = arr[0].length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(target == arr[row][mid]){
                return mid;
            }
            else if(target>arr[row][mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}
