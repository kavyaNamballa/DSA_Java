package questions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] d = {9};
        System.out.println(Arrays.toString(plusOne(d)));
    }
    static int[] plusOne(int[] digits) {
            int n = digits.length;
            int flag = 0;
            for(int i = n-1;i>=0;i--){
                int k = digits[i];
                digits[i] = (k+1)%10;
                if((k+1)/10 == 0){
                    return digits;
                }
                else if(i==0) flag = 1;
            }
            System.out.println(flag);
            if(flag == 1){
                int[] res = new int[n+1];
                res[0] = 1;
                for(int i = 0;i<n;i++){
                    res[i+1] = digits[i];
                }
                return res;
            }
            else return digits;
    }
}
