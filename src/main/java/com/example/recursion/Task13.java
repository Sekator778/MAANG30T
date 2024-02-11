package com.example.recursion;

import java.util.Arrays;

public class Task13 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sumAllNums = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAllNums += nums[i];
        }
        if (sumAllNums % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        return partitionToSubset(new int[k], nums.length - 1, nums, sumAllNums / k);
    }

    private boolean partitionToSubset(int[] candidateSums, int startIndex, int[] nums, int targetSum) {
        if (startIndex == -1) {
            return true;
        }
        for (int i = 0; i < candidateSums.length; i++) {
            if (i > 0 && candidateSums[i - 1] == candidateSums[i]) { //decline repeated
                continue;
            }
            int num = nums[startIndex];
            if (candidateSums[i] + num > targetSum) {
                continue;
            }
            candidateSums[i] += num;
            if (partitionToSubset(candidateSums, startIndex - 1, nums, targetSum)) {
                return true;
            }
            candidateSums[i] -= num;
        }
        return false;
    }
}
