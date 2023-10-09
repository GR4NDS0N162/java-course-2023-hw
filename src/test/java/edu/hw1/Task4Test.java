package edu.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4Test {
  @Test
  @DisplayName("123456")
  void test1() {
    // given
    String s = "123456";

    // when
    String fixed = Task4.fixString(s);

    // then
    assertThat(fixed).isEqualTo("214365");
  }

  @Test
  @DisplayName("hTsii  s aimex dpus rtni.g")
  void test2() {
    // given
    String s = "hTsii  s aimex dpus rtni.g";

    // when
    String fixed = Task4.fixString(s);

    // then
    assertThat(fixed).isEqualTo("This is a mixed up string.");
  }

  @Test
  @DisplayName("badce")
  void test3() {
    // given
    String s = "badce";

    // when
    String fixed = Task4.fixString(s);

    // then
    assertThat(fixed).isEqualTo("abcde");
  }
}
