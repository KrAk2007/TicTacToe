package org.example;

public class TicTacToe {
    public static void main(String[] args) {

        int toss = (int)(Math.random() * 2);

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result: " + toss);
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}