package questions;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + dfs(nums,i);
            max = Math.max(max,sum);
        }
        System.out.println(dfs(nums,0));

    }
    static int dfs(int[] arr,int k){
        if(k>=arr.length) return 0;
        int sum = 0;
        for(int i=k+2;i<arr.length;i++){
                sum = arr[i] + dfs(arr, i);
        }
        return sum;

    }
}
