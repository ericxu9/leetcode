package org.xumiao.leetcode.easy._0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 5, 11};
        int target = 10;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum2(nums, target)));
    }

    /**
     * 利用hashmap处理
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] index = new int[2];
        //map用于存储数组值和对应的index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int subVal = target - nums[i];
            if (map.containsKey(subVal)) {
                index[0] = map.get(subVal);
                index[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return index;
    }

    /**
     * 暴力解题
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}
