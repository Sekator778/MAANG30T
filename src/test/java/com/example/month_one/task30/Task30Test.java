package com.example.month_one.task30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task30Test {
    //Example 1:
//
//Input: nums = [3,5,2,4]
//Output: 2
//Explanation: In the first operation: pick i = 2 and j = 1, the operation is allowed because 2 * nums[2] <= nums[1]. Then mark index 2 and 1.
//It can be shown that there's no other valid operation so the answer is 2.
    @Test
    void test1() {
        int[] nums = {3, 5, 2, 4};
        int expected = 2;
        int actual = new Task30().maxNumOfMarkedIndices(nums);
        assertEquals(expected, actual);
    }

    //Example 2:
//
//Input: nums = [9,2,5,4]
//Output: 4
//Explanation: In the first operation: pick i = 3 and j = 0, the operation is allowed because 2 * nums[3] <= nums[0]. Then mark index 3 and 0.
//In the second operation: pick i = 1 and j = 2, the operation is allowed because 2 * nums[1] <= nums[2]. Then mark index 1 and 2.
//Since there is no other operation, the answer is 4.
    @Test
    void test2() {
        int[] nums = {9, 2, 5, 4};
        int expected = 4;
        int actual = new Task30().maxNumOfMarkedIndices(nums);
        assertEquals(expected, actual);
    }

    //Example 3:
//
//Input: nums = [7,6,8]
//Output: 0
//Explanation: There is no valid operation to do, so the answer is 0.
    @Test
    void test3() {
        int[] nums = {7, 6, 8};
        int expected = 0;
        int actual = new Task30().maxNumOfMarkedIndices(nums);
        assertEquals(expected, actual);
    }
}