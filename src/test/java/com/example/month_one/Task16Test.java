package com.example.month_one;

import com.example.month_one.task16.Task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task16Test {

    //    Example 1:
//    Input: nums = [3,2,1,5,6,4], k = 2
//    Output: 5
    @Test
    void test1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        int actual = new Task16().findKthLargest(nums, k);
        assertEquals(expected, actual);
    }

    //    Example 2:
//    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//    Output: 4
    @Test
    void test2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        int actual = new Task16().findKthLargest(nums, k);
        assertEquals(expected, actual);
    }
}
