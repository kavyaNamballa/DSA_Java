package binarySearch;


public class SearchInRotatedArr2 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
//        int[] nums={1};
        int target = 2;
        int pivot = findMin(nums);
        int ans= search(nums,target,0,nums.length-1,pivot);
        System.out.println(ans);
    }
    static int findMin(int[] arr){
        int s = 0;
        int e = arr.length-1;
        if(arr[s]<arr[e]){
            return s;
        }
        while(s<e){
            int mid = (s+e)/2;
            if(arr[mid]>arr[e]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return s-1;
    }
    static int search(int[] arr,int target,int s,int e,int rot){
        while(s<=e){
            int m = (s+e)/2;
            int mid = (m+rot)%arr.length;
            if(target == arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }
}
