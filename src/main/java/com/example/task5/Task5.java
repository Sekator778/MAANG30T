package com.example.task5;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task5 {

    public int numberOfSubstrings(String s) {
        int[] lettersCountInWindow = new int[]{0, 0, 0};
        int substringCount = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int length = s.length();

        while (windowEnd < length) {
            int endLetterIndex = s.charAt(windowEnd) - 'a';
            lettersCountInWindow[endLetterIndex] += 1;

            while (true) {
                if (!isValidWindow(lettersCountInWindow)) {
                    break;
                }
                substringCount += getReminingSubstringsCount(windowEnd, length);

                int startLetterIndex = s.charAt(windowStart) - 'a';
                windowStart += 1;
                lettersCountInWindow[startLetterIndex] -= 1;
            }

            windowEnd += 1;
        }
        return substringCount;
    }

    private int getReminingSubstringsCount(int windowEnd, int length) {
        return 1 + length - (windowEnd + 1);
    }

    private boolean isValidWindow(int[] lettersCountInWindow) {
        return lettersCountInWindow[0] > 0 &&
                lettersCountInWindow[1] > 0 &&
                lettersCountInWindow[2] > 0;
    }
}
