package org.example;

public class TicTacToe {
    public static void main(String[] args) {

        int slot = 5;

        int[] result = convertToIndex(slot);

        System.out.println("Row: " + result[0]);
        System.out.println("Column: " + result[1]);
    }

    public static int[] convertToIndex(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }
}