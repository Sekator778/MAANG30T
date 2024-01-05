package com.example.month_one.task22;

import java.util.LinkedList;

/**
 * Created by dn070578noi on 05.01.24.
 */
public class Task22 {
    public int longestSubarray(int[] nums, int limit) {
        // минимальна монотонна послідовність
        LinkedList<Integer> minQueue = new LinkedList<>();
        // максимальна монотонна послідовність
        LinkedList<Integer> maxQueue = new LinkedList<>();
        int startWindow = 0;
        int endWindow = 0;
        int maxLength = 0;
        // рухаемо кінець вікна
        while (endWindow < nums.length) {
            // поточний елемент
            int endNum = nums[endWindow];
            // намагаємось додати до послідовностей максимальний та мінімальний елемент
            // таким чином ми завжди будемо знати мінімум та максимум в поточному вікні
            addToDecreasingQueue(maxQueue, endNum);
            addToIncreasingQueue(minQueue, endNum);
            // (крутимо цикл)
            // якщо умова виконується - maxQueue.getFirst() - minQueue.getFirst() <= limit - то виходимо з циклу
            // якщо ні -
            // видаляємо з початку вікна елементи, поки не буде виконуватись умова
            // maxQueue.getFirst() - minQueue.getFirst() <= limit
            // тобто виконуватись має у вікні умова задачі
            while (true) {
                if (maxQueue.getFirst() - minQueue.getFirst() <= limit) break;

                int startNum = nums[startWindow];
                if (maxQueue.getFirst() == startNum) maxQueue.removeFirst();
                if (minQueue.getFirst() == startNum) minQueue.removeFirst();
                startWindow += 1;
            }
            // знаходимо максимальну довжину вікна
            int windowSize = endWindow - startWindow + 1;
            maxLength = Math.max(maxLength, windowSize);
            // збільшуємо вікно
            endWindow += 1;
        }
        return maxLength;
    }

    /**
     * Додаємо елементи до зростаючої монотонної послідовності
     * в нульовому індексі завжди буде мінімальний елемент
     */
    void addToIncreasingQueue(LinkedList<Integer> increasingQueue, int value) {
        while (!increasingQueue.isEmpty()) {
            if (value >= increasingQueue.getLast()) {
                break;
            }
            increasingQueue.removeLast();
        }
        increasingQueue.add(value);
    }

    /**
     * Додаємо елементи до спадаючої монотонної послідовності
     * в нульовому індексі завжди буде максимальний елемент
     */
    void addToDecreasingQueue(LinkedList<Integer> decreasingQueue, int value) {
        while (!decreasingQueue.isEmpty()) {
            if (value <= decreasingQueue.getLast()) {
                break;
            }
            decreasingQueue.removeLast();
        }
        decreasingQueue.add(value);
    }
}
