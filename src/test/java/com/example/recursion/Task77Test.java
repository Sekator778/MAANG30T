package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task77Test {
    //    Example 1:
//
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//Explanation: There are 4 choose 2 = 6 total combinations.
//Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
//Example 2:
    @Test
    void test1() {
        int n = 4;
        int k = 2;
        Task77 task = new Task77();
        assertEquals(6, task.combine(n, k).size());
    }

    //
//Input: n = 1, k = 1
//Output: [[1]]
//Explanation: There is 1 choose 1 = 1 total combination.
    @Test
    void test2() {
        int n = 1;
        int k = 1;
        Task77 task = new Task77();
        assertEquals(1, task.combine(n, k).size());
    }

}