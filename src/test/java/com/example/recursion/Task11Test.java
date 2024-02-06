package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {
//    Example 1:
//
//    Input: digits = "23"
//    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    @Test
    void letterCombinations() {
        Task11 task = new Task11();
        assertEquals(9, task.letterCombinations("23").size());
    }
//    Example 2:
//
//    Input: digits = ""
//    Output: []
    @Test
    void letterCombinations2() {
        Task11 task = new Task11();
        assertEquals(0, task.letterCombinations("").size());
    }
//    Example 3:
//
//    Input: digits = "2"
//    Output: ["a","b","c"]
    @Test
    void letterCombinations3() {
        Task11 task = new Task11();
        assertEquals(3, task.letterCombinations("2").size());
    }

}