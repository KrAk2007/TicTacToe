package org.example;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int slot = getUserInput(sc);

        System.out.println("Selected Slot: " + slot);
    }

    public static int getUserInput(Scanner sc) {

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
}