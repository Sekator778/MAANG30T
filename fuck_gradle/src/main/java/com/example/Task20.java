package com.example;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 19.12.23.
 * You are given an array of events where events[i] = [startDayi,
 * endDayi]. Every event i starts at startDayi and ends at endDayi.
 * <p>
 * You can attend an event i at any day d where startTimei <= d <= endTimei.
 * You can only attend one event at any time d.
 * <p>
 * Return the maximum number of events you can attend.
 * Return the maximum number of apples you can eat.
 */
public class Task20 {

    public int maxEvents(int[][] events) {
        int START = 0;
        int END = 1;
        Arrays.sort(events, (a, b) -> a[START] - b[START]);

        int todayEventDay = 0;
        int maxEventCount = 0;

        int eventId = 0;
        int[] event = events[eventId];
        Queue<Integer> eventEndDates = new PriorityQueue<>();

        while (true) {
            while (true) {
                if (eventEndDates.isEmpty()) {
                    break;
                }
                if (eventEndDates.peek() < todayEventDay) {
                    eventEndDates.poll();
                } else {
                    break;
                }
            }
            if (eventEndDates.isEmpty()) {
                if (event == null) {
                    return maxEventCount;
                }
                todayEventDay = event[START];
            }
            while (true) {
                if (event == null) {
                    break;
                }
                if (event[START] == todayEventDay) {
                    eventEndDates.add(event[END]);
                    eventId += 1;
                    event = (eventId < events.length) ? events[eventId] : null;
                } else {
                    break;
                }
            }
            eventEndDates.poll();
            maxEventCount += 1;
            todayEventDay += 1;
        }

    }
}
