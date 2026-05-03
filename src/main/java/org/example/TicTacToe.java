package org.example;

import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        Random random = new Random();
        int row, col;

        while (true) {
            row = random.nextInt(3);
            col = random.nextInt(3);

            if (board[row][col] == '-') {
                board[row][col] = 'O';
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}