import java.util.Scanner;

public class TicTacToe{
    public static void main(String[] args){
        // Scanner object (user input)
        Scanner scanner = new Scanner(System.in);

        // tic-tac-toe setup
        String[][] gameBoard = new String[3][3];
        int playerTurn = 1;

        // game interface
        System.out.println("  Welcome to my tic-tac-toe game!");
        System.out.println("-----------------------------------");

        // displays board
        displayBoard(gameBoard);

        // expand upon this baseline below
        System.out.print("Player " + playerTurn + "! Enter the row you want to play: ");
        int row = scanner.nextInt() - 1;
        System.out.print("Player " + playerTurn + "! Enter the column you want to play: ");
        int column = scanner.nextInt() - 1;

        gameBoard[row][column] = "O";

        displayBoard(gameBoard);
    }

    public static void displayBoard(String[][] gameBoard){
        String board = "";
        for(String[] row : gameBoard){
            board += "[";
            for(String entry : row){
                if(entry == null || entry.isEmpty()){
                    entry = "_";
                }
                board += entry + " "; 
            }
            board = board.substring(0, board.length() - 1) + "]\n";
        }
        System.out.println(board);
    }


}