package com.example.month_one;

import com.example.month_one.task3.Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {
    @Test
    void getSubArrayCount() {
        int[] input = {1, 1, 2, 1, 1};
        Task3 task3 = new Task3();
        assertEquals(2, task3.getSubArrayCount(input, 3));
    }

    @Test
    void getSubArrayCount1() {
        int[] input = {2, 4, 6};
        Task3 task3 = new Task3();
        assertEquals(0, task3.getSubArrayCount(input, 1));
    }

    @Test
    void getSubArrayCount2() {
        int[] input = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        Task3 task3 = new Task3();
        assertEquals(16, task3.getSubArrayCount(input, 2));
    }

    @Test
    void getSubArrayCount3() {
        int[] input = {2, 1, 2, 2, 1, 2, 1, 2};
        Task3 task3 = new Task3();
        assertEquals(10, task3.getSubArrayCount(input, 2));
    }

    @Test
    void getSubArrayCount4() {
        int[] input = {1, 1, 1, 1};
        Task3 task3 = new Task3();
        assertEquals(1, task3.getSubArrayCount(input, 4));
    }

    @Test
    void getSubArrayCount5() {
        int[] input = {0, 0, 0, 0, 0};
        Task3 task3 = new Task3();
        assertEquals(0, task3.getSubArrayCount(input, 1));
    }

    @Test
    void getSubArrayCount6() {
        int[] input = {};
        Task3 task3 = new Task3();
        assertEquals(0, task3.getSubArrayCount(input, 1));
    }

    @Test
    void getSubArrayCount7() {
        int[] input = {1, 2, 3, 4, 5};
        Task3 task3 = new Task3();
        assertEquals(4, task3.getSubArrayCount(input, 2));
    }
}