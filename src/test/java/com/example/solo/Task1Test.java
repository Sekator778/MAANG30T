package com.example.solo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
//    Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    @Test
    void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Task1 task = new Task1();
        assertArrayEquals(new int[]{0, 1}, task.twoSum(nums, target));
    }
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
    @Test
    void test2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        Task1 task = new Task1();
        assertArrayEquals(new int[]{1, 2}, task.twoSum(nums, target));
    }
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
    @Test
    void test3() {
        int[] nums = {3, 3};
        int target = 6;
        Task1 task = new Task1();
        assertArrayEquals(new int[]{0, 1}, task.twoSum(nums, target));
    }
    //   Example 4:
//
//Input: nums = [0,4,3,0], target = 0
//Output: [0,3]
    @Test
    void test4() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        Task1 task = new Task1();
        assertArrayEquals(new int[]{0, 3}, task.twoSum(nums, target));
    }

}