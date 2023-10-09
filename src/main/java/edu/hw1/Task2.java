package edu.hw1;

public class Task2 {
  private Task2() {}

  @SuppressWarnings("MagicNumber")
  public static int countDigits(int number) {
    int count = 1;
    for (int n = number; n != 0; n /= 10) {
      count++;
    }
    return count;
  }
}
