package edu.hw1;

import java.util.BitSet;

public class Task7 {
  private Task7() {}

  public static int rotateLeft(int n, int shift) { return rotate(n, shift); }

  private static int rotate(int number, int shiftToLeft) {
    BitSet bitSet = new BitSet(Integer.SIZE);
    for (int i = 0, n = number; n > 0; i++) {
      bitSet.set(i, n % 2 == 1);
      n /= 2;
    }

    int length = bitSet.length();

    int result = 0;
    for (int i = 0; i < length; i++) {
      if (bitSet.get(i)) {
        int newIndex = (i + shiftToLeft) % length;
        result |= 0x1 << newIndex;
      }
    }

    return result;
  }

  public static int rotateRight(int n, int shift) { return rotate(n, -shift); }
}
