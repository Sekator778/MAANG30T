package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {
//    Example 1:
//
//Input: cookies = [8,15,10,20,8], k = 2
//Output: 31
//Explanation: One optimal distribution is [8,15,8] and [10,20]
//- The 1st child receives [8,15,8] which has a total of 8 + 15 + 8 = 31 cookies.
//- The 2nd child receives [10,20] which has a total of 10 + 20 = 30 cookies.
//The unfairness of the distribution is max(31,30) = 31.
//It can be shown that there is no distribution with an unfairness less than 31.
    @Test
    void distributeCookies() {
        Task15 task15 = new Task15();
        int[] cookies = {8, 15, 10, 20, 8};
        int k = 2;
        int expected = 31;
        int actual = task15.distributeCookies(cookies, k);
        assertEquals(expected, actual);
    }

//Example 2:
//
//Input: cookies = [6,1,3,2,2,4,1,2], k = 3
//Output: 7
//Explanation: One optimal distribution is [6,1], [3,2,2], and [4,1,2]
//- The 1st child receives [6,1] which has a total of 6 + 1 = 7 cookies.
//- The 2nd child receives [3,2,2] which has a total of 3 + 2 + 2 = 7 cookies.
//- The 3rd child receives [4,1,2] which has a total of 4 + 1 + 2 = 7 cookies.
//The unfairness of the distribution is max(7,7,7) = 7.
//It can be shown that there is no distribution with an unfairness less than 7.
    @Test
    void distributeCookies2() {
        Task15 task15 = new Task15();
        int[] cookies = {6, 1, 3, 2, 2, 4, 1, 2};
        int k = 3;
        int expected = 7;
        int actual = task15.distributeCookies(cookies, k);
        assertEquals(expected, actual);
    }

}