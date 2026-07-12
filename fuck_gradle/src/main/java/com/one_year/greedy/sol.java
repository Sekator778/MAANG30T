package com.one_year.greedy;

/**
 * @author Sekator
 * @created 16 Mar, 2026
 */
public class sol {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        int reactMaxArea = 0;

        while(start < end) {

            int reactWidth = end - start;

            int reactHeight = Math.min(height[start], height[end]);

            reactMaxArea = Math.max(reactMaxArea, reactWidth * reactHeight);

            if(height[start] < height[end]) start+=1;

            end-=1;


        }
        return reactMaxArea;
    }
}
