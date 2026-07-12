package com.one_year.slide_window;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sekator
 * @created 10 Apr, 2026
 */
public class SubarrayswithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return 0;
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    int atMost(int[] nums, int k) {
        int left = 0;
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            freqMap.merge(nums[right], 1, Integer::sum);

            while (freqMap.size() > k) {
                freqMap.merge(nums[left], -1, Integer::sum);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
