package Homework_5;
public class task_3 {
    private static int boardSize = 8;

    public static void main(String[] args) {
        int[][] board = new int[boardSize][boardSize];

        if (solveQueensProblem(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Решение не найдено.");
        }
    }

    private static boolean solveQueensProblem(int[][] board, int col) {
        if (col >= boardSize) {
            return true;
        }

        for (int row = 0; row < boardSize; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;

                if (solveQueensProblem(board, col + 1)) {
                    return true;
                }

                board[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < boardSize && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print((board[i][j] == 1) ? "X" : "0");
            }
            System.out.println();
        }
    }
}
