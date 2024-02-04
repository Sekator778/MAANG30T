package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lecture07Test {

    @Test
    void countGoodCombinationsBracket() {
        assertEquals(5, new Lecture07().countGoodCombinationsBracket(3));
    }
}