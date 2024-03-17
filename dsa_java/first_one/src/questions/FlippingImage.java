package questions;

import java.util.Arrays;

class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for(int j = 0;j<=(A[0].length)/2;j++){
                if (A[i][j] == A[i][A[0].length-1-j]) {
                    A[i][j] ^= 1;
                    A[i][A[0].length-1-j] = A[i][j];
                    System.out.println("i: "+i+" j: "+j+"True");
                }
            }
        }
        
        return A;
    }
}