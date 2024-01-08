package com.example.month_one.task27;

/**
 * Created by dn070578noi on 08.01.24.
 */
public class Task27 {
    public int minSwaps(String s) {
        int unmatchedLeftCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') unmatchedLeftCount += 1;

            if (ch == ']' && unmatchedLeftCount > 0) {
                unmatchedLeftCount -= 1;
            }
        }
        return unmatchedLeftCount % 2 == 0
                ? unmatchedLeftCount / 2
                : (unmatchedLeftCount + 1) / 2;
    }
}
