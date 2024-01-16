package com.example.month_two;

public class SumDigit {
    public int getDigitSum(int num) {
        if (num < 10) return num;

        int digitSum = getDigitSum(num / 10);
        int currentDigit = num % 10;

        return digitSum + currentDigit;
    }
}
