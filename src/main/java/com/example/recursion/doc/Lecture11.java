package com.example.recursion.doc;

import java.util.ArrayList;
import java.util.List;

public class Lecture11 {
    public List<List<String>> collectAllPermutation(String chars) {
        List<List<String>> allStrings = new ArrayList<>();
        getAllWords(0, chars.toCharArray(), allStrings);
        return allStrings;
    }


    private void getAllWords(int startIndex, char[] chars, List<List<String>> allWord) {
        if (startIndex == chars.length) {
            List<String> word = new ArrayList<>();
            for (char aChar : chars) {
                word.add(String.valueOf(aChar));
            }
            allWord.add(word);
        }
        for (int i = startIndex; i < chars.length; i++) {
            swap(chars, startIndex, i);
            getAllWords(startIndex + 1, chars, allWord);
            swap(chars, startIndex, i);
        }
    }

    private void swap(char[] chars, int from, int to) {
        char temp = chars[from];
        chars[from] = chars[to];
        chars[to] = temp;
    }
}
