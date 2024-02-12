package com.example.recursion.doc;

import java.util.ArrayList;
import java.util.List;

public class Lecture11 {
    public List<String> collectAllPermutation(String chars) {
        List<String> allStrings = new ArrayList<>();
        getAllWords("", 0, chars.toCharArray(), allStrings);
        return allStrings;
    }


    private void getAllWords(String word, int index, char[] chars, List<String> allWord) {
        if (index == chars.length) {
            allWord.add(word);
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            char letter = chars[index];
            getAllWords(word+letter, index + 1, chars, allWord);

        }
    }

}
