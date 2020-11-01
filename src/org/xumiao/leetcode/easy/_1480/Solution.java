package org.xumiao.leetcode.easy._1480;

import java.util.Arrays;

/**
 * 1480. 一维数组的动态和
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * <p>
 * 请返回 nums 的动态和。
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(new Solution().runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int[] resultArr = new int[nums.length];
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                sum += nums[i];
            }
            resultArr[i] = sum;
        }
        return resultArr;
    }
}
