package binarySearch;

public class SearchInRotatedArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int[] nums1={2,9,2,2,2};
        int target = 2;
        int pivot = findPivot(nums);
        int p = findPivotWithDuplicates(nums1);
        System.out.println("In nums: "+pivot);
        System.out.println("In nums1: "+p);
        int ans = search(nums,target,0,pivot);
        if(ans==-1){
            System.out.println(search(nums,target,pivot+1,nums.length-1));
        }
        else{
            System.out.println(ans);
        }
    }
    // this won't work for duplicates
    static int findPivot(int[] arr){
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
            if(arr[mid]<arr[s]){
                e = mid-1;
            }
            else{
                s = mid;
            }
        }
        return -1;
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
