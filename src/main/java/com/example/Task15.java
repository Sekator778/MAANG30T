package com.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 11.12.23.
 * нІКОЛАЙЧУК
 */
public class Task15 {
    public int maximumSum(int[] nums) {
        int DIGITAL_MAX_SUM = 81;
        int[] groupedNums = new int[DIGITAL_MAX_SUM + 1];
        Queue<Integer>[] queue = new PriorityQueue[DIGITAL_MAX_SUM + 1];
        queue[0] = new PriorityQueue<>(Comparator.reverseOrder());
        int maxSum = -1;

        for (int num : nums) {
            int digitalSum = getDigitSum(num);

            if (groupedNums[digitalSum] == 0) {
                groupedNums[digitalSum] = num;
            } else {
                int currentMaxSum = groupedNums[digitalSum];
                int maxSumCandidate = currentMaxSum + num;
                if (maxSumCandidate > maxSum) {
                    maxSum = maxSumCandidate;
                }
                if (num > currentMaxSum) {
                    groupedNums[digitalSum] = num;
                }
            }
        }
        return maxSum;
    }

    int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
