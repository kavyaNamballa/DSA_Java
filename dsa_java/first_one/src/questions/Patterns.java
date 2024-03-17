package questions;

public class Patterns {
    public static void main(String[] args) {
        pat4(5,5);
//        pat1(5);
//        pat2(5);
    }
    static void pat3(int n){
        int N = 2 * n - 1;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                int left = col;
                int up = row;
                int right = N-col-1;
                int down = N-row-1;
                System.out.print(n-Math.min(Math.min(left,up),Math.min(right,down)) +" ");
            }
            System.out.println();
        }
    }
    static void pat4(int n,int m){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                int left = col;
                int up = row;
                int right = m-col-1;
                int down = n-row-1;
                int res = Math.min(Math.min(left,up),Math.min(right,down));
                if((res&1)==0){
                    System.out.print("X ");
                }else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
    static void pat1(int n){
        for(int row=1;row<= (2*n-1);row++){
            int c = (row>n)?(2*n-row):row;
            for(int col = 1;col<=c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat2(int n){
        for(int row=1;row<= (2*n-1);row++){
            int c = (row>n)?(2*n-row):row;
            int s = n-c;
            for(int j = 1;j<=s;j++){
                System.out.print(" ");
            }
            for(int col = 1;col<=c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
