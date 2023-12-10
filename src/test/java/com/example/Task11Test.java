package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task11Test {

    //    Example 1:
//
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["ate","eat","tea"],["nat","tan"],["bat"]]
    @Test
    void test() {
        Task11 task11 = new Task11();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = task11.groupAnagrams(input);
        assertEquals(3, result.size());
        assertEquals(3, result.get(0).size());
        assertEquals(2, result.get(1).size());
        assertEquals(1, result.get(2).size());
    }

    //    Example 2:
//    Input: strs = [""]
//    Output: [[""]]
    @Test
    void test1() {
        Task11 task11 = new Task11();
        String[] input = {""};
        List<List<String>> result = task11.groupAnagrams(input);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
    }

    //    Example 3:
//    Input: strs = ["a"]
//    Output: [["a"]]
    @Test
    void test2() {
        Task11 task11 = new Task11();
        String[] input = {"a"};
        List<List<String>> result = task11.groupAnagrams(input);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
    }
}