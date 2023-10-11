package edu.hw1;

import java.util.Arrays;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] a1, int[] a2) {
        return min(a2) < min(a1) && max(a1) < max(a2);
    }

    private static int min(int @NotNull [] array) {
        OptionalInt min = Arrays.stream(array).min();
        return min.isPresent() ? min.getAsInt() : Integer.MAX_VALUE;
    }

    private static int max(int @NotNull [] array) {
        OptionalInt max = Arrays.stream(array).max();
        return max.isPresent() ? max.getAsInt() : Integer.MIN_VALUE;
    }
}
