package com.example;

/**
 * Created by dn070578noi on 19.11.23.
 */
public class Task3 {

    public int getSubArrayCount(int[] array, int oddNumsNotInWindowCount) {
        int subArrayCount = 0; // count of sub arrays
        int windowStart = 0; // start of the window
        int windowEnd = 0; // end of the window
        int leftEvenNumsCount = 0; // count of even numbers in the left part of the window
        // move window to the right
        while (windowEnd < array.length) {
            // if current element is odd then decrease count
            if (isOdd(array[windowEnd])) {
                oddNumsNotInWindowCount -= 1;
                leftEvenNumsCount = 0;
            }

            if (oddNumsNotInWindowCount == 0) {
                while (true) {
                    if (isOdd(array[windowStart])) {
                        oddNumsNotInWindowCount = 1;
                        windowStart += 1;
                        leftEvenNumsCount += 1;
                        break;
                    }
                    windowStart += 1;
                    leftEvenNumsCount += 1;
                }
            }
            subArrayCount += leftEvenNumsCount;
            windowEnd += 1;
        }
        return subArrayCount;
    }

    private boolean isOdd(int i) {
        return i % 2 != 0;
    }
}
