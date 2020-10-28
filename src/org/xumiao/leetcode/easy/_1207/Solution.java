package org.xumiao.leetcode.easy._1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 1207. 独一无二的出现次数
 * <p>
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * <p>
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};

        Solution solution = new Solution();
        System.out.println(solution.uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        //汇总相同的值个数
        for (int i : arr) {
            int incrementVal = map.get(i) == null ? 1 : map.get(i) + 1;
            map.put(i, incrementVal);
        }
        //利用hashset去重map values
        return map.size() == new HashSet<>(map.values()).size();
    }
}
