package recursionQuestions.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }
    static int queens(boolean[][] board,int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe2(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static boolean isSafe2(boolean[][] board,int row,int col){
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //for straight vertical check
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //for left diagonal check
        int r = row,c = col;
        while(c>0 && r>0){
            if(board[r-1][c-1]){
                return false;
            }
            r--;
            c--;
        }

        //for right diagonal check
        r = row;
        c = col;
        while(c< board.length-1 && r>0){
            if(board[r-1][c+1]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean x:row){
                if(x){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
