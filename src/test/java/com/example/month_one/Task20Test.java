package com.example.month_one;

import com.example.Task20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task20Test {
    //    Input: events = [[1,2],[2,3],[3,4]]
//    Output: 3
//    Explanation: You can attend all the three events.
//    One way to attend them all is as shown.
//    Attend the first event on day 1.
//    Attend the second event on day 2.
//    Attend the third event on day 3.
    @Test
    void test1() {
        int[][] events = {{1, 2}, {2, 3}, {3, 4}};
        int expected = 3;
        int actual = new Task20().maxEvents(events);
        assertEquals(expected, actual);
    }

    //    Example 2:
//    Input: events= [[1,2],[2,3],[3,4],[1,2]]
//    Output: 4
    @Test
    void test2() {
        int[][] events = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        int expected = 4;
        int actual = new Task20().maxEvents(events);
        assertEquals(expected, actual);
    }

}