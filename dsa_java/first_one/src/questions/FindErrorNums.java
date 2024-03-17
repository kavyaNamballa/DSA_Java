package questions;

import java.util.Arrays;

class FindErrorNums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new int[]{5,4,2,4,1})));
    }
    static int[] find(int[] arr) {
        int i = 0;
        while(i<arr.length){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
//                    swap(arr,i,correct);
                    arr[i] = arr[correct];
                    arr[correct] = correct+1;
                }else{
//                    return new int[]{arr[correct],i+1};
                    i++;
                }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=(j+1)){
                return new int[]{arr[j],(j+1)};
            }
        }
        return new int[]{};
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}