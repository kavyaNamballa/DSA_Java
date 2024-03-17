package bitwiseMath;

public class PowOfAnum {
    public static void main(String[] args) {
        int base = 3;
        int e = 6;
        int ans = 1;
        while(e>0){
            int dig = e&1;
            e = e>>1;
            if(dig==1){
                ans = ans*base;
            }
            base = base*base;
        }
        System.out.println(ans);
    }
}
