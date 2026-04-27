package com.one_year.two_pointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author Sekator
 * @created 17 Apr, 2026
 */
class MoveZeroesTest {

    MoveZeroes task = new MoveZeroes();

    @Test
    void test1() {
        int[] input = {0, 1, 0, 3, 12};
        task.moveZeroes(input);

        assertEquals(1, input[0]);
    }
}