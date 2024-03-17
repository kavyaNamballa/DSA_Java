package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SplitMinLargestSubarr {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter m: ");
        m = sc.nextInt();
        int[][] dp = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(find(0,m,dp,arr));
    }
    static int find(int i,int m,int[][] dp,int[] arr){
        if(m==1){
            return sum(Arrays.copyOfRange(arr,i,arr.length));
        }
        if(dp[i][m]!=-1){
            return dp[i][m];
        }
        int res= Integer.MAX_VALUE,curSum = 0;
        for (int j = i; j < arr.length - m + 1; j++) {
            curSum+=arr[j];
            int inter  = find(j+1,m-1,dp,arr);
            int maxSum = (curSum>inter)?curSum:inter;
            res = (res<maxSum)?res:maxSum;
            if(curSum>res){
                break;
            }
        }
        dp[i][m] = res;
        return res;
    }
    static int sum(int[] arr){
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        return s;
    }
}
