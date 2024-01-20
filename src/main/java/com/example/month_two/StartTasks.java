package com.example.month_two;

import java.util.List;

/**
 * напишите функцию которая вичисляет суммму всех цифр натурального числа N
 * натуральное числа от 0 до бесконечности — 0, 1, 2, 3, 4 .. ... .. .
 */
public class StartTasks {
    public int getDigitSum(int num) {
        // базовий випадок
        if (num < 10) return num;
        // задача меньшого розміру
        int digitSum = getDigitSum(num / 10);
        // обчислення результату
        int currentDigit = num % 10;

        return digitSum + currentDigit;
    }


    public int getMaxElement(List<Integer> array, int size) {
        // базовий випадок
        if (size == 1) return array.get(size - 1);
        // задача меньшого розміру
        int maxInShorterList = getMaxElement(array, size - 1);
        // обчислення результату
        return Math.max(array.get(size - 1), maxInShorterList);
    }

    /**
     * Напишите рекурсивную функцию кoторая находит максимальний елемент в массиве.
     */
    /*TODO fix it*/
    public int getMaxElement(List<Integer> array) {
        if (array.size() == 1) return array.get(0);

        return getMaxElement(array, array.size() - 1);
    }

    /**
     * Из натурального числа N создайте строку, содержащую все цифри в обратном порядке, разделенние запятими
     */
    public String getReverseString(int num) {
        // базовий випадок
        if (num < 10) return "" + num;
        // задача меньшого розміру
        String nextChar = getReverseString(num / 10);
        // обчислення результату
        int currentChar = num % 10;
        return currentChar + "," + nextChar;
    }
}
