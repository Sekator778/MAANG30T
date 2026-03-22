package com.one_year.matrix_hash_tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            String key = buildKey(str);
            if (result.containsKey(key)) {
                result.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                result.put(key, list);
            }
        }
        return result.values().stream().toList();
    }

    private String buildKey(String str) {
        int[] counts = new int[26];
        for (char ch : str.toCharArray()) {
            counts[ch - 'a']++;
        }
        StringBuilder key = new StringBuilder();
        for (int count : counts) {
            key.append(count).append("#");
        }
        return key.toString();
    }
}