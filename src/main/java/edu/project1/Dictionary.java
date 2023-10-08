package edu.project1;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

public class Dictionary {
    private static final String[] WORDS = new String[] {
        "emphasis",
        "different",
        "hall",
        "pace",
        "ditch",
        "secular",
        "rotation",
        "empirical",
        "confine",
        "courtesy",
    };

    private Dictionary() {
    }

    public static @NotNull String getRandomWord() {
        return WORDS[new Random().nextInt(WORDS.length)];
    }
}
