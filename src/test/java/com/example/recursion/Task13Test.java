package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    //    Example 1:
//
//Input: nums = [4,3,2,3,5,2,1], k = 4
//Output: true
//Explanation: It is possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
    @Test
    void canPartitionKSubsets() {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        assertTrue(new Task13().canPartitionKSubsets(nums, k));
    }

    //Example 2:
//
//Input: nums = [1,2,3,4], k = 3
//Output: false
    @Test
    void canPartitionKSubsets2() {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        assertFalse(new Task13().canPartitionKSubsets(nums, k));
    }
}