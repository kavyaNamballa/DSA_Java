package questions;

import java.util.Scanner;

public class SplitMinLargSubarr2 {
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter m: ");
        k = sc.nextInt();
        int s = max(nums);
        int e = sum(nums);
        while(s<e){
            int mid = s + (e-s)/2;
            if(split(nums,mid)<=k) e = mid;
            else s = mid+1;
        }
        System.out.println(s);
    }
    static int split(int[] nums,int mid){
        int sub_arr_count = 0;
        int curSum = 0;
        for(int i:nums){
            curSum += i;
            if(curSum>mid){
                sub_arr_count+=1;
                curSum = i;
            }
        }
        return sub_arr_count+1;
    }
    static int max(int[] nums){
        int m = Integer.MIN_VALUE;
        for(int i:nums){
            if(i>m) m = i;
        }
        return m;
    }
    static int sum(int[] nums){
        int s=0;
        for(int i:nums){
            s+=i;
        }
        return s;
    }
}
