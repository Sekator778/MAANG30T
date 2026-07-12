package com.one_year.matrix_hash_tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            String key = sort(str);
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

    private String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}