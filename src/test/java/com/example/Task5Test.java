package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task5Test {

    @Test
    void numberOfSubstrings() {
        Task5 task5 = new Task5();
        String s = "abcabc";
        int numberOfSubstrings = task5.numberOfSubstrings(s);
        assertEquals(10, numberOfSubstrings);
    }

    @Test
    void numberOfSubstrings2() {
        Task5 task5 = new Task5();
        String s = "aaacb";
        int numberOfSubstrings = task5.numberOfSubstrings(s);
        assertEquals(3, numberOfSubstrings);
    }

    @Test
    void numberOfSubstrings3() {
        Task5 task5 = new Task5();
        String s = "abc";
        int numberOfSubstrings = task5.numberOfSubstrings(s);
        assertEquals(1, numberOfSubstrings);
    }

    @Test
    void numberOfSubstrings4() {
        Task5 task5 = new Task5();
        String s = "abaa";
        int numberOfSubstrings = task5.numberOfSubstrings(s);
        assertEquals(0, numberOfSubstrings);
    }

    @Test
    void numberOfSubstrings5() {
        Task5 task5 = new Task5();
        String s = "ababbbc";
        int numberOfSubstrings = task5.numberOfSubstrings(s);
        assertEquals(3, numberOfSubstrings);
    }

    @Test
    void numberOfSubstrings6() {
        Task5 task5 = new Task5();
        String s = "aaabbb";
        int numberOfSubstrings = task5.numberOfSubstrings(s);
        assertEquals(0, numberOfSubstrings);
    }

    @Test
    void numberOfSubstrings7() {
        Task5 task5 = new Task5();
        String s = "";
        assertEquals(0, task5.numberOfSubstrings(s));
    }
}