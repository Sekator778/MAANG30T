package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void isWordPalindrome() {
        assertTrue(new Task4().isWordPalindrome("aba"));
    }

    @Test
    void isWordPalindrome2() {
        assertFalse(new Task4().isWordPalindrome("abac"));
    }

    @Test
    void isWordPalindrome3() {
        assertTrue(new Task4().isWordPalindrome("aaaaaaaaaa"));
    }

    @Test
    void isWordPalindrome4() {
        assertTrue(new Task4().isWordPalindrome("dcbabcd"));
    }
}