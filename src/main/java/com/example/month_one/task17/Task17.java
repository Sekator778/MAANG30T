package com.example.month_one.task17;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 12.12.23.
 */
public class Task17 {
    public int minStoneSum(int[] piles, int k) {
        // count sum all stones
        int countStones = Arrays.stream(piles).sum();

        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // add each piles of stone to kth
        for (int s : piles) {
            maxHeap.add(s);
        }
        for (int i = 0; i < k; i++) {
            int currentMaxPile = maxHeap.poll();
            int halfMaxPile = currentMaxPile / 2;
            maxHeap.add(currentMaxPile - halfMaxPile);
            countStones -= halfMaxPile;
        }
        return countStones;
    }
}