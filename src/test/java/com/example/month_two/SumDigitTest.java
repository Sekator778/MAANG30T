package com.example.month_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDigitTest {
    @Test
    void getDigitSum() {
        SumDigit sumDigit = new SumDigit();

        assertEquals(1, sumDigit.getDigitSum(1));
        assertEquals(3, sumDigit.getDigitSum(12));
        assertEquals(6, sumDigit.getDigitSum(123));
        assertEquals(10, sumDigit.getDigitSum(1234));
        assertEquals(15, sumDigit.getDigitSum(12345));
        assertEquals(21, sumDigit.getDigitSum(123456));
        assertEquals(28, sumDigit.getDigitSum(1234567));
        assertEquals(36, sumDigit.getDigitSum(12345678));
        assertEquals(45, sumDigit.getDigitSum(123456789));
        assertEquals(45, sumDigit.getDigitSum(1234567890));
    }

}