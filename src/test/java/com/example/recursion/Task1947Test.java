package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1947Test {
    //    Example 1:
//
//Input: students = [[1,1,0],[1,0,1],[0,0,1]], mentors = [[1,0,0],[0,0,1],[1,1,0]]
//Output: 8
//Explanation: We assign students to mentors in the following way:
//- student 0 to mentor 2 with a compatibility score of 3.
//- student 1 to mentor 0 with a compatibility score of 2.
//- student 2 to mentor 1 with a compatibility score of 3.
//The compatibility score sum is 3 + 2 + 3 = 8.
    @Test
    void maxCompatibilitySum() {
        int[][] students = {{1, 1, 0}, {1, 0, 1}, {0, 0, 1}};
        int[][] mentors = {{1, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        int expected = 8;
        int actual = new Task1947().maxCompatibilitySum(students, mentors);
        assertEquals(expected, actual);
    }

    //Example 2:
//
//Input: students = [[0,0],[0,0],[0,0]], mentors = [[1,1],[1,1],[1,1]]
//Output: 0
//Explanation: The compatibility score of any student-mentor pair is 0.
    @Test
    void maxCompatibilitySum2() {
        int[][] students = {{0, 0}, {0, 0}, {0, 0}};
        int[][] mentors = {{1, 1}, {1, 1}, {1, 1}};
        int expected = 0;
        int actual = new Task1947().maxCompatibilitySum(students, mentors);
        assertEquals(expected, actual);
    }

}