package edu.project1;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ConsoleHangman {
    private final static Logger LOGGER = LogManager.getLogger();

    private static final int START_GUESSES_COUNT = 5;

    private ConsoleHangman() {
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Welcome to the Hangman game!");

        int guessesLeft = START_GUESSES_COUNT;
        boolean gameWon = false;

        while (guessesLeft > 0) {
            LOGGER.info("You have " + guessesLeft + " guesses left.");
            LOGGER.info("Enter your guess: ");
            String guess = scanner.nextLine();

            if (!isValidGuess(guess)) {
                LOGGER.info("Please enter a single letter.");
                continue;
            }

            // TODO: Hangman game logic goes here.

            guessesLeft--;
        }

        if (gameWon) {
            LOGGER.info("You won!");
        } else {
            LOGGER.info("You lost!");
        }

        scanner.close();
    }

    private static boolean isValidGuess(@NotNull String guess) {
        return guess.length() == 1 && guess.matches("[a-zA-Z]");
    }
}
