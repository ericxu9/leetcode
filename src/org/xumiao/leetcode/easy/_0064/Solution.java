package org.xumiao.leetcode.easy._0064;

/**
 * 剑指 Offer 64. 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().sumNums(9));
    }

    public int sumNums(int n) {
        return n == 0 ? 0 : n + sumNums(n-1);
    }
}
