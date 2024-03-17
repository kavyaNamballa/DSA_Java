import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean gameOver = false;
        while(!gameOver){
            boolean empty = printBoard(board);
            if(!empty){
                System.out.println("No one won! Game over ");
                break;
            }
            System.out.println("Player "+player+" enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col]==' '){
                board[row][col] = player;
                gameOver = haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won! ");
                    printBoard(board);
                }else{
                    player = (player=='X')?'O':'X';
                }
            }else{
                System.out.println("Invalid Move. Try again! ");
            }
        }
    }

    private static boolean haveWon(char[][] board, char player) {
        // check for rows
        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        // check for cols
        for (int col = 0; col < board[0].length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        // check for diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static boolean printBoard(char[][] board) {
        boolean empty = false;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("| "+board[row][col]+" |");
                if(board[row][col]==' '){
                    empty = true;
                }
            }
            System.out.println();
        }
        return empty;
    }
}
