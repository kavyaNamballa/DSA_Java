package recursionQuestions.backtracking;

public class Sudoko {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        if(solve(grid,0,0)){
            display(grid);
        }
        else{
            System.out.println("cant");
        }
    }
    static boolean solve(int[][] grid,int row,int col){
        if(row == grid.length-1 && col == grid.length){
            return true;
        }
        if(col== grid.length){
            return solve(grid,row+1,0);
        }
        if(grid[row][col]>0){
            return solve(grid,row,col+1);
        }
        for (int i = 1; i <= 9; i++) {
            if(isSafe(grid,row,col,i)){
                grid[row][col] = i;
                if(solve(grid,row,col+1)){
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }
    static void display(int[][] grid){
        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] grid, int row, int col, int num)
    {

        //row check
        for (int x = 0; x <= 8; x++)
            if (grid[row][x] == num)
                return false;

        //column check
        for (int x = 0; x <= 8; x++)
            if (grid[x][col] == num)
                return false;

        // 3x3 box check
        int startRow = row - row % 3,startCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j +startCol] == num)
                    return false;

        return true;
    }
}
