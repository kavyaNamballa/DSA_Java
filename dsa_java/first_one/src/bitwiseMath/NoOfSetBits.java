package bitwiseMath;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(Integer.toBinaryString(n));
        int c =0;
        while(n>0){
            c += 1;
//            n = n-(n&-n);
            n = n&(n-1);
        }
        System.out.println(c);
    }
}
