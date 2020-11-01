package org.xumiao.leetcode.easy._1601;

import java.util.Arrays;

/**
 * 面试题 16.01. 交换数字
 * 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
 * array.length == 2
 */
public class Solution {

    public static void main(String[] args) {
        int[] numbers = {1, 2};
        System.out.println(Arrays.toString(new Solution().swapNumbers(numbers)));
    }

    public int[] swapNumbers(int[] numbers) {
        numbers[0] ^= numbers[1];
        numbers[1] ^= numbers[0];
        numbers[0] ^= numbers[1];
        return numbers;
    }
}
