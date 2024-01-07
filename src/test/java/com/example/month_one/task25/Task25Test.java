package com.example.month_one.task25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task25Test {
    //    Example 1:
//
//Input: nums = [5,3,4,4,7,3,6,11,8,5,11]
//Output: 3
//Explanation: The following are the steps performed:
//- Step 1: [5,3,4,4,7,3,6,11,8,5,11] becomes [5,4,4,7,6,11,11]
//- Step 2: [5,4,4,7,6,11,11] becomes [5,4,7,11,11]
//- Step 3: [5,4,7,11,11] becomes [5,7,11,11]
//[5,7,11,11] is a non-decreasing array. Therefore, we return 3.
    @Test
    void totalSteps() {
        int[] nums = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        int expected = 3;
        int actual = new Task25().totalSteps(nums);
        assertEquals(expected, actual);
    }

    //Example 2:
//
//Input: nums = [4,5,7,7,13]
//Output: 0
//Explanation: nums is already a non-decreasing array. Therefore, we return 0.
    @Test
    void totalSteps2() {
        int[] nums = {4, 5, 7, 7, 13};
        int expected = 0;
        int actual = new Task25().totalSteps(nums);
        assertEquals(expected, actual);
    }

}