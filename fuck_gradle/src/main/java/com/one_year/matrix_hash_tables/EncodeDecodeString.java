package com.one_year.matrix_hash_tables;

import java.util.ArrayList;
import java.util.List;

class EncodeDecodeString {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();

        for(String str: strs) {
            int length = str.length();
            output.append(length).append("#").append(str);
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int start = 0;
        int end = 0;
        while(end<str.length()) {
            if(str.charAt(end) == '#') {
                int length = Integer.parseInt(str.substring(start, end));
                start = end + 1;
                end = end + length + 1;
                strs.add(str.substring(start, end));
                start = end;
            } else {
                end++;
            }
        }
        return strs;
    }
}
