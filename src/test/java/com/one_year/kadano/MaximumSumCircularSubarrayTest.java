package com.one_year.kadano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sekator
 * @created 15 Mar, 2026
 */
class MaximumSumCircularSubarrayTest {
    MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();

    @Test
    void test() {
        int[] input = {1, -2, 3, -2};
        assertEquals(3, test.maxSubarraySumCircular(input));
    }


    @Test
    void tes2t() {
        int[] input = {5, -3, 5};
        assertEquals(10, test.maxSubarraySumCircular(input));
    }

    @Test
    void tes2() {
        int[] input = {-3, -2, -3};
        assertEquals(-2, test.maxSubarraySumCircular(input));
    }

}