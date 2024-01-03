package com.example.month_one;

import com.example.month_one.task19.Task19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task19Test {

    //    Example 1:
//    Input: apples = [1,2,3,5,2], days = [3,2,1,4,2]
//    Output: 7
//    Explanation: You can eat 7 apples:
//            - On the first day, you eat an apple that grew on the first day.
//- On the second day, you eat an apple that grew on the second day.
//- On the third day, you eat an apple that grew on the second day. After this day, the apples that grew on the third day rot.
//- On the fourth to the seventh days, you eat apples that grew on the fourth day.
    @Test
    void test1() {
        Task19 task19 = new Task19();
        assertEquals(7, task19.eatenApples(new int[]{1, 2, 3, 5, 2}, new int[]{3, 2, 1, 4, 2}));
    }

    //    Example 2:
//    Input: apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
//    Output: 5
//    Explanation: You can eat 5 apples:
//            - On the first to the third day you eat apples that grew on the first day.
//            - Do nothing on the fouth and fifth days.
//            - On the sixth and seventh days you eat apples that grew on the sixth day.
    @Test
    void test2() {
        Task19 task19 = new Task19();
        assertEquals(5, task19.eatenApples(new int[]{3, 0, 0, 0, 0, 2}, new int[]{3, 0, 0, 0, 0, 2}));
    }
}