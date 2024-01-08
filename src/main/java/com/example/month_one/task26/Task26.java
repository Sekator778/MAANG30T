package com.example.month_one.task26;

/**
 * Created by dn070578noi on 08.01.24.
 */
public class Task26 {
    public int[] findMinAbsDiff(int[] arr1, int[] arr2) {
        // мінімально можлива різниця
        int minAbsDiff = Integer.MAX_VALUE;
        // два указателя на два массива
        int index1 = 0;
        int index2 = 0;
        // мінімальна пара
        int[] minAbsDiffPair = new int[]{2};
        // поки не дійшли до кінця одного з масивів
        while (index1 != arr1.length && index2 != arr2.length) {
            // поточна різниця
            int currentAbsDiff = Math.abs(arr1[index1] - arr2[index2]);
            // якщо поточна різниця менша за мінімальну
            if (currentAbsDiff < minAbsDiff) {
                // оновлюємо мінімальну різницю
                minAbsDiff = currentAbsDiff;
                // оновлюємо мінімальну пару
                minAbsDiffPair = new int[]{arr1[index1], arr2[index2]};
            }
            //  якщо поточна різниця не меньша за мінімальну
            // то збільшуємо індекс масива, елемент якого менший
            if (arr1[index1] < arr2[index2]) index1 += 1;
            else index2 += 1;
        }
        return minAbsDiffPair;
    }
}
