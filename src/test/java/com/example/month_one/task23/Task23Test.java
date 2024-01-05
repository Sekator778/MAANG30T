package com.example.month_one.task23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task23Test {
    //Example 1:
//
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
    @Test
    void test1() {
        assertEquals("1219", new Task23().removeKdigits("1432219", 3));
    }

    //Example 2:
//
//Input: num = "10200", k = 1
//Output: "200"
//Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
    @Test
    void test2() {
        assertEquals("200", new Task23().removeKdigits("10200", 1));
    }

    //Example 3:
//
//Input: num = "10", k = 2
//Output: "0"
//Explanation: Remove all the digits from the number and it is left with nothing which is 0.
    @Test
    void test3() {
        assertEquals("0", new Task23().removeKdigits("10", 2));
    }

    //Example 4:
//
//Input: num = "10", k = 1
//Output: "0"
//Explanation: Remove all the digits from the number and it is left with nothing which is 0.
    @Test
    void test4() {
        assertEquals("0", new Task23().removeKdigits("10", 1));
    }
}