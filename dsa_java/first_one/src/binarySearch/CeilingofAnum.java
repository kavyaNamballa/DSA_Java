package binarySearch;

import java.util.Scanner;

public class CeilingofAnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,3,9,14,16,18};
        System.out.print("enter target: ");
        int target = sc.nextInt();
        //returns the index
        System.out.println(ceiling(arr,target));
    }
    //the smallest number that is greater than or equal to target
    static int ceiling(int[] arr,int target){

        //but what if the target is greater than the largest num in the array then no ceiling
        if(target>arr[arr.length-1]){
            return -1;
        }
        int str = 0,end = arr.length-1;
        while(str<=end){
            int mid = (str+end)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                str = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return str;
    }
}
