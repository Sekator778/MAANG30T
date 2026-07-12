package com.example.month_one.task2;

/**
 * Created by dn070578noi on 13.11.23.
 */
public class Task2 {

    public int getMinimumSwapCounts(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int windowSize = 0;
        // find size of the window
        for (int k : array) {
            if (k == 1) {
                windowSize += 1;
            }
        }
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
        // length of the circular array + window size
        int circularSize = array.length + windowSize;
        // move window to the right
        while (windowEnd < circularSize) {
            // if left element is 1 then decrease count
            if (array[windowStart - 1] == 1) {
                windowOnesCount -= 1;
            }
            // if right element is 1 then increase count
            // if windowEnd is out of array.length then get element from the beginning of the array
            // (windowEnd % array.length)
            if (array[windowEnd % array.length] == 1) {
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
