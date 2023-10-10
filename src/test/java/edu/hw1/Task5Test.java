package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test @DisplayName("11211230") void test1() {
        // given
        int number = 11211230;

        // when
        boolean isPalindromeDescendant = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindromeDescendant).isEqualTo(true);
    }

    @Test @DisplayName("13001120") void test2() {
        // given
        int number = 13001120;

        // when
        boolean isPalindromeDescendant = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindromeDescendant).isEqualTo(true);
    }

    @Test @DisplayName("23336014") void test3() {
        // given
        int number = 23336014;

        // when
        boolean isPalindromeDescendant = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindromeDescendant).isEqualTo(true);
    }

    @Test @DisplayName("11") void test4() {
        // given
        int number = 11;

        // when
        boolean isPalindromeDescendant = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindromeDescendant).isEqualTo(true);
    }
}
