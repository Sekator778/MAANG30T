package com.example.month_one.task28;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dn070578noi on 09.01.24.
 */
public class Task28 {
    public int findPairs(int[] nums, int k) {
        int arrLength = nums.length;
        Map<Integer, Integer> numToIndex = new HashMap<>(arrLength);
        for (int i = 0; i < arrLength; i++) {
            numToIndex.put(nums[i], i);
        }
        int pairsCount = 0;
        for (int i = 0; i < arrLength; i++) {
            int currentSum = nums[i] + k;
            if (numToIndex.containsKey(currentSum) && numToIndex.get(currentSum) != i) {
                pairsCount += 1;
                numToIndex.remove(currentSum);
            }
        }
        return pairsCount;
    }
}
