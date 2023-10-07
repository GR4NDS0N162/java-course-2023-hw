package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("3524")
    void test1() {
        // given
        int n = 3524;

        // when
        int count = Task6.countK(n);

        // then
        assertThat(count).isEqualTo(3);
    }

    @Test
    @DisplayName("6621")
    void test2() {
        // given
        int n = 6621;

        // when
        int count = Task6.countK(n);

        // then
        assertThat(count).isEqualTo(5);
    }

    @Test
    @DisplayName("6554")
    void test3() {
        // given
        int n = 6554;

        // when
        int count = Task6.countK(n);

        // then
        assertThat(count).isEqualTo(4);
    }

    @Test
    @DisplayName("1234")
    void test4() {
        // given
        int n = 1234;

        // when
        int count = Task6.countK(n);

        // then
        assertThat(count).isEqualTo(3);
    }
}
