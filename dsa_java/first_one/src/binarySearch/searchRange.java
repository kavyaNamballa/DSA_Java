package binarySearch;

import java.util.Arrays;

public class searchRange{
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[] nums, int target) {
        int f = floor(nums,target);
        int c = ceiling(nums,target);
        System.out.println(c+" "+f);
        if((c-f) == 1){
            return new int[]{-1,-1};
        }
        return new int[]{f+1,c-1};

    }
    static int ceiling(int[] arr,int target){
        int str = 0,end = arr.length-1;
        while(str<=end){
            int mid = (str+end)/2;
            if(arr[mid]<=target){
                str = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return str;
    }
    static int floor(int[] arr,int target){
        int str = 0,end = arr.length-1;
        while(str<=end){
            int mid = (str+end)/2;
            if(arr[mid]<target){
                str = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
}
