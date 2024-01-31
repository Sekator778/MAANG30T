package com.example.month_two;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    /**
     * Weaving two strings
     */
    public List<String> getWavedWords(String chars1, String chars2) {
        List<String> words = new ArrayList<>();
        getWavedWords(new StringBuilder(), 0, 0, chars1, chars2, words);
        return words;
    }

    private void getWavedWords(StringBuilder word, int index1, int index2, String char1, String char2, List<String> words) {
        if (index1 == char1.length()) {
            words.add(word.toString() + char2.substring(index2));
            return;
        }
        if (index2 == char2.length()) {
            words.add(word.toString() + char1.substring(index1));
            return;
        }

        char c1 = char1.charAt(index1);
        char c2 = char2.charAt(index2);

        word.append(c1);
        getWavedWords(word, index1 + 1, index2, char1, char2, words);
        word.deleteCharAt(word.length() - 1);

        word.append(c2);
        getWavedWords(word, index1, index2 + 1, char1, char2, words);
        word.deleteCharAt(word.length() - 1);
    }
}
