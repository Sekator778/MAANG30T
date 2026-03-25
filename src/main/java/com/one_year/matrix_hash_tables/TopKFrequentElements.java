package com.one_year.matrix_hash_tables;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class TopKFrequentElements {



    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Comparator.comparingInt(freqMap::get));

        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        freqMap.keySet()
                .forEach(
                        el -> {
                            pq.offer(el);
                            if(pq.size() > k) pq.poll();
                        }
                );

        int[] res = new int[k];

        for(int i=0; i<k;i++){
            res[i] = pq.poll();
        }
        return res;
    }



    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int n = nums.length+1;
        int [] buckets = new int[n];
        freqMap.keySet()
                .forEach(
                        el -> {
                            buckets[freqMap.get(el)]=el;
                        }
                );

        int[] res = new int[k];
        int j=0;
        for(int i=n-1; i>=k;i--,j++){
            res[j] = buckets[i];
        }
        return res;
    }

}