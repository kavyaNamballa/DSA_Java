package bitwiseMath;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr = {2,2,15,2,7,7,8,7,8,8};
        int single = 0;
        for (int i = 0; i < 31; i++) {
            int x = 1<<i;
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if((arr[j]&x) >= 1){
                    c+=1;
                }
            }
            if(c%3==1){
                single = single|x;
            }
        }
        System.out.println("single: "+single);
    }
}
