package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {
//    tasks = [1]
//    sessionTime = 2
//    Expected 1
    @Test
    void minSessions1() {
        int[] tasks = {1};
        int sessionTime = 2;
        int expected = 1;
        int result = new Task14().minSessions(tasks, sessionTime);
        assertEquals(expected, result);
    }

//    tasks =[1,7]
//    sessionTime = 7
//    Expected 2
    @Test
    void minSessions2() {
        int[] tasks = {1, 7};
        int sessionTime = 7;
        int expected = 2;
        int result = new Task14().minSessions(tasks, sessionTime);
        assertEquals(expected, result);
    }



}