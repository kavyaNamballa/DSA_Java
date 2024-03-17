package recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(check(arr,0));
        System.out.println(check2(arr,0));
    }
    static boolean check(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return check(arr,i+1);
        }
        return false;
    }
    static boolean check2(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && check2(arr,i+1);
//        return arr[i]<arr[i+1] && test();
    }
    static boolean test(){
        System.out.println("hii");
        return true;
    }
}
