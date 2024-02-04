package com.example.recursion;

public class Lecture07 {
    public int getFibonacciNum(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciNum(n - 1) + getFibonacciNum(n - 2);
    }

    public int countGoodCombinationsBracket(int count) {
        return helper(count, count);
    }

    private int helper(int leftCount, int rightCount) {
        if (rightCount < leftCount || leftCount < 0) {
            return 0;
        }
        if (leftCount == 0 && rightCount == 0) {
            return 1;
        }
       return helper(leftCount - 1, rightCount) +
        helper(leftCount, rightCount - 1);
    }
}
