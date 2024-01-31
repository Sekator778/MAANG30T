package com.example.month_two;

public class Lecture06 {
    /**
     * func copy all symbols from string s to array of chars
     */
    public char[] convertStringToCharArray(String s) {
        char[] result = new char[s.length()];
        int index = 0;
        convertStringToCharArray(index, result, s);
        return result;
    }

    private void convertStringToCharArray(int index, char[] result, String s) {
        if (index == s.length()) {
            return;
        }
        result[index] = s.charAt(index);
        index+=1;
        convertStringToCharArray(index, result, s);
    }
}
