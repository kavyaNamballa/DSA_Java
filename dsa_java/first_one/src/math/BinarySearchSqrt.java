package math;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; //precision upto 3 decimal places

        System.out.println(sqrt(n,p));

    }
    static double sqrt(int n,int p){
        int s = 0;
        int e = n;
        double res = 0.0;
        while(s<e){
            int m = s + (e-s)/2;
            if(m*m == n){
                return m;
            }
            else if(m*m > n){
                e = m-1;
            }
            else{
                s = m + 1;
            }
        }
        res = e;
        double incr = 0.1;
        System.out.println("res "+res);
        for (int i = 0; i < p; i++) {
            while(res*res <= n){
                res += incr;
            }
            res -= incr;
            incr /= 10;
        }
        return res;
    }
}
