package HuaWei;
/*
Author:Sanro
Time:2022.05.22 10:05:29
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，
比如像这些ABBA，ABA，A，123321，但是他们有时会在开始或结束时加入一些
无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,
123321->51233214　。因为截获的串太长了，而且存在多种可能的情况
（abaaab可看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，
他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？

数据范围：字符串长度满足 1≤n≤2500
输入描述：
输入一个字符串（字符串的长度不超过2500）

输出描述：
返回有效密码串的最大长度

示例1
输入：
ABBA

输出：
4

示例2
输入：
ABBBA

输出：
5

示例3
输入：
12HHHHA

输出：
4

*/

import java.util.*;
import java.io.*;

public class HJ32密码截取 {
    //方法1：中心扩散法
    //解题思路：
    //最长回文子串的中心扩散法，遍历每个字符作为中间位，进行左右比较
    //算法流程：
    //从右到左，对每个字符进行遍历处理，并且每个字符要处理两次，
    // 因为回文子串有两种情况：
    //ABA型：只需要从当前字符向两边扩散，比较左右字符是否相等，
    // 找出以当前字符为中心的最长回文子串长度
    //ABBA型：只需要从当前字符和下一个字符向两边扩散，比较左右字符是否相等，
    // 找出以当前字符和下一个字符为中心的最长回文子串长度
    //最后比对两种类型的长度，取自较长的长度
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            // ABA型
            int len1 = longest(s, i, i);
            // ABBA型
            int len2 = longest(s, i, i + 1);
            res = Math.max(res, len1 > len2 ? len1 : len2);
        }
        return res;
    }

    private static int longest(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

}
