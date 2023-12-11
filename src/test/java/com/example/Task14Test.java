package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task14Test {

    //    Example 1:
//    Input: arr = [4,3,2,1,0]
//    Output: 1
//    Explanation:
//    Splitting into two or more chunks will not return the required result.
//    For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.
    @Test
    void test1() {
        int[] input = {4, 3, 2, 1, 0};
        int expected = 1;
        int actual = new Task14().maxChunksToSorted(input);
        assertEquals(expected, actual);
    }
//    Example 2:
//    Input: arr = [1,0,2,3,4]
//    Output: 4
//    Explanation:
//    We can split into two chunks, such as [1, 0], [2, 3, 4].
//    However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.

    @Test
    void test2() {
        int[] input = {1, 0, 2, 3, 4};
        int expected = 4;
        int actual = new Task14().maxChunksToSorted(input);
        assertEquals(expected, actual);
    }

    //    Example 3:
//    Input: arr = [1,2,0,3]
//    Output: 2
//    Explanation:
//    Splitting into two chunks, such as [1, 2], [0, 3], is the highest number of chunks possible.
    @Test
    void test3() {
        int[] input = {1, 2, 0, 3};
        int expected = 2;
        int actual = new Task14().maxChunksToSorted(input);
        assertEquals(expected, actual);
    }
}