package com.example.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task216Test {
    //    Example 1:
//
//Input: k = 3, n = 7
//Output: [[1,2,4]]
//Explanation:
//1 + 2 + 4 = 7
//There are no other valid combinations.
    @Test
    void combinationSum3_1() {
        Task216 task216 = new Task216();
        int k = 3;
        int n = 7;
        List<List<Integer>> result = task216.combinationSum3(k, n);
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2, 4), result.get(0));
    }

    //Example 2:
//
//Input: k = 3, n = 9
//Output: [[1,2,6],[1,3,5],[2,3,4]]
//Explanation:
//1 + 2 + 6 = 9
//1 + 3 + 5 = 9
//2 + 3 + 4 = 9
//There are no other valid combinations.
    @Test
    void combinationSum3_2() {
        Task216 task216 = new Task216();
        int k = 3;
        int n = 9;
        List<List<Integer>> result = task216.combinationSum3(k, n);
        assertEquals(3, result.size());
        assertTrue(result.contains(List.of(1, 2, 6)));
        assertTrue(result.contains(List.of(1, 3, 5)));
        assertTrue(result.contains(List.of(2, 3, 4)));
    }

    //Example 3:
//
//Input: k = 4, n = 1
//Output: []
//Explanation: There are no valid combinations.
//Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
    @Test
    void combinationSum3_3() {
        Task216 task216 = new Task216();
        int k = 4;
        int n = 1;
        List<List<Integer>> result = task216.combinationSum3(k, n);
        assertEquals(0, result.size());
    }

}