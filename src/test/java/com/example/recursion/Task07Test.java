package com.example.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task07Test {

    @Test
    void getWavedWords() {
        String char1 = "ab";
        String char2 = "cd";
        List<String> expected = List.of("abcd", "acbd", "acdb", "cabd", "cadb", "cdab");
        List<String> actual = new Task07().getWavedWords(char1, char2);
        assertEquals(expected, actual);
    }
}