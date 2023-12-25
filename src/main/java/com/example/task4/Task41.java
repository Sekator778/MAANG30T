package com.example.task4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task41 {

    public int getMaxSumUniqueSubArray(int[] nums) {
        Set<Integer> windowNums = new HashSet<>();
        int startWindow = 0;
        int endWindow = 0;
        int maxSum = 0;
        int currentSum = 0;
        while (endWindow < nums.length) {
            int endNum = nums[startWindow];
            if (!windowNums.contains(endNum)) {
                windowNums.add(endNum);
                currentSum += endNum;
                maxSum = Math.max(maxSum, currentSum);
            } else {
                while (true) {
                    int startNum = nums[startWindow];
                    startWindow += 1;
                    if (startNum == endNum) {
                        break;
                    }
                    windowNums.remove(startNum);
                    currentSum -= startNum;
                }
            }
            endWindow += 1;
        }
        return maxSum;
    }
}
