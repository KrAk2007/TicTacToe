package org.example;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;

        boolean valid = isValidMove(board, row, col);

        System.out.println("Valid Move: " + valid);
    }

    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            return true;
        }

        return false;
    }
}