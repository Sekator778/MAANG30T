package com.one_year.two_pointer;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int slow=0;
        for(int fast=0; fast<nums.length; fast++){
            if (nums[fast] != 0){
                System.out.println("swap");
                int temp = nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
            }
       
        }
    }
}