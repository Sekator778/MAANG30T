package com.example.month_one.task29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task29Test {
    //    Example 1:
//
//Input: nums = [3,1,4,1,5], k = 2
//Output: 2
//Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
//Although we have two 1s in the input, we should only return the number of unique pairs.
    @Test
    void test1() {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        int expected = 2;
        int actual = new Task29().findPairs(nums, k);
        assertEquals(expected, actual);
    }

    //Example 2:
//
//Input: nums = [1,2,3,4,5], k = 1
//Output: 4
//Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
    @Test
    void test2() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        int expected = 4;
        int actual = new Task29().findPairs(nums, k);
        assertEquals(expected, actual);
    }

    //Example 3:
//
//Input: nums = [1,3,1,5,4], k = 0
//Output: 1
//Explanation: There is one 0-diff pair in the array, (1, 1).
    @Test
    void test3() {
        int[] nums = {1, 3, 1, 5, 4};
        int k = 0;
        int expected = 1;
        int actual = new Task29().findPairs(nums, k);
        assertEquals(expected, actual);
    }

}