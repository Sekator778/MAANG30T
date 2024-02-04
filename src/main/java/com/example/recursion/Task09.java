package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task09 {
    int palindromeMaxProduct = 0;

    public int maxProduct(String s) {
        getPalindromeMaxProduct(new ArrayList<>(), new ArrayList<>(), 0, s);
        return palindromeMaxProduct;
    }


    void getPalindromeMaxProduct(List<Character> candidate1, List<Character> candidate2, int startIndex, String word) {
        if (startIndex == word.length()) {
            if (isPalindrome(candidate1) && isPalindrome(candidate2)) {
                palindromeMaxProduct = Math.max(palindromeMaxProduct,
                        candidate1.size() * candidate2.size());
            }
            return;
        }
        char letter = word.charAt(startIndex);
        candidate1.add(letter);
        getPalindromeMaxProduct(candidate1, candidate2, startIndex + 1, word);
        candidate1.removeLast();

        candidate2.add(letter);
        getPalindromeMaxProduct(candidate1, candidate2, startIndex + 1, word);
        candidate2.removeLast();

        getPalindromeMaxProduct(candidate1, candidate2, startIndex + 1, word);
    }


    public boolean isPalindrome(List<Character> word) {
        int leftIndex = 0;
        int rightIndex = word.size() - 1;
        while (leftIndex < rightIndex) {
            if (word.get(leftIndex) != word.get(rightIndex)) {
                return false;
            }
            leftIndex += 1;
            rightIndex -= 1;
        }
        return true;
    }
}
