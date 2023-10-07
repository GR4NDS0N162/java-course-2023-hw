package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("Positive")
    void test1() {
        // given
        int[] a1 = new int[] {1, 2, 3, 4};
        int[] a2 = new int[] {0, 6};

        // when
        boolean isNestable = Task3.isNestable(a1, a2);

        // then
        assertThat(isNestable).isEqualTo(true);
    }

    @Test
    @DisplayName("Positive")
    void test2() {
        // given
        int[] a1 = new int[] {3, 1};
        int[] a2 = new int[] {4, 0};

        // when
        boolean isNestable = Task3.isNestable(a1, a2);

        // then
        assertThat(isNestable).isEqualTo(true);
    }

    @Test
    @DisplayName("Negative")
    void test3() {
        // given
        int[] a1 = new int[] {9, 9, 8};
        int[] a2 = new int[] {8, 9};

        // when
        boolean isNestable = Task3.isNestable(a1, a2);

        // then
        assertThat(isNestable).isEqualTo(false);
    }

    @Test
    @DisplayName("Negative")
    void test4() {
        // given
        int[] a1 = new int[] {1, 2, 3, 4};
        int[] a2 = new int[] {2, 3};

        // when
        boolean isNestable = Task3.isNestable(a1, a2);

        // then
        assertThat(isNestable).isEqualTo(false);
    }
}
