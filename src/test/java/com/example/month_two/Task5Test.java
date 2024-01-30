package com.example.month_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void numsSameConsecDiff() {
        assertArrayEquals(new int[]{181, 292, 707, 818, 929}, new Task5().numsSameConsecDiff(3, 7));
    }    }