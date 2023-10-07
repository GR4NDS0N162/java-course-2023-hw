package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("00:00")
    void test1() {
        // given
        String duration = "00:00";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(0);
    }

    @Test
    @DisplayName("00:01")
    void test7() {
        // given
        String duration = "00:01";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(1);
    }

    @Test
    @DisplayName("00:27")
    void test2() {
        // given
        String duration = "00:27";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(27);
    }

    @Test
    @DisplayName("00:59")
    void test3() {
        // given
        String duration = "00:59";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(59);
    }

    @Test
    @DisplayName("01:00")
    void test9() {
        // given
        String duration = "01:00";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(60);
    }

    @Test
    @DisplayName("00:60")
    void test4() {
        // given
        String duration = "00:60";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("45:00")
    void test5() {
        // given
        String duration = "45:00";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(2700);
    }

    @Test
    @DisplayName("12:44")
    void test6() {
        // given
        String duration = "12:44";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(764);
    }

    @Test
    @DisplayName("9999:59")
    void test8() {
        // given
        String duration = "9999:59";

        // when
        int seconds = Task1.minutesToSeconds(duration);

        // then
        assertThat(seconds).isEqualTo(599999);
    }
}
