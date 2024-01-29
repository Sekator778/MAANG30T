package com.example.month_two;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StartTasksTest {
    @Test
    void getDigitSum() {
        StartTasks startTasks = new StartTasks();

        assertEquals(1, startTasks.getDigitSum(1));
        assertEquals(3, startTasks.getDigitSum(12));
        assertEquals(6, startTasks.getDigitSum(123));
        assertEquals(10, startTasks.getDigitSum(1234));
        assertEquals(15, startTasks.getDigitSum(12345));
        assertEquals(21, startTasks.getDigitSum(123456));
        assertEquals(28, startTasks.getDigitSum(1234567));
        assertEquals(36, startTasks.getDigitSum(12345678));
        assertEquals(45, startTasks.getDigitSum(123456789));
        assertEquals(45, startTasks.getDigitSum(1234567890));
    }

    @Test
    void testGetDigitSum() {
        StartTasks startTasks = new StartTasks();
        assertEquals(1, startTasks.getMaxElement(List.of(1)));
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        assertEquals(2, startTasks.getMaxElement(list));
    }

    @Test
    void testGetDigitSum2() {
        StartTasks startTasks = new StartTasks();
        assertEquals(1, startTasks.getMaxElement(List.of(1)));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, startTasks.getMaxElement(list));
    }

    @Test
    void testGetDigitSum3() {
        StartTasks startTasks = new StartTasks();
        assertEquals(1, startTasks.getMaxElement(List.of(1)));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(300);
        list.add(4);
        assertEquals(300, startTasks.getMaxElement(list));
    }

    @Test
    void testGetDigitSum4() {
        StartTasks startTasks = new StartTasks();
        assertEquals(23, startTasks.getMaxElement(List.of(1, 23, 4, 5, 6, 7, 8, 9, 10, 11, 12)));
    }

    @Test
    void getReverseString() {
        StartTasks startTasks = new StartTasks();
        assertEquals("1", startTasks.getReverseString(1));
        assertEquals("2,1", startTasks.getReverseString(12));
        assertEquals("3,2,1", startTasks.getReverseString(123));
        assertEquals("4,3,2,1", startTasks.getReverseString(1234));
        assertEquals("5,4,3,2,1", startTasks.getReverseString(12345));
        assertEquals("6,5,4,3,2,1", startTasks.getReverseString(123456));
        assertEquals("7,6,5,4,3,2,1", startTasks.getReverseString(1234567));
        assertEquals("8,7,6,5,4,3,2,1", startTasks.getReverseString(12345678));
        assertEquals("9,8,7,6,5,4,3,2,1", startTasks.getReverseString(123456789));
        assertEquals("0,9,8,7,6,5,4,3,2,1", startTasks.getReverseString(1234567890));
    }
}