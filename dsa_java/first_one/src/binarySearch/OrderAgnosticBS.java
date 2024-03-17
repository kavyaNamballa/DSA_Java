package binarySearch;

public class OrderAgnosticBS {
    //order agnostic means given a sorted array but don't know whether it's sorted in ascending or descending
    public static void main(String[] args) {
        int[] arr = {90,75,18,12,6,4,3,1};
        boolean isAsc = arr[0]<arr[arr.length-1];
        System.out.println(search(arr, 18,isAsc));
    }
    static int search(int[] arr,int target,boolean isAsc){
        int start = 0,end= arr.length-1,mid;
        while(start<=end){
            //(s+e) might exceed the integer range for large numbers so another way is s + (e-s)/2
            //mid = (start+end)/2;
            mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
