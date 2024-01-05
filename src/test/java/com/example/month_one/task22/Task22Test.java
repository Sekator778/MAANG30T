package com.example.month_one.task22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task22Test {
    //Example 1:
//
//Input: nums = [8,2,4,7], limit = 4
//Output: 2
//Explanation: All subarrays are:
//[8] with maximum absolute diff |8-8| = 0 <= 4.
//[8,2] with maximum absolute diff |8-2| = 6 > 4.
//[8,2,4] with maximum absolute diff |8-2| = 6 > 4.
//[8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
//[2] with maximum absolute diff |2-2| = 0 <= 4.
//[2,4] with maximum absolute diff |2-4| = 2 <= 4.
//[2,4,7] with maximum absolute diff |2-7| = 5 > 4.
//[4] with maximum absolute diff |4-4| = 0 <= 4.
//[4,7] with maximum absolute diff |4-7| = 3 <= 4.
//[7] with maximum absolute diff |7-7| = 0 <= 4.
//Therefore, the size of the longest subarray is 2.
    @Test
    void longestSubarray() {
        int[] nums = {8, 2, 4, 7};
        int limit = 4;
        int expected = 2;
        int actual = new Task22().longestSubarray(nums, limit);
        assertEquals(expected, actual);
    }

    //Example 2:
//
//Input: nums = [10,1,2,4,7,2], limit = 5
//Output: 4
//Explanation: The subarray [2,4,7,2] is the longest since the maximum absolute diff is |2-7| = 5 <= 5.
    @Test
    void longestSubarray2() {
        int[] nums = {10, 1, 2, 4, 7, 2};
        int limit = 5;
        int expected = 4;
        int actual = new Task22().longestSubarray(nums, limit);
        assertEquals(expected, actual);
    }

    //Example 3:
//
//Input: nums = [4,2,2,2,4,4,2,2], limit = 0
//Output: 3
    @Test
    void longestSubarray3() {
        int[] nums = {4, 2, 2, 2, 4, 4, 2, 2};
        int limit = 0;
        int expected = 3;
        int actual = new Task22().longestSubarray(nums, limit);
        assertEquals(expected, actual);
    }
}