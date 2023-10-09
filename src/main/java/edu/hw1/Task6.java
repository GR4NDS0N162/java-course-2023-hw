package edu.hw1;

import java.util.Arrays;

public class Task6 {
  private Task6() {}

  @SuppressWarnings("MagicNumber")
  public static int countK(int number) {
    if (number == 6174) {
      return 0;
    }

    int[] digits = new int[4];
    for (int i = 0, n = number; i < 4; i++) {
      digits[i] = n % 10;
      n /= 10;
    }

    Arrays.sort(digits);
    int a = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
    int b = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];

    return 1 + countK(b - a);
  }
}
