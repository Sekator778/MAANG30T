package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1718Test {
    //    Example 1:
//
//Input: n = 3
//Output: [3,1,2,3,2]
//Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
    @Test
    void test1() {
        int n = 3;
        int[] expected = {3, 1, 2, 3, 2};
        assertArrayEquals(expected, new Task1718().constructDistancedSequence(n));
    }

    //Example 2:
//
//Input: n = 5
//Output: [5,3,1,4,3,5,2,4,2]
    @Test
    void test2() {
        int n = 5;
        int[] expected = {5, 3, 1, 4, 3, 5, 2, 4, 2};
        assertArrayEquals(expected, new Task1718().constructDistancedSequence(n));
    }

}