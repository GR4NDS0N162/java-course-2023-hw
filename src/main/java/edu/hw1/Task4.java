package edu.hw1;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String s) {
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i += 2) {
            char tmp = chars[i];
            chars[i] = chars[i - 1];
            chars[i - 1] = tmp;
        }

        return new String(chars);
    }
}
