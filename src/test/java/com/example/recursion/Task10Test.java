package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {
    //Example 1:
    //
    //Input: baseCosts = [1,7], toppingCosts = [3,4], target = 10
    //Output: 10
    //Explanation: Consider the following combination (all 0-indexed):
    //- Choose base 1: cost 7
    //- Take 1 of topping 0: cost 1 x 3 = 3
    //- Take 0 of topping 1: cost 0 x 4 = 0
    //Total: 7 + 3 + 0 = 10.
    @Test
    void closestCost() {
        int[] baseCosts = {1, 7};
        int[] toppingCosts = {3, 4};
        int target = 10;
        int expected = 10;
        int actual = new Task10().closestCost(baseCosts, toppingCosts, target);
        assertEquals(expected, actual);
    }
    //Example 2:
    //
    //Input: baseCosts = [2,3], toppingCosts = [4,5,100], target = 18
    //Output: 17
    //Explanation: Consider the following combination (all 0-indexed):
    //- Choose base 1: cost 3
    //- Take 1 of topping 0: cost 1 x 4 = 4
    //- Take 2 of topping 1: cost 2 x 5 = 10
    //- Take 0 of topping 2: cost 0 x 100 = 0
    //Total: 3 + 4 + 10 + 0 = 17. You cannot make a dessert with a total cost of 18.
    @Test
    void closestCost2() {
        int[] baseCosts = {2, 3};
        int[] toppingCosts = {4, 5, 100};
        int target = 18;
        int expected = 17;
        int actual = new Task10().closestCost(baseCosts, toppingCosts, target);
        assertEquals(expected, actual);
    }
    //Example 3:
    //
    //Input: baseCosts = [3,10], toppingCosts = [2,5], target = 9
    //Output: 8
    //Explanation: It is possible to make desserts with cost 8 and 10. Return 8 as it is the lower cost.
    //
    @Test
    void closestCost3() {
        int[] baseCosts = {3, 10};
        int[] toppingCosts = {2, 5};
        int target = 9;
        int expected = 8;
        int actual = new Task10().closestCost(baseCosts, toppingCosts, target);
        assertEquals(expected, actual);
    }

}