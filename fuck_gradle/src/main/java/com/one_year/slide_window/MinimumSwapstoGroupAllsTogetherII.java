package com.one_year.slide_window;

/**
 * @author Sekator
 * @created 10 Apr, 2026
 */
public class MinimumSwapstoGroupAllsTogetherII {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
        }
        int left = 0;
        int onesInWindow = 0;
        int maxOnesInWindow = 0;
        for (int right = 0; right < nums.length + ones; right++) {
            if (nums[right % nums.length] == 1) {
                onesInWindow++;
            }
            if (right - left + 1 > ones) {
                if (nums[left] == 1) {
                    onesInWindow--;
                }
                left++;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, onesInWindow);
        }
        return ones - maxOnesInWindow;
    }
}
