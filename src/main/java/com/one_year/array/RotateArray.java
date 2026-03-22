package com.one_year.array;

class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;

        reverse(nums, 0, length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);
    }

    private void reverse(int nums[], int start, int end){
        while(start<end){
//            int tmp = nums[start];
//            nums[start]= nums[end];
//            nums[end]=tmp;
            nums[start] = swap(nums[start], nums[end]);
            nums[end] = swap(nums[end], nums[start]);

            start++;
            end--;
        }
    }

    private int swap(int a, int b){
        a = a^b;
        b=b^a;
        a=a^b;

        return b;

    }
}