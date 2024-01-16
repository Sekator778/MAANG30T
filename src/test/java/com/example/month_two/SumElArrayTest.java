package com.example.month_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumElArrayTest {

    @Test
    void sumElInArray0() {
        SumElArray sumElArray = new SumElArray();
        int[] arr = {3, 4, 5};
        int n = 3;
        int result = sumElArray.sumElInArray(arr, n);
        assertEquals(12, result);
    }

    @Test
    void sumElInArray() {
        SumElArray sumElArray = new SumElArray();
        int[] arr = {1, 2, 3, 4, 5};
        int n = 4;
        int result = sumElArray.sumElInArray(arr, n);
        assertEquals(10, result);
    }

    @Test
    void sumElInArray2() {
        SumElArray sumElArray = new SumElArray();
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        int result = sumElArray.sumElInArray(arr, n);
        assertEquals(6, result);
    }

    @Test
    void sumElInArray3() {
        SumElArray sumElArray = new SumElArray();
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;
        int result = sumElArray.sumElInArray(arr, n);
        assertEquals(3, result);
    }

    @Test
    void factorial() {
        SumElArray sumElArray = new SumElArray();
        int n = 2;
        int result = sumElArray.factorial(n);
        assertEquals(2, result);
    }

    @Test
    void factorial2() {
        SumElArray sumElArray = new SumElArray();
        int n = 3;
        int result = sumElArray.factorial(n);
        assertEquals(6, result);
    }

    @Test
    void factorial3() {
        SumElArray sumElArray = new SumElArray();
        int n = 4;
        int result = sumElArray.factorial(n);
        assertEquals(24, result);
    }

}