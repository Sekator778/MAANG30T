package com.one_year.prefix_sum;

import com.example.utility.ListNode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Sekator
 * @created 04 May, 2026
 */
public class SubArraysSumEqualsK {
        public int subarraySum(int[] nums, int k) {
            PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
            heap.
            Map<Integer, Integer> prefMap = new HashMap<>();
            prefMap.put(0, 1);
            int currentPrefix=0;
            int answer=0;
            for(int num:nums) {
                currentPrefix+=num;
                answer+=prefMap.getOrDefault(currentPrefix-k,0);
                prefMap.merge(currentPrefix, 1, Integer::sum);
            }
            return answer;
    }
}
