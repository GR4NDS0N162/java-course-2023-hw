package edu.hw1;

public class Task2 {
    private Task2() {
    }

    @SuppressWarnings("MagicNumber")
    public static int countDigits(int number) {
        int count = 0;
        int n = number;

        do {
            count++;
            n /= 10;
        } while (n != 0);

        return count;
    }
}
