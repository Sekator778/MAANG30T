package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public List<String> letterCombinations(String digits) {
        List<String> words = new ArrayList<>();
        if (digits.isEmpty()) {
            return words;
        }
        String[] keyboard = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        getWords(new StringBuilder(digits.length()), 0, digits, keyboard, words);
        return words;
    }

    private void getWords(StringBuilder word, int digitIndex, String digits, String[] keyboard, List<String> words) {
        if (digitIndex == digits.length()) {
            words.add(word.toString());
            return;
        }
        int digit = digits.charAt(digitIndex) - '0';
        String letters = keyboard[digit];

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            word.append(letter);
            getWords(word, digitIndex + 1, digits, keyboard, words);
            word.deleteCharAt(word.length() - 1);
        }
    }
}
