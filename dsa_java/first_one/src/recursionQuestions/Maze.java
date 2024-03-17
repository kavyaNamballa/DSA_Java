package recursionQuestions;

public class Maze {
    public static void main(String[] args) {
        System.out.println("path without including diagonals: ");
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println("path including diagonals: ");
        System.out.println(countDiagonal(3,3));
        pathDiagonal("",3,3);
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println("Maze with obstacles: ");
        pathRestrictions("",board,0,0);

    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static int countDiagonal(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = countDiagonal(r-1,c);
        int right = countDiagonal(r,c-1);
        int dia=0;
        if(r>1 && c>1){
            dia = countDiagonal(r-1,c-1);
        }
        return left+right+dia;
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static void pathDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathDiagonal(p+'D',r-1,c);
        }
        if(c>1){
            pathDiagonal(p+'R',r,c-1);
        }
        if(r>1 && c>1){
            pathDiagonal(p+'d',r-1,c-1);
        }
    }
    static void pathRestrictions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }
    }
}
