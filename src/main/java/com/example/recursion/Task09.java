package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public int maxProduct(String s) {
        return getPalindromeMaxProduct(new ArrayList<>(), new ArrayList<>(), 0, s, new int[]{0})[0];
    }

    int[] getPalindromeMaxProduct(List<Character> candidate1, List<Character> candidate2,
                                  int startIndex, String word, int[] palindromeMaxProduct) {
        if (startIndex == word.length()) {
            if (isPalindrome(candidate1) && isPalindrome(candidate2)) {
                palindromeMaxProduct[0] = Math.max(palindromeMaxProduct[0],
                        candidate1.size() * candidate2.size());
            }
            return palindromeMaxProduct;
        }
        char letter = word.charAt(startIndex);
        candidate1.add(letter);
        getPalindromeMaxProduct(candidate1, candidate2, startIndex + 1, word, palindromeMaxProduct);
        candidate1.removeLast();

        candidate2.add(letter);
        getPalindromeMaxProduct(candidate1, candidate2, startIndex + 1, word, palindromeMaxProduct);
        candidate2.removeLast();

        getPalindromeMaxProduct(candidate1, candidate2, startIndex + 1, word, palindromeMaxProduct);
        return palindromeMaxProduct;
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
