package com.learn.algorithm.leetcode01;


public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    temp[index++] = i;
                    temp[index++] = j;
                }
            }
        }
        return temp;
    }
}
