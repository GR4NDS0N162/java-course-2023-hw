package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static int countDigits(int num) {
        int count = 0;

        do {
            count++;
            num /= 10;
        } while (num != 0);

        return count;
    }
}
