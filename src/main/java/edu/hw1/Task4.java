package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task4 {
    private Task4() {
    }

    public static @NotNull String fixString(@NotNull String s) {
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i += 2) {
            char tmp = chars[i];
            chars[i] = chars[i - 1];
            chars[i - 1] = tmp;
        }

        return new String(chars);
    }
}
