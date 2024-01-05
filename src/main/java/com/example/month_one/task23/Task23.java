package com.example.month_one.task23;

import java.util.Stack;

/**
 * Created by dn070578noi on 05.01.24.
 */
public class Task23 {
    public String removeKdigits(String num, int digitsCount) {
        // по умові задачі, якщо кількість цифр, які треба видалити, дорівнює довжині числа, то результат - 0
        if (num.length() == digitsCount) return "0";
        // створюємо стек, в який будемо додавати цифри числа
        Stack<Character> trimmedNum = new Stack<>();
        // проходимо по всім цифрам числа
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            digitsCount = addToIncreasingStack(trimmedNum, digit, digitsCount);
        }
        // якщо кількість цифр, які треба видалити, більша за 0, видаляємо цифри зі стеку з кінця
        while (digitsCount > 0) {
            trimmedNum.pop();
            digitsCount -= 1;
        }

        StringBuilder result = new StringBuilder();
        for (Character digit : trimmedNum) {
            if (result.isEmpty() && digit == '0') continue;
            result.append(digit);
        }
        return result.length() == 0 ? "0" : result.toString();
    }

    /**
     * Додаємо цифру в стек, якщо вона більша за останню цифру в стеку
     * якщо ні - видаляємо цифри зі стеку, поки не знайдемо цифру, яка менша за додавану
     * при умові що кількість цифр, які треба видалити, більша за 0
     */
    int addToIncreasingStack(Stack<Character> increasingQueue, Character value, int digitCount) {
        // якщо стек пустий або остання цифра в стеку менша за додавану, додаємо цифру в стек
        // якщо ні - видаляємо цифри зі стеку, поки не знайдемо цифру,
        // яка менша за додавану та поки кількість цифр, які треба видалити, більша за 0
        while (!increasingQueue.isEmpty() && digitCount > 0) {
            if (increasingQueue.getLast() <= value) break;
            increasingQueue.pop();
            digitCount -= 1;
        }
        increasingQueue.push(value);
        return digitCount;
    }
}
