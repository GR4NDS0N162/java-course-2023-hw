package edu.hw2;

import edu.hw2.task4.CallingInfo;

public class Task4 {
    private Task4() {
    }

    public static CallingInfo callingInfo() {
        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            StackTraceElement[] elements = throwable.getStackTrace();
            StackTraceElement e = elements[1];
            return new CallingInfo(e.getClassName(), e.getMethodName());
        }
    }
}
