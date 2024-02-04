package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task05 {
    int[] numsSameConsecDiff(int digitsCount, int diff) {
        List<Integer> nums = new ArrayList<>();
        for (int digit = 1; digit <= 9; digit++) {
            getAllInts(digit, digitsCount, diff, nums);
        }
        return nums.stream().mapToInt(num -> num).toArray();
    }
    void getAllInts(int numCandidate, int digitsCount, int diff, List<Integer> nums) {
        if (digitsCount == 1) {
            nums.add(numCandidate);
            return;
        }
        int lastDigit = numCandidate % 10;
        if (diff == 0) {
            int newNum = concatenateDigit(numCandidate, lastDigit);
            getAllInts(newNum, digitsCount-1, diff, nums);
            return;
        }
        if ((lastDigit + diff) <= 9) {
            int newNum = concatenateDigit(numCandidate, lastDigit+diff);
            getAllInts(newNum, digitsCount-1, diff, nums);
        }
        if ((lastDigit - diff) >= 0) {
            int newNum = concatenateDigit(numCandidate, lastDigit-diff);
            getAllInts(newNum, digitsCount-1, diff, nums);
        }
    }

    int concatenateDigit(int num, int digit) {
        return num * 10 + digit;
    }
}
