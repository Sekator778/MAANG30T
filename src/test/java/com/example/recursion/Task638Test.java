package com.example.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task638Test {
    //    Example 1:
//
//Input: price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
//Output: 14
//Explanation: There are two kinds of items, A and B. Their prices are $2 and $5 respectively.
//In special offer 1, you can pay $5 for 3A and 0B
//In special offer 2, you can pay $10 for 1A and 2B.
//You need to buy 3A and 2B, so you may pay $10 for 1A and 2B (special offer #2), and $4 for 2A.
    @Test
    void shoppingOffers() {
        Task638 task638 = new Task638();
        assertEquals(14, task638.shoppingOffers(List.of(2, 5), List.of(List.of(3, 0, 5), List.of(1, 2, 10)), List.of(3, 2)));
    }

    //Example 2:
//
//Input: price = [2,3,4], special = [[1,1,0,4],[2,2,1,9]], needs = [1,2,1]
//Output: 11
//Explanation: The price of A is $2, and $3 for B, $4 for C.
//You may pay $4 for 1A and 1B, and $9 for 2A ,2B and 1C.
//You need to buy 1A ,2B and 1C, so you may pay $4 for 1A and 1B (special offer #1), and $3 for 1B, $4 for 1C.
//You cannot add more items, though only $9 for 2A ,2B and 1C.
    @Test
    void shoppingOffers2() {
        Task638 task638 = new Task638();
        assertEquals(11, task638.shoppingOffers(List.of(2, 3, 4), List.of(List.of(1, 1, 0, 4), List.of(2, 2, 1, 9)), List.of(1, 2, 1)));
    }

}