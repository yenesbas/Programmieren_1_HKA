import java.util.Scanner;

public class TicTacToe {
    private char[][] board; // darstellen des 2D boards
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3]; // spieler wird auf X gesetzt
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void printBoard() {         // ausgabe des spielfeldes
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean makeMove(int row, int col) {        // methode zum setzen eines spielzuges
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    private boolean checkWin() {        // check ob jemand gewonnen hat
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {         // überprüfung auf unentschieden
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zu Tic-Tac-Toe!");

        while (true) {
            printBoard();

            System.out.println("Spieler " + currentPlayer + ", geben Sie Ihre Zugkoordinaten ein (Reihe Spalte):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (makeMove(row, col)) {       // spielstein setzen
                if (checkWin()) {
                    printBoard();
                    System.out.println("Spieler " + currentPlayer + " gewinnt!");
                    break;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("Unentschieden!");
                    break;
                } else {        // wechsel der spieler
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Ungültiger Zug. Bitte erneut versuchen.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}