package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    private Task1() {
    }

    @SuppressWarnings("MagicNumber")
    public static int minutesToSeconds(@NotNull String duration) {
        String[] arr = duration.split(":");

        int invalidValue = -1;

        if (arr.length != 2 || arr[0].isEmpty() || arr[1].isEmpty()) {
            return invalidValue;
        }

        try {
            int minutes = Integer.parseInt(arr[0]);
            int seconds = Integer.parseInt(arr[1]);

            if (minutes < 0 || seconds < 0 || seconds > 59) {
                return invalidValue;
            }

            return minutes * 60 + seconds;
        } catch (NumberFormatException e) {
            return invalidValue;
        }
    }
}
