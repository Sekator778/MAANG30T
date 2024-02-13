package com.example.recursion;

public class Task18 {
    public String getHappyString(int n, int k) {
        return getKthWord(new StringBuilder(n), new int[]{k}, n);
    }

    private String getKthWord(StringBuilder candidate, int[] k, int wordSize) {
        if (candidate.length() == wordSize) {
            if (k[0] == 1) {
                return candidate.toString();
            }
            k[0] -= 1;
            return "";
        }
        String letters = "abc";
        for (int i = 0; i < letters.length(); i++) {
            if (!canPlaceLetter(candidate, letters.charAt(i))) {
                continue;
            }
            candidate.append(letters.charAt(i));
            String word = getKthWord(candidate, k, wordSize);
            if (!word.isEmpty()) {
                return word;
            }
            candidate.deleteCharAt(candidate.length() - 1);
        }
        return "";
    }

    boolean canPlaceLetter(StringBuilder candidate, char letter) {
        if (candidate.isEmpty()) {
            return true;
        }
        return candidate.charAt(candidate.length() - 1) != letter;
    }
}
