package com.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task4 {

    public int getMaxSumUniqueSubArray(int[] nums) {
        Set<Integer> windowsNums = new HashSet<>();
        int windowStart = 0;
        int windowEnd = 0;
        int maxSum = 0;
        int currentSum = 0;

        while (windowEnd < nums.length) {
            int endNum = nums[windowEnd];
            if (!windowsNums.contains(endNum)) {
                windowsNums.add(endNum);
                currentSum += endNum;
                maxSum = Math.max(maxSum, currentSum);
            } else {
                while (true) {
                    int startNum = nums[windowStart];
                    windowStart += 1;
                    if (startNum == endNum) {
                        break;
                    }
                    windowsNums.remove(startNum);
                    currentSum -= startNum;
                }
            }
            windowEnd += 1;
        }
        return maxSum;
    }
}
