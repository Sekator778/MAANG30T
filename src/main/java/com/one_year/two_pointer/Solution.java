package com.one_year.two_pointer;

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }
}