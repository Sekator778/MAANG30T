package com.example;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 18.12.23.
 * <p>
 * There is a special kind of apple tree that grows apples every day for n days.
 * On the ith day, the tree grows apples[i] apples that will rot after days[i] days,
 * that is on day i + days[i] the apples will be rotten and cannot be eaten.
 * On some days, the apple tree does not grow any apples,
 * which are denoted by apples[i] == 0 and days[i] == 0.
 * <p>
 * You decided to eat at most one apple a day (to keep the doctors away).
 * Note that you can keep eating after the first n days.
 * <p>
 * Given two integer arrays days and apples of length n,
 * return the maximum number of apples you can eat.
 */
public class Task19 {
    int ROTTEN_DATE = 0;
    int APPLES_COUNT = 1;

    public int eatenApples(int[] apples, int[] dates) {
        int date = 0;
        int eatenApplesCount = 0;
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[ROTTEN_DATE] - b[ROTTEN_DATE]);

        while (true) {
            if (date >= dates.length && minHeap.isEmpty()) {
                break;
            }

            while (true) {
                if (minHeap.isEmpty()) {
                    break;
                }

                if (date < minHeap.peek()[ROTTEN_DATE]) {
                    break;
                }

                minHeap.poll();
            }
            if (date < dates.length && apples[date] > 0) {
                minHeap.add(new int[]{dates[date] + date, apples[date]});
            }
            if (!minHeap.isEmpty()) {
                eatenApplesCount += 1;
                if (minHeap.peek()[APPLES_COUNT] == 1) {
                    minHeap.poll();
                } else {
                    minHeap.peek()[APPLES_COUNT] -= 1;
                }
            }
            date += 1;
        }
        return eatenApplesCount;
    }
}
