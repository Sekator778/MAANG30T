package com.example.month_one.task21;

import java.util.Stack;

/**
 * Created by dn070578noi on 04.01.24.
 */
public class Task21 {
    public String smallestSubsequence(String str) {
        // преобразуем строку в массив символов
        // готовим массивы для хранения индексов последнего вхождения буквы
        // и флагов использования буквы
        // и стек для хранения упорядоченной последовательности
        char[] letters = str.toCharArray();
        int[] lettersLastIndex = new int[26];
        boolean[] usedLetters = new boolean[26];
        Stack<Character> increasingStack = new Stack<>();
        // заполняем массив индексов последнего вхождения буквы (по коду буквы)
        for (int i = 0; i < letters.length; i++) {
            lettersLastIndex[letters[i] - 'a'] = i;
        }

        for (int letterIndex = 0; letterIndex < letters.length; letterIndex++) {
            // берем букву
            char letter = letters[letterIndex];
            // берем код буквы
            int letterCode = letter - 'a';
            // если буква уже использовалась, то пропускаем
            if (usedLetters[letterCode]) continue;
            // если буква не использовалась, то проверяем, можно ли ее добавить в стек
            while (!increasingStack.isEmpty()) {
                // если последняя буква в стеке меньше текущей, то добавляем текущую
                char subseqLastLetter = increasingStack.peek();

                if (subseqLastLetter < letter) {
                    break;
                }
                // если последняя буква в стеке больше текущей, то проверяем, можно ли ее убрать из стека
                int subseqLastLetterCode = subseqLastLetter - 'a';
                // если последнее вхождение буквы в стеке больше текущего индекса, то убираем ее из стека
                if (lettersLastIndex[subseqLastLetterCode] < letterIndex) {
                    break;
                }
                usedLetters[subseqLastLetterCode] = false;
                increasingStack.pop();
            }
            increasingStack.push(letter);
            usedLetters[letterCode] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : increasingStack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
