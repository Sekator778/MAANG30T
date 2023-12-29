package com.example.month_one.task14;

/**
 * Created by dn070578noi on 11.12.23.
 */
public class Task14 {
    public int maxChunksToSorted(int[] arr) {
        int chunksCount = 0;
        int currMaxNum = 0;

        for (int i = 0; i < arr.length; i++) {
            currMaxNum = Math.max(currMaxNum, arr[i]);
            if (i == currMaxNum) {
                chunksCount += 1;
            }
        }
        return chunksCount;
    }
}
