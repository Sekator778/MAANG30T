package com.example.month_two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task04Test {

    @Test
    void findParenthesis() {
        assertEquals(2, new Task04().findParenthesis(2).size());
        assertEquals(List.of("(())", "()()"), new Task04().findParenthesis(2));
    }
}