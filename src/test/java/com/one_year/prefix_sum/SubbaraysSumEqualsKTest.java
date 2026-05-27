package com.one_year.prefix_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sekator
 * @created 04 May, 2026
 */
class SubbaraysSumEqualsKTest {
    SubArraysSumEqualsK task = new SubArraysSumEqualsK();

    @Test
    void test() {
        int[] input = {1,2,3};
        int k = 3;

        assertEquals(2, task.subarraySum(input, k));
    }
}