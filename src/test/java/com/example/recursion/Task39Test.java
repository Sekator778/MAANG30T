package com.example.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {
    //    Example 1:
//
//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.
    @Test
    void combinationSum() {
        Task39 task39 = new Task39();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = task39.combinationSum(candidates, target);
        assertEquals(2, result.size());
        assertEquals(List.of(2, 2, 3), result.get(0));
        assertEquals(List.of(7), result.get(1));

    }

    //Example 2:
//
//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]
    @Test
    void combinationSum2() {
        Task39 task39 = new Task39();
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> result = task39.combinationSum(candidates, target);
        assertEquals(3, result.size());
        assertEquals(List.of(2, 2, 2, 2), result.get(0));
        assertEquals(List.of(2, 3, 3), result.get(1));
        assertEquals(List.of(3, 5), result.get(2));
    }

    //Example 3:
//
//Input: candidates = [2], target = 1
//Output: []
    @Test
    void combinationSum3() {
        Task39 task39 = new Task39();
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> result = task39.combinationSum(candidates, target);
        assertEquals(0, result.size());
    }

}