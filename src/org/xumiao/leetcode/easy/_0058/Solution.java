package org.xumiao.leetcode.easy._0058;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class Solution {

    public static void main(String[] args) {
        String str = "abcdefg";
        int n = 2;
        System.out.println(new Solution().reverseLeftWords(str, n));
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
