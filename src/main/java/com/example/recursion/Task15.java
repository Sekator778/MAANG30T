package com.example.recursion;

public class Task15 {
    public int distributeCookies(int[] cookies, int k) {
        int[] min = new int[]{Integer.MAX_VALUE};
        getMinimalMax(new int[k], 0, cookies, min);
        return min[0];
    }

    void getMinimalMax(int[] subsetSums, int startIndex, int[] nums, int[] min) {
        if (startIndex == nums.length) {
            int max = subsetSums[0];
            for (int subsetSum : subsetSums) {
                max = Math.max(max, subsetSum);
            }
            min[0] = Math.min(min[0], max);
            return;
        }

        for (int i = 0; i < subsetSums.length; i++) {
            if (i > 0 && subsetSums[i - 1] == subsetSums[i]) {
                continue;
            }
            int num = nums[startIndex];

            subsetSums[i] += num;
            getMinimalMax(subsetSums, startIndex + 1, nums, min);
            subsetSums[i] -= num;
        }
    }
}
