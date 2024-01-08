package com.example.month_one;

import com.example.month_one.task27.Task27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class task27Test {
    //    Example 1:
//
//Input: s = "][]["
//Output: 1
//Explanation: You can make the string balanced by swapping index 0 with index 3.
//The resulting string is "[[]]".
    @Test
    void minSwaps() {
        Task27 test = new Task27();
        assertEquals(1, test.minSwaps("][]["));
    }

    //Example 2:
//
//Input: s = "]]][[["
//Output: 2
//Explanation: You can do the following to make the string balanced:
//- Swap index 0 with index 4. s = "[]][][".
//- Swap index 1 with index 5. s = "[[][]]".
//The resulting string is "[[][]]".
    @Test
    void minSwaps2() {
        Task27 test = new Task27();
        assertEquals(2, test.minSwaps("]]][[["));
    }

    //Example 3:
//
//Input: s = "[]"
//Output: 0
//Explanation: The string is already balanced.
    @Test
    void minSwaps3() {
        Task27 test = new Task27();
        assertEquals(0, test.minSwaps("[]"));
    }
}