package edu.project1;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class ConsoleHangman {
    private static final int START_GUESSES_COUNT = 5;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hangman game!");

        int guessesLeft = START_GUESSES_COUNT;
        boolean gameWon = false;

        while (guessesLeft > 0) {
            System.out.println("You have " + guessesLeft + " guesses left.");
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (!isValidGuess(guess)) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            // TODO: Hangman game logic goes here.

            guessesLeft--;
        }

        if (gameWon) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }

        scanner.close();
    }

    private boolean isValidGuess(@NotNull String guess) {
        return guess.length() == 1 && guess.matches("[a-zA-Z]");
    }
}
