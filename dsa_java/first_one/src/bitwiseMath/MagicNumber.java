package bitwiseMath;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        int base = 5;
        while(n>0){
            int dig = n&1;
            res = res + dig*base;
            base = base*5;
            n = n>>1;
        }
        System.out.println(res);
    }
}
