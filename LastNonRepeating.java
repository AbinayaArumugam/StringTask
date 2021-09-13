package com.string;

public class LastNonRepeating {
    final static int NO_OF_CHAR = 256;

    public static String findLastNonRepeating(String str) {
        int[] count = new int[NO_OF_CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                return (" " + ch);
            }
        }
        return "-1";
    }
}