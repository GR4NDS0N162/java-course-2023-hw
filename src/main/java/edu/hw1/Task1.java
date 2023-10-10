package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    private Task1() {
    }

    @SuppressWarnings("MagicNumber") public static int minutesToSeconds(@NotNull String duration) {
        int invalidValue = -1;

        if (!duration.matches("[0-9]+:[0-5][0-9]")) {
            return invalidValue;
        }

        String[] arr = duration.split(":");

        try {
            int minutes = Integer.parseInt(arr[0]);
            int seconds = Integer.parseInt(arr[1]);

            return minutes * 60 + seconds;
        } catch (NumberFormatException e) {
            return invalidValue;
        }
    }
}
