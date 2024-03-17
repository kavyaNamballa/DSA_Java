package binarySearch;

import java.util.Scanner;

public class floorOfAnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {2,3,3,9,14,16,18};
        int[] arr = {1,2,3,4,6,7,8};
        System.out.print("enter target: ");
        int target = sc.nextInt();
        //return the index
        System.out.println(floor(arr,target));
    }
    //the largest num that is less than or equal to target
    static int floor(int[] arr,int target){
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
        return end;
    }
}
