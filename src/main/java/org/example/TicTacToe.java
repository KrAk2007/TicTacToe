package org.example;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X'},
                {'O', '-', 'O'},
                {'-', '-', '-'}
        };

        char winner = '-';

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                winner = board[i][0];
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                winner = board[0][j];
            }
        }

        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            winner = board[0][0];
        }

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            winner = board[0][2];
        }

        if (winner != '-') {
            System.out.println("Winner: " + winner);
        } else {
            System.out.println("No winner");
        }
    }
}