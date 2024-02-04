package com.example.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task09Test {
    @Test
    void isPalindrome() {
        Task09 task09 = new Task09();
        assertTrue(task09.isPalindrome(List.of('a', 'b', 'c', 'b', 'a')));
        assertFalse(task09.isPalindrome(List.of('a', 'b', 'c', 'b', 'd')));
    }
    // Example 1:
    //
    //Input: s = "leetcodecom"
    //Output: 9
    //Explanation: An optimal solution is to choose "ete" for the 1st subsequence and "cdc" for the 2nd subsequence.
    //The product of their lengths is: 3 * 3 = 9.
    @Test
    void maxProduct() {
        Task09 task09 = new Task09();
        assertEquals(9, task09.maxProduct("leetcodecom"));
    }
    //Example 2:
    //
    //Input: s = "bb"
    //Output: 1
    //Explanation: An optimal solution is to choose "b" (the first character) for the 1st subsequence and "b" (the second character) for the 2nd subsequence.
    //The product of their lengths is: 1 * 1 = 1.
    @Test
    void maxProduct2() {
        Task09 task09 = new Task09();
        assertEquals(1, task09.maxProduct("bb"));
    }
    //Example 3:
    //
    //Input: s = "accbcaxxcxx"
    //Output: 25
    //Explanation: An optimal solution is to choose "accca" for the 1st subsequence and "xxcxx" for the 2nd subsequence.
    //The product of their lengths is: 5 * 5 = 25.
    @Test
    void maxProduct3() {
        Task09 task09 = new Task09();
        assertEquals(25, task09.maxProduct("accbcaxxcxx"));
    }

}