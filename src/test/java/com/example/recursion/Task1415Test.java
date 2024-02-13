package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1415Test {
    //    Example 1:
//
//Input: n = 1, k = 3
//Output: "c"
//Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
    @Test
    void getHappyString() {
        Task1415 task1415 = new Task1415();
        assertEquals("c", task1415.getHappyString(1, 3));
    }

    //Example 2:
//
//Input: n = 1, k = 4
//Output: ""
//Explanation: There are only 3 happy strings of length 1.
    @Test
    void getHappyString2() {
        Task1415 task1415 = new Task1415();
        assertEquals("", task1415.getHappyString(1, 4));
    }

    //Example 3:
//
//Input: n = 3, k = 9
//Output: "cab"
//Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"
    @Test
    void getHappyString3() {
        Task1415 task1415 = new Task1415();
        assertEquals("cab", task1415.getHappyString(3, 9));
    }
}