package Lab3;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("let's play a tic tac toe");
        
        //we define an object for our board as a multidimensinal array
        char[][] board = {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'},
        };
        printBoard(board);
        System.out.println("");


        

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
            System.out.println("Turn: X");
            int[] spot = askUser(board);
            board[spot[0]][spot[1]] = 'X';
            printBoard(board);
            checkWinner(board);
            } else {
            System.out.println("Turn: O");
            int[] spot = askUser(board);
            board[spot[0]][spot[1]] = 'O';
            printBoard(board);
            checkWinner(board);
            }}
    }

    /*  this is the method that asks the user to input his next move,
     this method is more of a UI based one, that's clear from the assgining of the input with -1,
      as the user is assumed to not be fimiliar with java array indexing*/

    public static int[] askUser(char[][] board) {
    Scanner scanner = new Scanner(System.in);
    int[] spot = new int[2];
    boolean validMove = false;
    while (!validMove) {
        System.out.print("Enter row number (1-3): ");
        int row = scanner.nextInt();
        System.out.print("Enter column number (1-3): ");
        int col = scanner.nextInt();
        if (row < 1 || row > 3 || col < 1 || col > 3) {
            System.out.println("Invalid input, please enter a number between 1-3");
        } else if (board[row-1][col-1] != '_') {
            System.out.println("Spot is already taken, please choose another spot");
        } else {
            spot[0] = row-1;
            spot[1] = col-1;
            validMove = true;
        }
    }
    return spot;
}

    

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // a method to check for a winner after each turn 

    public static void checkWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println("the winner is " + board[i][0] + " !");
            }
        }
        // Check columns
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] != '_' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                System.out.println("the winner is " + board[0][j] + " !" );
            }
        }
        // Check diagonals
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            System.out.println("the winner is " + board[0][0] + " !");
        }
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            System.out.println("the winner is " + board[0][2] + " !" );
        }
        System.out.println("No winner yet keep playing");  // No winner yet
    }
    
    
}
