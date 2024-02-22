package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2597Test {
//    Example 1:
//
//Input: nums = [2,4,6], k = 2
//Output: 4
//Explanation: The beautiful subsets of the array nums are: [2], [4], [6], [2, 6].
//It can be proved that there are only 4 beautiful subsets in the array [2,4,6].
    @Test
    void beautifulSubsets() {
        int[] nums = {2, 4, 6};
        int k = 2;
        int expected = 4;
        int actual = new Task2597().beautifulSubsets(nums, k);
        assertEquals(expected, actual);
    }
//Example 2:
//
//Input: nums = [1], k = 1
//Output: 1
//Explanation: The beautiful subset of the array nums is [1].
//It can be proved that there is only 1 beautiful subset in the array [1].
    @Test
    void beautifulSubsets2() {
        int[] nums = {1};
        int k = 1;
        int expected = 1;
        int actual = new Task2597().beautifulSubsets(nums, k);
        assertEquals(expected, actual);
    }

}