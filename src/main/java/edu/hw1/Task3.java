package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task3 {
  private Task3() {}

  public static boolean isNestable(int[] a1, int[] a2) {
    return min(a2) < min(a1) && max(a1) < max(a2);
  }

  private static int min(int @NotNull[] array) {
    int minValue = Integer.MAX_VALUE;

    for (int value : array) {
      minValue = Integer.min(value, minValue);
    }

    return minValue;
  }

  private static int max(int @NotNull[] array) {
    int maxValue = Integer.MIN_VALUE;

    for (int value : array) {
      maxValue = Integer.max(value, maxValue);
    }

    return maxValue;
  }
}
