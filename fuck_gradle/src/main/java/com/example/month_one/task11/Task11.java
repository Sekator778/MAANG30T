package com.example.month_one.task11;

import com.example.utility.Utility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dn070578noi on 10.12.23.
 */
public class Task11 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringListMap = new LinkedHashMap<>();

        for (String s : strs) {
            String sorted = Utility.sortChars(s);
            if (!stringListMap.containsKey(sorted)) {
                stringListMap.put(sorted, new ArrayList<>());
            }
            stringListMap.get(sorted).add(s);
        }
        List<List<String>> result = new ArrayList<>();

        for (String s : stringListMap.keySet()) {
            result.add(stringListMap.get(s));
        }
        return result;
    }
}
