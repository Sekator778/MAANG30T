package com.example.month_two;

import java.util.ArrayList;
import java.util.List;

public class Task03 {

    public static void main(String[] args) {
        new Task03().printTransforms("a1B2");
    }
    public void printTransforms(String word){
        printTransforms("", word);
    }
    private void printTransforms(String candidate, String chars) {
        if (chars.isEmpty()) {
            System.out.println(candidate);
            return;
        }
        char ch = chars.charAt(0);
        String trimmedChars = chars.substring(1);
        if (Character.isDigit(ch)) {
            printTransforms(candidate + ch, trimmedChars);
        } else {
            printTransforms(candidate + Character.toLowerCase(ch), trimmedChars);
            printTransforms(candidate + Character.toUpperCase(ch), trimmedChars);
        }
    }




    /*public List<String> findTransforms(String word) {
        List<String> result = new ArrayList<>();
        char ch = 0;
        addCandidate(0, ch, new StringBuilder(word.length()), word, result);
        return result;
    }

    private void addCandidate(int index, char ch, StringBuilder candidate, String chars, List<String> result) {
        if (index == chars.length()) {
            result.add(candidate.toString());
            return;

        }
        candidate.append(ch);
        index+=1;
        if (Character.isDigit(chars.charAt(index))) {
            addCandidate(index, chars.charAt(index), candidate, chars, result);
        } else {
            addCandidate(index, Character.toLowerCase(chars.charAt(index)), candidate, chars, result);
            addCandidate(index, Character.toUpperCase(chars.charAt(index)), candidate, chars, result);
        }
    }*/
    }