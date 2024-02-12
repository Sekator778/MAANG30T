package com.example.recursion.doc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lecture11Test {
//    Example 1
    // input: "abc"
    // output: ["abc", "acb", "bac", "bca", "cab", "cba"]
    @Test
    void collectAllPermutation() {
        Lecture11 lecture11 = new Lecture11();
        assertEquals(6, lecture11.collectAllPermutation("abc").size());
    }

    //    Example 2
    // input: "ab"
    // output: ["ab", ba"]
    @Test
    void collectAllPermutation2() {
        Lecture11 lecture11 = new Lecture11();
        assertEquals(2, lecture11.collectAllPermutation("ab").size());
    }

}