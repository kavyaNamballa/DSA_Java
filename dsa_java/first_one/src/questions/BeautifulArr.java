package questions;

import java.util.*;

public class BeautifulArr {
    public static void main(String[] args) {
//        System.out.println(minimumPossibleSum(1000000000,1000000000));
        System.out.println(minimumPossibleSum2(1000000000,1000000000));
    }
    static long minimumPossibleSum2(int n, int target) {
        Set<Long> st = new HashSet<>();
        long ans = 0;
        for (long i = 1; st.size() < n; ++i) {
            if (!st.contains(target - i)) {
                st.add(i);
                ans += i;
            }
        }
        System.out.println(ans);
        return ans%(int)(Math.pow(10,9)+7);
    }
    static int minimumPossibleSum(int n, int target) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<n;i++){
            int rem = target-(i+1);
            if(rem<=n && rem != i+1  && rem>0 && arr[i]!=0){
                if(arr[rem-1]<arr[i]) arr[i] = 0;
                else arr[rem-1] = 0;
            }
        }
        if(n>=target) target++;
        long sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) arr[i] = target++;
            sum+=arr[i];
        }
        System.out.println(sum);
        return (int)(sum%(int)(Math.pow(10,9)+7));
    }
}
