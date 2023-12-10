package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task13Test {

    //    Example 1:
//    Input: nums = [2,6,4,8,10,9,15]
//    Output: 5
//    Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
    @Test
    void test1() {
        int[] input = {2, 6, 4, 8, 10, 9, 15};
        int expected = 5;
        int actual = new Task13().findUnsortedSubarray(input);
        assertEquals(expected, actual);
    }

    //    Example 2:
//    Input: nums = [1,2,3,4]
//    Output: 0
    @Test
    void test2() {
        int[] input = {1, 2, 3, 4};
        int expected = 0;
        int actual = new Task13().findUnsortedSubarray(input);
        assertEquals(expected, actual);
    }

    //    Example 3:
//    Input: nums = [1]
//    Output: 0
    @Test
    void test3() {
        int[] input = {1};
        int expected = 0;
        int actual = new Task13().findUnsortedSubarray(input);
        assertEquals(expected, actual);
    }

    //    Example 4:
//    Input: nums =[1,5,3,2,4]
//    Output: 4
    @Test
    void test4() {
        int[] input = {1, 5, 3, 2, 4};
        int expected = 4;
        int actual = new Task13().findUnsortedSubarray(input);
        assertEquals(expected, actual);
    }
}