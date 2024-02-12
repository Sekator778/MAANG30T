package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {
    //    Example 1:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    @Test
    void permute() {
        Task16 task16 = new Task16();
        int[] nums = {1, 2, 3};
        assertEquals(6, task16.permute(nums).size());
    }

    //Example 2:
//
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]
    @Test
    void permute2() {
        Task16 task16 = new Task16();
        int[] nums = {0, 1};
        assertEquals(2, task16.permute(nums).size());
    }

    //Example 3:
//
//Input: nums = [1]
//Output: [[1]]
    @Test
    void permute3() {
        Task16 task16 = new Task16();
        int[] nums = {1};
        assertEquals(1, task16.permute(nums).size());
    }
}