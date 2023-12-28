package com.example.month_one;

import com.example.Task17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task17Test {

    //    Example 1:
//    Input: piles = [5,4,9], k = 2
//    Output: 12
//    Explanation: Steps of a possible scenario are:
//            - Apply the operation on pile 2. The resulting piles are [5,4,5].
//            - Apply the operation on pile 0. The resulting piles are [3,4,5].
//    The total number of stones in [3,4,5] is 12.
    @Test
    void test1() {
        int[] piles = {5, 4, 9};
        int k = 2;
        int expected = 12;
        int actual = new Task17().minStoneSum(piles, k);
        assertEquals(expected, actual);
    }

    //    Example 2:
//    Input: piles = [4,3,6,7], k = 3
//    Output: 12
//    Explanation: Steps of a possible scenario are:
//            - Apply the operation on pile 2. The resulting piles are [4,3,3,7].
//            - Apply the operation on pile 3. The resulting piles are [4,3,3,4].
//            - Apply the operation on pile 0. The resulting piles are [2,3,3,4].
//    The total number of stones in [2,3,3,4] is 12.
    @Test
    void test2() {
        int[] piles = {4, 3, 6, 7};
        int k = 3;
        int expected = 12;
        int actual = new Task17().minStoneSum(piles, k);
        assertEquals(expected, actual);
    }
}