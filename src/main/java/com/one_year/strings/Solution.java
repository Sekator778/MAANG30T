package com.one_year.strings;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int currentMax=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(charSet.add(ch)){
                currentMax++;
            } else {
                int start = i-currentMax;
                while(charSet.contains(ch)){
                    charSet.remove(s.charAt(start--));
                    currentMax-=1;
                }
                max=Math.max(max, currentMax);
            }
        }
        return max<currentMax? currentMax:max;
    }
}