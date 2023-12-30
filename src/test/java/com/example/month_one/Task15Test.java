package com.example.month_one;

import com.example.month_one.task15.Task15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task15Test {

    //    Example 1:
//    Input: nums = [18,43,36,13,7]
//    Output: 54
//    Explanation: The pairs (i, j) that satisfy the conditions are:
//            - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
//            - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
//    So the maximum sum that we can obtain is 54.
    @Test
    void maximumSum() {
        int[] nums = {18, 43, 36, 13, 7};
        int expected = 54;
        int actual = new Task15().maximumSum(nums);
        assertEquals(expected, actual);
    }

    //    Example 2:
//    Input: nums = [10,12,19,14]
//    Output: -1
//    Explanation: There are no two numbers that satisfy the conditions, so we return -1.
    @Test
    void maximumSum2() {
        int[] nums = {10, 12, 19, 14};
        int expected = -1;
        int actual = new Task15().maximumSum(nums);
        assertEquals(expected, actual);
    }

    // Example 3:

}