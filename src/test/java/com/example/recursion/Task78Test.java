package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task78Test {
    //Example 1:
//
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    @Test
    void test1() {
        Task78 task78 = new Task78();
        int[] nums = {1, 2, 3};
        var result = task78.subsets(nums);
        assertEquals(8, result.size());
        assertEquals(0, result.get(0).size());
        assertEquals(1, result.get(1).size());
        assertEquals(2, result.get(2).size());
        assertEquals(3, result.get(3).size());
        assertEquals(2, result.get(4).size());
        assertEquals(1, result.get(5).size());
        assertEquals(2, result.get(6).size());
        assertEquals(1, result.get(7).size());
    }

    //Example 2:
//
//Input: nums = [0]
//Output: [[],[0]]
    @Test
    void test2() {
        Task78 task78 = new Task78();
        int[] nums = {0};
        var result = task78.subsets(nums);
        assertEquals(2, result.size());
        assertEquals(0, result.get(0).size());
        assertEquals(1, result.get(1).size());
    }
}