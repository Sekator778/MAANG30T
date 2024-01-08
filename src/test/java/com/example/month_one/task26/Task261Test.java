package com.example.month_one.task26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task261Test {

    @Test
    void findMinDiffBetweenWords() {
        String[] words = {"cat", "ab", "c", "bat", "gax", "ff", "cat", "aa", "c", "bat", "o", "cat"};

        String word1 = "cat";
        String word2 = "bat";
        int expected = 1;
        int actual = new Task261().findMinDiffBetweenWords(words, word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    void findMinDiffBetweenWords2() {
        String[] words = {"cat", "ab", "c", "bat", "gax", "ff", "cat", "aa", "c", "bat", "o", "cat"};

        String word1 = "cat";
        String word2 = "c";
        int expected = 1;
        int actual = new Task261().findMinDiffBetweenWords(words, word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    void findMinDiffBetweenWords3() {
        String[] words = {"cat", "ab", "c", "bat", "gax", "ff", "cat", "aa", "c", "bat", "o", "cat"};

        String word1 = "cat";
        String word2 = "ff";
        int expected = 0;
        int actual = new Task261().findMinDiffBetweenWords(words, word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    void findMinDiffBetweenWords4() {
        String[] words = {"cat1", "ab", "c", "bat", "gax", "ff", "vv", "aa", "c", "bat", "o", "cat"};

        String word1 = "cat";
        String word2 = "cat1";
        int expected = 10;
        int actual = new Task261().findMinDiffBetweenWords(words, word1, word2);
        assertEquals(expected, actual);
    }
}
