package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {
    @Test
    void getArrangements() {
        Task19 task19 = new Task19();
        int[] nums = {1, 2, 3};
        assertEquals(6, task19.getArrangements(nums, 3).size());
    }

    @Test
    void getArrangements2() {
        Task19 task19 = new Task19();
        int[] nums = {1, 2, 3, 4};
        assertEquals(24, task19.getArrangements(nums, 4).size());
    }

    @Test
    void getArrangements3() {
        Task19 task19 = new Task19();
        int[] nums = {1, 2, 3};
        assertEquals(6, task19.getArrangements(nums, 2).size());
    }

}