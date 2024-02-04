package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @Test
    void numsSameConsecDiff() {
        assertArrayEquals(new int[]{181, 292, 707, 818, 929}, new Task05().numsSameConsecDiff(3, 7));
    }    }