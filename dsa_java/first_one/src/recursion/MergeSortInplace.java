package recursion;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int s,int e){
        if(e-s == 0){
            return;
        }

        int mid = s+(e-s)/2;
        sort(arr,s,mid);
        sort(arr,mid+1,e);

        merge(arr,s,mid,e);

    }
    static void merge(int[] arr,int s,int m,int e){
        int[] mix = new int[e-s+1];
        int i=s;
        int j=m+1;
        int k=0;

        while(i<m+1 && j<e+1){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            }
            else{
                mix[k] = arr[j];
                j++;
                k++;
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
