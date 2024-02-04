package com.example.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task03Test {

    @Test
    void findTransforms() {
        String word = "a1b2";
        Task03 task03 = new Task03();
        assertEquals(4, task03.letterCasePermutation(word).size());
    }

    //    Example 1:
//
//    Input: s = "a1b2"
//    Output: ["a1b2","a1B2","A1b2","A1B2"]
//    Example 2:
    @Test
    void findTransforms2() {
        String word = "a1b2";
        List<String> expect = List.of("a1b2", "a1B2", "A1b2", "A1B2");
        Task03 task03 = new Task03();
        assertEquals(expect, task03.letterCasePermutation(word));
    }

    //    Input: s = "3z4"
//    Output: ["3z4","3Z4"]
//    Example 3:
    @Test
    void findTransforms4() {
        String word = "3z4";
        List<String> expect = List.of("3z4", "3Z4");
        Task03 task03 = new Task03();
        assertEquals(expect, task03.letterCasePermutation(word));
    }

    @Test
    void letterCasePermutation2() {
        String word = "a1b2";
        List<String> expect = List.of("a1b2", "a1B2", "A1b2", "A1B2");
        Task03 task03 = new Task03();
        assertEquals(expect, task03.letterCasePermutation2(word));
    }

    @Test
    void letterCasePermutation3() {
        String word = "3z4";
        List<String> expect = List.of("3z4", "3Z4");
        Task03 task03 = new Task03();
        assertEquals(expect, task03.letterCasePermutation2(word));
    }
}