package edu.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task2Test {
  @Test
  @DisplayName("4666")
  void test1() {
    // given
    int num = 4666;

    // when
    int seconds = Task2.countDigits(num);

    // then
    assertThat(seconds).isEqualTo(4);
  }

  @Test
  @DisplayName("544")
  void test2() {
    // given
    int num = 544;

    // when
    int seconds = Task2.countDigits(num);

    // then
    assertThat(seconds).isEqualTo(3);
  }

  @Test
  @DisplayName("0")
  void test3() {
    // given
    int num = 0;

    // when
    int seconds = Task2.countDigits(num);

    // then
    assertThat(seconds).isEqualTo(1);
  }

  @Test
  @DisplayName("-25")
  void test4() {
    // given
    int num = -25;

    // when
    int seconds = Task2.countDigits(num);

    // then
    assertThat(seconds).isEqualTo(2);
  }
}
