package com.example;

/**
 * Created by dn070578noi on 11.12.23.
 */
public class Task15 {
    public int maximumSum(int[] nums) {
        int DIGITAL_MAX_SUM = 81;
        int[] groupedNums = new int[DIGITAL_MAX_SUM + 1];
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
