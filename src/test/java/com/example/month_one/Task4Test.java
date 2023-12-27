package com.example.month_one;

import com.example.month_one.task4.Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Test {

        @Test
        void getMaxSumUniqueSubArray() {
            Task4 task4 = new Task4();
            int[] nums = {4, 2, 4, 5, 6};
            int maxSum = task4.getMaxSumUniqueSubArray(nums);
            assertEquals(17, maxSum);
        }

        @Test
        void getMaxSumUniqueSubArray2() {
            Task4 task4 = new Task4();
            int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
            int maxSum = task4.getMaxSumUniqueSubArray(nums);
            assertEquals(8, maxSum);
        }

        @Test
        void getMaxSumUniqueSubArray3() {
            Task4 task4 = new Task4();
            int[] nums = {};
            int maxSum = task4.getMaxSumUniqueSubArray(nums);
            assertEquals(0, maxSum);
        }

        @Test
        void getMaxSumUniqueSubArray4() {
            Task4 task4 = new Task4();
            int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1};
            int maxSum = task4.getMaxSumUniqueSubArray(nums);
            assertEquals(1, maxSum);
        }
}