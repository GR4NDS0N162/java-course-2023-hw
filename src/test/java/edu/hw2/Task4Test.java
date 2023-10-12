package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("test1")
    void test1() {
        // given
        String className = "edu.hw2.Task4Test";
        String methodName = "test1";

        // when
        CallingInfo callingInfo = Task4.callingInfo();

        // then
        assertThat(callingInfo).isEqualTo(new CallingInfo(className, methodName));
    }

    @Test
    @DisplayName("test112312321312312")
    void test112312321312312() {
        // given
        String className = "edu.hw2.Task4Test";
        String methodName = "test112312321312312";

        // when
        CallingInfo callingInfo = Task4.callingInfo();

        // then
        assertThat(callingInfo).isEqualTo(new CallingInfo(className, methodName));
    }
}
