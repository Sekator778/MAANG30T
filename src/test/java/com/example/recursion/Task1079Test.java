package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1079Test {
    //    Example 1:
//
//Input: tiles = "AAB"
//Output: 8
//Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
    @Test
    void numTilePossibilities() {
        Task1079 task1079 = new Task1079();
        assertEquals(8, task1079.numTilePossibilities("AAB"));
    }

    //Example 2:
//
//Input: tiles = "AAABBC"
//Output: 188
    @Test
    void numTilePossibilities2() {
        Task1079 task1079 = new Task1079();
        assertEquals(188, task1079.numTilePossibilities("AAABBC"));
    }

    //Example 3:
//
//Input: tiles = "V"
//Output: 1
    @Test
    void numTilePossibilities3() {
        Task1079 task1079 = new Task1079();
        assertEquals(1, task1079.numTilePossibilities("V"));
    }

}