package com.example.recursion;

public class Task2597 {
    public int beautifulSubsets(int[] nums, int k) {
        return getBeautifulSubset(new int[1001], 0, nums, k) - 1;
    }

    private int getBeautifulSubset(int[] candidate, int startIndex, int[] nums, int absDiff) {
        int count = 1;

        for (int i = startIndex; i < nums.length; i++) {
            int forbiddenNum = nums[i] - absDiff;
            if (forbiddenNum >= 0 && candidate[forbiddenNum] > 0) {
                continue;
            }
            forbiddenNum = absDiff + nums[i];
            if (forbiddenNum < candidate.length && candidate[forbiddenNum] > 0) {
                continue;
            }
            candidate[nums[i]] += 1;
            count += getBeautifulSubset(candidate, i + 1, nums, absDiff);
            candidate[nums[i]] -= 1;
        }
        return count;
    }
}
