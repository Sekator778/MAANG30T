package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2044Test {
    //Example 1:
//
//Input: nums = [3,1]
//Output: 2
//Explanation: The maximum possible bitwise OR of a subset is 3. There are 2 subsets with a bitwise OR of 3:
//- [3]
//- [3,1]
    @Test
    void test1() {
        int[] nums = {3, 1};
        int expected = 2;
        int actual = new Task2044().countMaxOrSubsets(nums);
        assertEquals(expected, actual);
    }

    //Example 2:
//
//Input: nums = [2,2,2]
//Output: 7
//Explanation: All non-empty subsets of [2,2,2] have a bitwise OR of 2. There are 23 - 1 = 7 total subsets.
    @Test
    void test2() {
        int[] nums = {2, 2, 2};
        int expected = 7;
        int actual = new Task2044().countMaxOrSubsets(nums);
        assertEquals(expected, actual);
    }

    //Example 3:
//
//Input: nums = [3,2,1,5]
//Output: 6
//Explanation: The maximum possible bitwise OR of a subset is 7. There are 6 subsets with a bitwise OR of 7:
//- [3,5]
//- [3,1,5]
//- [3,2,5]
//- [3,2,1,5]
//- [2,5]
//- [2,1,5]
    @Test
    void test3() {
        int[] nums = {3, 2, 1, 5};
        int expected = 6;
        int actual = new Task2044().countMaxOrSubsets(nums);
        assertEquals(expected, actual);
    }
}