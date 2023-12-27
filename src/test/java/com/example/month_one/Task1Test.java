package com.example.month_one;

import com.example.month_one.task1.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {
    private final Task1 task1 = new Task1();

    @Test
    void findMinimumSwapsWhenOneSwapNeed() {
        int[] input = {1, 0, 0, 1, 1};
        assertEquals(1, task1.getMinimumSwapCounts(input));
    }

    @Test
    void findMinimumSwapsWhenSomeSwapsNeed() {
        int[] input = {1, 0, 0, 1, 1, 0, 1, 0, 1};
        assertEquals(2, task1.getMinimumSwapCounts(input));
    }

    @Test
    void findZeroIfNoOnes() {
        int[] input = {0, 0, 0, 0, 0};
        assertEquals(0, task1.getMinimumSwapCounts(input));
    }

    @Test
    void findZeroIfNoZeros() {
        int[] input = {1, 1, 1, 1, 1};
        assertEquals(0, task1.getMinimumSwapCounts(input));
    }

    @Test
    void findZeroIfEmptyArray() {
        int[] input = {};
        assertEquals(0, task1.getMinimumSwapCounts(input));
    }

    @Test
    void findZeroIfNull() {
        assertEquals(0, task1.getMinimumSwapCounts(null));
    }

    @Test
    void findZeroIfOneElement() {
        int[] input = {1};
        assertEquals(0, task1.getMinimumSwapCounts(input));
    }

    @Test
    void findZeroIfTwoElements() {
        int[] input = {1, 1};
        assertEquals(0, task1.getMinimumSwapCounts(input));
    }

    @Test
    void testForLongArray() {
        int[] input = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1};
        assertEquals(4, task1.getMinimumSwapCounts(input));
    }

}