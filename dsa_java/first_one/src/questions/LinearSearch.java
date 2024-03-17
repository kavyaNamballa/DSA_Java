package questions;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key = 3;
        System.out.println(search(arr,key));
    }
    static int search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
