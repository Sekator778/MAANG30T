package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task08Test {
//    Example 1:
//
//    Input: nums = [1,1,1,1,1], target = 3
//    Output: 5
//    Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
//            -1 + 1 + 1 + 1 + 1 = 3
//            +1 - 1 + 1 + 1 + 1 = 3
//            +1 + 1 - 1 + 1 + 1 = 3
//            +1 + 1 + 1 - 1 + 1 = 3
//            +1 + 1 + 1 + 1 - 1 = 3
    @Test
    void findTargetSumWays() {
        Task08 task08 = new Task08();
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        assertEquals(5, task08.findTargetSumWays(nums, target));
    }

//    Example 2:
//
//    Input: nums = [1], target = 1
//    Output: 1
    @Test
    void findTargetSumWays2() {
        Task08 task08 = new Task08();
        int[] nums = {1};
        int target = 1;
        assertEquals(1, task08.findTargetSumWays(nums, target));
    }
}