package com.example.month_one.task30;

import java.util.Arrays;

/**
 * Created by dn070578noi on 09.01.24.
 * <p>
 * num[i] * 2 <= nums[j]
 */
public class Task30 {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int leftIndex = 0;
        int length = nums.length;
        int middleIndex = length / 2;
        int rightIndex = middleIndex;
        int countIndexes = 0;
        while (rightIndex < length) {
            if (leftIndex == middleIndex) break;
            if (nums[leftIndex] * 2 <= nums[rightIndex]) {
                countIndexes += 2;
                leftIndex += 1;
            }
            rightIndex += 1;
        }
        return countIndexes;
    }
}
