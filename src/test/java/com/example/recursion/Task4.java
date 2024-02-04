package com.example.recursion;

public class Task4 {
    /**
     * is word palindrome?
     */
    public boolean isWordPalindrome(String word) {
        if (word.length() <= 1) return true;

        int left = 0;
        int right = word.length() - 1;

        return isWordPalindrome(left, right, word);
    }

    private boolean isWordPalindrome(int left , int right, String word) {
        if (left >= right) return true;
        if (word.charAt(left) != word.charAt(right)) return false;
        return isWordPalindrome(left + 1, right - 1, word);
    }
}
