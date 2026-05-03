package org.example;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        boolean isDraw = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isDraw = false;
                }
            }
        }

        if (isDraw) {
            System.out.println("Draw");
        } else {
            System.out.println("Moves remaining");
        }
    }
}