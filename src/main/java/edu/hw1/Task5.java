package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task5 {
    private Task5() {
    }

    public static boolean isPalindromeDescendant(int number) {
        int descendant = number;

        do {
            if (isPalindrome(descendant)) {
                return true;
            }
            descendant = calcDescendant(descendant);
        } while (getLength(descendant) > 1);

        return false;
    }

    private static boolean isPalindrome(int number) {
        return isPalindrome(Integer.toString(number));
    }

    private static int calcDescendant(int number) {
        StringBuilder result = new StringBuilder();

        String string = Integer.toString(number);

        for (int i = 0; i < string.length() / 2; i++) {
            int x = string.charAt(2 * i) - '0';
            int y = string.charAt(2 * i + 1) - '0';
            result.append(x + y);
        }

        if (string.length() % 2 != 0) {
            result.append(string.charAt(string.length() - 1));
        }

        return Integer.parseInt(result.toString());
    }

    private static int getLength(int number) {
        return Integer.toString(number).length();
    }

    private static boolean isPalindrome(@NotNull String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
