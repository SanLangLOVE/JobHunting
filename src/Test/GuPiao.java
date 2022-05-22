package Test;
/*
Author:Sanro
Time:2022.05.15 15:58:07
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
假定你知道某只股票每一天价格的变动。
你最多可以同时持有一只股票。但你最多只能进行两次交易
（一次买进和一次卖出记为一次交易。买进和卖出均无手续费）。
请设计一个函数，计算你所能获得的最大收益。

示例1
输入
[8,9,3,5,1,3]
输出
4

//import java.util.*;
//public class Solution {
//public int maxProfit (int[] prices) {
//        // write code here
//        // 买卖两次，需要使用到三元数组
//
//        if(prices.length == 0) {
//        return 0;
//        }
//
//        // 0表示不持有，1表示持有
//        // dp[天数][交易的次数][持有的状态]
//        int[][][] dp = new int[prices.length][3][2];
//
//        // 初始化
//        for(int i = 0;i <= 2;i++) {
//        // 不持有的时候 为0
//        dp[0][i][0] = 0;
//        // 持有的时候，为第一天的值
//        dp[0][i][1] = -prices[0];
//        }
//
//        for(int i = 1;i < prices.length;i++) {
//        for(int k = 0;k <= 2;k++) {
//        // 交易0次
//        if(k == 0) {
//        // 不可能的值，赋值为MIN_VALUE
//        dp[i][k][1] = Integer.MIN_VALUE;
//        dp[i][k][0] = 0;
//        continue;
//        }
//        dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k][1] + prices[i]);
//        dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k-1][0] - prices[i]);
//        }
//        }
//        return dp[prices.length - 1][2][0];
//        }
//        }
*/

import java.util.*;
import java.io.*;

public class GuPiao {
    public static void main(String[] args) {
        int[] prices = {8,9,3,5,1,4};
        maxProfit(prices);
    }
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * 两次交易所能获得的最大收益
         * @param prices int整型一维数组 股票每一天的价格
         * @return int整型
         */
        public static int maxProfit (int[] prices) {
            int len = prices.length;
            int[] prsub = new int[len-1]; //
            for (int i = 0; i < len; i++) {
                prsub[i]=prices[i+1]-prices[i];
            }
            return 0;
        }
}
