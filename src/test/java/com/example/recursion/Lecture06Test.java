package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lecture06Test {

    @Test
    void convertStringToCharArray() {
        String s = "abc";
        char[] expected = {'a', 'b', 'c'};
        assertArrayEquals(expected, new Lecture06().convertStringToCharArray(s));
    }
}