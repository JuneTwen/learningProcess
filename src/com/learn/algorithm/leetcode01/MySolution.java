package com.learn.algorithm.leetcode01;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 */
public class MySolution {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        // HashMap<nums[i], i> 值看作 key, 下标看作 value
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int realTarget = target - nums[i];
            // 利用 containsKey 查找 ? 满足 target = nums[i] + ?
            if (hashMap.containsKey(realTarget)){
                // 再通过 get(key) 获取下标
                return new int[]{hashMap.get(realTarget), i};
            }
            // 往哈希表中添加数据的同时进行查找，时间复杂度 O(N)
            hashMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(MySolution.twoSum(nums, 13)));
    }
}
