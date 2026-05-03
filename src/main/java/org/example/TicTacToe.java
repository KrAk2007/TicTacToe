package org.example;

import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char current = 'X';
        boolean gameOver = false;
        Random random = new Random();

        while (!gameOver) {

            int row, col;

            while (true) {
                row = random.nextInt(3);
                col = random.nextInt(3);
                if (board[row][col] == '-') {
                    board[row][col] = current;
                    break;
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            if (
                    (board[0][0] == current && board[0][1] == current && board[0][2] == current) ||
                            (board[1][0] == current && board[1][1] == current && board[1][2] == current) ||
                            (board[2][0] == current && board[2][1] == current && board[2][2] == current) ||
                            (board[0][0] == current && board[1][0] == current && board[2][0] == current) ||
                            (board[0][1] == current && board[1][1] == current && board[2][1] == current) ||
                            (board[0][2] == current && board[1][2] == current && board[2][2] == current) ||
                            (board[0][0] == current && board[1][1] == current && board[2][2] == current) ||
                            (board[0][2] == current && board[1][1] == current && board[2][0] == current)
            ) {
                System.out.println("Winner: " + current);
                gameOver = true;
            }

            boolean draw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') draw = false;
                }
            }

            if (draw && !gameOver) {
                System.out.println("Draw");
                gameOver = true;
            }

            current = (current == 'X') ? 'O' : 'X';
        }
    }
}