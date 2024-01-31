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



/*optimized version*/
    public List<String> letterCasePermutation(String word) {
        List<String> result = new ArrayList<>();
        addCandidate(0, "", result, word);
        return result;
    }

    private void addCandidate(int index, String candidate, List<String> result, String word) {
        if (index == word.length()) {
            result.add(candidate);
            return;
        }
        char nextChar = word.charAt(index);

        if (Character.isDigit(nextChar)) {
            addCandidate(index+1, candidate + nextChar, result, word);
            return;
        }
            addCandidate(index+1, candidate + Character.toLowerCase(nextChar), result, word);
            addCandidate(index+1, candidate + Character.toUpperCase(nextChar), result, word);

    }

    public List<String> letterCasePermutation2(String s) {
        if(s == null || s.isEmpty()) return new ArrayList<>();

        List<String> result = new ArrayList<>();

        helper(s.toCharArray(), 0, result);

        return result;
    }

    private void helper(char[] charArray, int i, List<String> result) {
        if (i == charArray.length) {
            result.add(new String(charArray));
            return;
        }
        if (Character.isDigit(charArray[i])) {
            helper(charArray, i+1, result);
        } else {
            charArray[i] = Character.toLowerCase(charArray[i]);
            helper(charArray, i+1, result);
           charArray[i] = Character.toUpperCase(charArray[i]);
           helper(charArray, i+1, result);
        }
    }
}