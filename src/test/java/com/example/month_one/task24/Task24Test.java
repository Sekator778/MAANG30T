package com.example.month_one.task24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task24Test {
    //    Example 1:
//
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                new Task24().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    //Example 2:
//
//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
    @Test
    void test2() {
        assertArrayEquals(new int[]{1, 1, 1, 0},
                new Task24().dailyTemperatures(new int[]{30, 40, 50, 60}));
    }

    //Example 3:
//
//Input: temperatures = [30,60,90]
//Output: [1,1,0]
    @Test
    void test3() {
        assertArrayEquals(new int[]{1, 1, 0},
                new Task24().dailyTemperatures(new int[]{30, 60, 90}));
    }
}