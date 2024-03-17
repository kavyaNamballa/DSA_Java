package binarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {2,2,9,2,2,2};
//        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(count(nums));
    }
    static int count(int[] arr) {
        int p = findPivotWithDuplicates(arr);
        return p+1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            // if elements at middle,start  end are equal then just skip the duplicates
            if(arr[mid] == arr[s] && arr[mid]==arr[e]){
                //note: what if those elements at s and e were the pivots??
                //check whether start is pivot or not
                if(arr[s]>arr[s+1]){
                    return s;
                }
                s++;

                //check whether end is pivot or not
                if(arr[e]<arr[e-1]){
                    return e-1;
                }
                e--;
            }
            else if(arr[s]<arr[mid] || (arr[s]==arr[mid] && arr[mid]>arr[e])){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
    static int search(int[] arr,int target,int s,int e){
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
