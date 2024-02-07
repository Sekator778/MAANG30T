package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {
    //    Example 1:
//    Input: matchsticks = [1,1,2,2,2]
//Output: true
//Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
    @Test
    void makesquare() {
        int[] matchsticks = {1, 1, 2, 2, 2};
        assertTrue(new Task12().makesquare(matchsticks));
    }

    //Example 2:
//
//Input: matchsticks = [3,3,3,3,4]
//Output: false
//Explanation: You cannot find a way to form a square with all the matchsticks.
    @Test
    void makesquare2() {
        int[] matchsticks = {3, 3, 3, 3, 4};
        assertFalse(new Task12().makesquare(matchsticks));
    }
    }