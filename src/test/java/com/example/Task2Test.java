package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    //    test if the array is null
    @Test
    void getMinimumSwapCounts() {
        int[] input = {1, 0, 0, 1, 1};
        Task2 task2 = new Task2();
        assertEquals(0, task2.getMinimumSwapCounts(input));
    }

    @Test
    void getMinimumSwapCounts1() {
        int[] input = {1, 0, 0, 1, 0};
        Task2 task2 = new Task2();
        assertEquals(1, task2.getMinimumSwapCounts(input));
    }

    @Test
    void getMinimumSwapCounts2() {
        int[] input = {1, 0, 0, 1, 0, 1, 0, 1};
        Task2 task2 = new Task2();
        assertEquals(1, task2.getMinimumSwapCounts(input));
    }

    @Test
    void getMinimumSwapCounts3() {
        int[] input = {1, 0, 0, 1, 0, 1, 0, 1, 0};
        Task2 task2 = new Task2();
        assertEquals(2, task2.getMinimumSwapCounts(input));
    }

    @Test
    void getMinimumSwapCounts4() {
        int[] input = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1};
        Task2 task2 = new Task2();
        assertEquals(2, task2.getMinimumSwapCounts(input));
    }

}