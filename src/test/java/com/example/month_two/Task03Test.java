package com.example.month_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task03Test {

    @Test
    void findTransforms() {
        String word = "a1b2";
        Task03 task03 = new Task03();
        assertEquals(4, task03.findTransforms(word).size());
    }
}