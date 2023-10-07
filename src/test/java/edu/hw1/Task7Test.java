package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("rotateRight")
    void test1() {
        // given
        int n = 8;
        int shift = 1;

        // when
        int result = Task7.rotateRight(n, shift);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("rotateLeft")
    void test2() {
        // given
        int n = 16;
        int shift = 1;

        // when
        int result = Task7.rotateLeft(n, shift);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("rotateLeft")
    void test3() {
        // given
        int n = 17;
        int shift = 2;

        // when
        int result = Task7.rotateLeft(n, shift);

        // then
        assertThat(result).isEqualTo(6);
    }
}
