package questions;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {123,1234,12,10,1,-1011};
        System.out.println(find(nums));
    }
    static int find(int[] nums){
        int count=0;
        for(int num:nums){
            if(num<0){
                num = -num;
            }
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        //return Integer.toString(num).length()%2 == 0;
        return ((int)(Math.log10(num)) + 1)%2 == 0;
    }
}
