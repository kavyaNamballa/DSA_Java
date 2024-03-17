package questions;

class MissingNum {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i] != i){
                swap(arr,i,arr[i]);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}