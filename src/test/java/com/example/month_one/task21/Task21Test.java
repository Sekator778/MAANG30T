package com.example.month_one.task21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task21Test {
    //    Example 1:
//
//Input: s = "bcabc"
    @Test
    void smallestSubsequence() {
        String s = "bcabc";
        String expected = "abc";
        String actual = new Task21().smallestSubsequence(s);
        assertEquals(expected, actual);
    }

    //Output: "abc"
//Example 2:
//
//Input: s = "cbacdcbc"
//Output: "acdb"
    @Test
    void smallestSubsequence2() {
        String s = "cbacdcbc";
        String expected = "acdb";
        String actual = new Task21().smallestSubsequence(s);
        assertEquals(expected, actual);
    }

    //    Example 3:
//
//Input: s = "cbacdcbc"
//Output: "acdb"
    @Test
    void smallestSubsequence3() {
        String s = "cbacdcbc";
        String expected = "acdb";
        String actual = new Task21().smallestSubsequence(s);
        assertEquals(expected, actual);
    }

}