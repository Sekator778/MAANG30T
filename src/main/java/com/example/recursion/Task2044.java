package com.example.recursion;

public class Task2044 {
    public int countMaxOrSubsets(int[] nums) {
        int maxORsValue = 0;
        for (int num : nums) {
            maxORsValue |= num;
        }
        return getMaxORsValueCount(0, 0, nums, maxORsValue);
    }

    private int getMaxORsValueCount(int candidate, int startIndex, int[] nums, int maxORsValue) {
        int count = 0;
        if (candidate == maxORsValue) {
            count += 1;
        }

        for (int i = startIndex; i < nums.length; i++) {
            count += getMaxORsValueCount(candidate | nums[i], i + 1, nums, maxORsValue);
        }
        return count;
    }
}
