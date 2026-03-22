package com.one_year.slide_window;

import com.one_year.slide_window.MinSwapOnes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinSwapOnesTest {

    MinSwapOnes solution = new MinSwapOnes();

    @Test
    void basicCase() {
        // Best window [1,1,0] → 1 swap needed
        assertEquals(1, solution.getMinSwapOnes(new int[]{1, 0, 1, 1, 0}));
    }

    @Test
    void alreadyGrouped() {
        // 1s already together → 0 swaps
        assertEquals(0, solution.getMinSwapOnes(new int[]{0, 0, 1, 1, 1}));
    }

    @Test
    void noOnes() {
        // Nothing to group → 0 swaps
        assertEquals(0, solution.getMinSwapOnes(new int[]{0, 0, 0, 0}));
    }

    @Test
    void allOnes() {
        // Already all 1s → 0 swaps
        assertEquals(0, solution.getMinSwapOnes(new int[]{1, 1, 1, 1}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.getMinSwapOnes(new int[]{1}));
        assertEquals(0, solution.getMinSwapOnes(new int[]{0}));
    }
}