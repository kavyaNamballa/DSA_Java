package binarySearch;

import java.util.Arrays;

public class posOfElem_In_InfiniteArr {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        int ans = findSE(arr,target,0,1);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
    static int findSE(int[] arr,int target,int s,int e){
        while(target>arr[e]){
            int t = s;
            s = e+1;
            e = e+(e-t+1)*2;
        }
        return findPos(arr,target,s,e);
    }
    static int findPos(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid = (s+e)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}
