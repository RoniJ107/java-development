package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine();

        int pipeIndex = input.indexOf('|');

        if (pipeIndex == -1) {
            System.out.println("Invalid input format. ");
            scanner.close();
            return;
        }

    }
}
