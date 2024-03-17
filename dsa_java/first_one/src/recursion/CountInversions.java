package recursion;

public class CountInversions {
}
class Solution {
    static long c;
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        c=0;
        sort(arr, 0, arr.length-1);
        return c;
    }
    public static void sort(long[] nums,int s,int e){
        if(e-s==0){
            return;
        }
        int mid = (s+e)/2;
        sort(nums,s,mid);
        sort(nums,mid+1,e);
        merge(nums,s,mid,e);
    }
    public static void merge(long[] arr,int s,int m,int e){
        long[] mix = new long[e-s+1];
        int i=s;
        int j=m+1;
        int k=0;

        while(i<m+1 && j<e+1){
            if(arr[i]<=arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            }
            else{
                mix[k] = arr[j];
                j++;
                k++;
                c=c+(m-i+1);
            }
        }

        while(i<m+1){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e+1){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
