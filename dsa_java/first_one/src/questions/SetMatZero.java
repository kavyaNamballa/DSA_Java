package questions;

import java.util.Arrays;

public class SetMatZero {
    public static void main(String[] args) {
//        int[][] mat = {{0,1,2,0},
//                {3,4,5,2},
//                {1,3,1,5}};
        int[][] mat = {{1,0,5}};
        setZeroes(mat);
//        for (int i = 0; i < mat.length; i++) {
//            System.out.println(Arrays.toString(mat[i]));
//        }
    }
    static void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        System.out.println(m+" "+n);
        boolean col0 = false, row0 = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    if (i == 0) row0 = true;
                    if (j == 0) col0 = true;
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        System.out.println(row0);
        for (int i = m - 1; i > 0; i--) {
            if (mat[i][0] == 0) {
                for (int k = 0; k < n; k++)
                    mat[i][k] = 0;
            }
        }
        for (int j = n - 1; j > 0; j--) {
            if (mat[0][j] == 0) {
                for (int k = 0; k < m; k++)
                    mat[k][j] = 0;
            }
        }
        if (col0) {
            for (int k = 0; k < m; k++)
                mat[k][0] = 0;
        }
        if (row0) {
            for (int k = 0; k < n; k++)
                mat[0][k] = 0;
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
