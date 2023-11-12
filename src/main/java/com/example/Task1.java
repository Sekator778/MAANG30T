package com.example;

/**
 * Created by dn070578noi on 12.11.23.
 */
public class Task1 {

    public int getMinimumSwapCounts(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int onesCount = 0;
        // find size of the window
        for (int k : array) {
            if (k == 1) {
                onesCount += 1;
            }
        }
        int windowSize = onesCount;

        // look in the first window
        int windowOnesCount = 0;
        for (int i = 0; i < windowSize; i++) {
            if (array[i] == 1) {
                windowOnesCount += 1;
            }
        }
        // max = count in the first window
        int maxOnesCount = windowOnesCount;

        int windowStart = 1;
        int windowEnd = windowSize;
        // move window to the right
        while (windowEnd < array.length) {
            // if left element is 1 then decrease count
            if (array[windowStart - 1] == 1) {
                windowOnesCount -= 1;
            }
            // if right element is 1 then increase count
            if (array[windowEnd] == 1) {
                windowOnesCount += 1;
            }
            // update max
            maxOnesCount = Math.max(maxOnesCount, windowOnesCount);
            // move window to the right
            windowEnd += 1;
            windowStart += 1;
        }
        // return size of the window - max count of all windows
        return windowSize - maxOnesCount;
    }
}
