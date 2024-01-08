package com.example.month_one.task26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dn070578noi on 08.01.24.
 */
public class Task261 {
    public int findMinDiffBetweenWords(String[] words, String word1, String word2) {
        if (words == null || words.length == 0 || word1 == null || word2 == null) {
            return -1;
        }
        Map<String, List<Integer>> locations = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (s.equals(word1) || s.equals(word2)) {
                if (!locations.containsKey(s)) {
                    locations.put(s, new ArrayList<>());
                }
                locations.get(s).add(i);
            }
        }
        if (locations.get(word1) == null || locations.get(word2) == null) {
            return -1;
        }
        return getMinDiff(locations.get(word1), locations.get(word2));
    }

    private int getMinDiff(List<Integer> a, List<Integer> b) {
        int index1 = 0;
        int index2 = 0;
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];
        while (index1 != a.size() && index2 != b.size()) {
            int currentDiff = Math.abs(a.get(index1) - b.get(index2));

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                result = new int[]{a.get(index1), b.get(index2)};
            }
            if (a.get(index1) < b.get(index2)) {
                index1 += 1;
            } else {
                index2 += 1;
            }
        }
        return Math.abs((result[0] - result[1])) - 1;
    }
}
