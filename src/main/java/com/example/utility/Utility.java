package com.example.utility;

import java.util.Arrays;

/**
 * Created by dn070578noi on 10.12.23.
 */
public class Utility {

    public static String sortChars(String in) {
        char[] charArray = in.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
