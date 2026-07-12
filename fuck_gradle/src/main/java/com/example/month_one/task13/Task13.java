package com.example.month_one.task13;

/**
 * Created by dn070578noi on 10.12.23.
 */
public class Task13 {
    public int findUnsortedSubarray(int[] nums) {
        int leftLastIndex = getLeftSubArrayLastIndex(nums);
        if (leftLastIndex == -1) {
            return 0;
        }
        int rightFirstIndex = getRightSubArrayFirstIndex(nums);
        int max = nums[leftLastIndex];
        int min = nums[rightFirstIndex];

        for (int i = leftLastIndex + 1; i < rightFirstIndex; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int start = getSubArrayStartIndex(nums, min, leftLastIndex);
        int end = gerSubArrayEndIndex(nums, max, rightFirstIndex);
        return end - start + 1;
    }

    int getSubArrayStartIndex(int[] array, int min, int leftLastIndex) {
        for (int i = 0; i < leftLastIndex; i++) {
            if (min < array[i]) {
                return i;
            }
        }
        return leftLastIndex;
    }

    int gerSubArrayEndIndex(int[] array, int max, int rightFirstIndex) {
        for (int i = rightFirstIndex; i < array.length; i++) {
            if (max <= array[i]) {
                return i - 1;
            }
        }
        return array.length - 1;
    }

    int getLeftSubArrayLastIndex(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return i - 1;
            }
        }
        return -1;
    }

    int getRightSubArrayFirstIndex(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i - 1] > array[i]) {
                return i;
            }
        }
        return -1;
    }
}
