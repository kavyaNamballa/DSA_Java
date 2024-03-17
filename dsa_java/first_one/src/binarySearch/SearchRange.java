package binarySearch;

import java.util.Arrays;

public class SearchRange{
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[] nums, int target) {
        int[] ans = {-1,-1};
        int f = find(nums,target,true);
        int l = find(nums,target,false);
        ans[0] = f;
        ans[1] = l;
        return ans;

    }
    static int find(int[] arr,int target,boolean findStart){
        int ans = -1;
        int str = 0,end = arr.length-1;
        while(str<=end){
            int mid = (str+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(target>arr[mid]){
                str = mid+1;
            }
            else{
                ans = mid;
                if(findStart){
                    end = mid-1;
                }
                else{
                    str = mid+1;
                }
            }
        }
        return ans;
    }
}
