package com.one_year.matrix_hash_tables;

import java.util.ArrayList;
import java.util.List;

class EncodeDecodeString {

    public String encode(List<String> strs) {
        StringBuilder encStr = new StringBuilder();
        for (String s : strs) {
            encStr
                    .append(s.length())
                    .append("#")
                    .append(s)
            ;
        }

        return encStr.toString();

    }

    public List<String> decode(String str) {
        int start = 0;
        int end = 0;
        List<String> decoder = new ArrayList<>();
        while (end < str.length()) {
            while (str.charAt(end) != '#') {
                end++;
            }
            int strSize = Integer.parseInt(
                    str.substring(start, end));
            start = end + 1;
            end = end + strSize + 1;
            String s = str.substring(start, end);
            decoder.add(s);
            start = end;
        }

        return decoder;
    }
}
