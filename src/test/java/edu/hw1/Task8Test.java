package edu.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task8Test {
  @Test
  @DisplayName("Positive")
  void test1() {
    // given
    int[][] board = {{0, 0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0, 1, 0},
                     {0, 1, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 0}};

    // when
    boolean result = Task8.knightBoardCapture(board);

    // then
    assertThat(result).isEqualTo(true);
  }

  @Test
  @DisplayName("Negative")
  void test2() {
    // given
    int[][] board = {{1, 0, 1, 0, 1, 0, 1, 0}, {0, 1, 0, 1, 0, 1, 0, 1},
                     {0, 0, 0, 0, 1, 0, 1, 0}, {0, 0, 1, 0, 0, 1, 0, 1},
                     {1, 0, 0, 0, 1, 0, 1, 0}, {0, 0, 0, 0, 0, 1, 0, 1},
                     {1, 0, 0, 0, 1, 0, 1, 0}, {0, 0, 0, 1, 0, 1, 0, 1}};

    // when
    boolean result = Task8.knightBoardCapture(board);

    // then
    assertThat(result).isEqualTo(false);
  }

  @Test
  @DisplayName("Negative")
  void test3() {
    // given
    int[][] board = {{0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0}, {1, 0, 0, 0, 0, 0, 0, 0}};

    // when
    boolean result = Task8.knightBoardCapture(board);

    // then
    assertThat(result).isEqualTo(false);
  }
}
