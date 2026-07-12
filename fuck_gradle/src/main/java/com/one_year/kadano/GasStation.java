package com.one_year.kadano;

/**
 * @author Sekator
 * @created 15 Mar, 2026
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += (gas[i] - cost[i]);
        }
        if (sum < 0) {
            return -1;
        }
        sum = 0;
        int startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += (gas[i] - cost[i]);
            if (sum > 0) {
                continue;
            }

            sum = 0;
            startIndex = i + 1;

        }
        return startIndex;
    }
}
