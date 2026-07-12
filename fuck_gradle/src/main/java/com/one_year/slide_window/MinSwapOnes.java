package com.one_year.slide_window;

/**
 * @author Sekator
 * @created 17 Mar, 2026
 */
public class MinSwapOnes {
    public int getMinSwapOnes(int[] arr) {

        int onesCount = 0;
        for (int num : arr) {
            if (num == 1) {
                onesCount += 1;
            }
        }
        int windowSize = onesCount;
        int onesCountInWindow = 0;

        for (int i = 0; i < windowSize; i++) {
            if (arr[i] == 1) {
                onesCountInWindow += 1;
            }
        }

        int maxOnesCount = onesCountInWindow;

        int windowStart = 1;
        int windowEnd = windowSize;

        while (windowEnd < arr.length) {
            if (arr[windowStart - 1] == 1) {
                onesCountInWindow -= 1;
            }
            if (arr[windowEnd] == 1) {
                onesCountInWindow += 1;
            }

            maxOnesCount = Math.max(maxOnesCount, onesCountInWindow);

            windowStart += 1;
            windowEnd += 1;
        }
        return windowSize - maxOnesCount;
    }
}
