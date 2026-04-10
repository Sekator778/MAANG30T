package com.one_year.two_pointer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sekator
 * @created 10 Apr, 2026
 */
class TreeSumIIITest {
    TreeSumIII task = new TreeSumIII();

    @Test
    void test1() {
        int[] input = new int[]{-2, 0, 0, 2, 2};
        List<List<Integer>> expect = List.of(
                Arrays.asList(-2, 0, 2)
        );
        List<List<Integer>> actual = task.threeSum(input);

        assertEquals(expect, actual);
    }

}