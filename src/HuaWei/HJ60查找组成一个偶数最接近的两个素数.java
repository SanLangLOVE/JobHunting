package HuaWei;
/*
Author:Sanro
Time:2022.05.25 17:02:31
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
任意一个偶数（大于2）都可以由2个素数组成，
组成偶数的2个素数有很多种情况，
本题目要求输出组成指定偶数的两个素数差值最小的素数对。

数据范围：输入的数据满足 4 \le n \le 1000 \4≤n≤1000
输入描述：
输入一个大于2的偶数

输出描述：
从小到大输出两个素数

示例1
输入：
20

输出：
7
13

示例2
输入：
4

输出：
2
2

*/

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class HJ60查找组成一个偶数最接近的两个素数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            // 从 n/2 开始向左进行查找，找到第一个素数x且n-x的数为素数的数，即为答案
            for (int i = n >> 1; i >= 2; i--) {
                if (judgePrime(i) && judgePrime(n - i)) {
                    System.out.println(i);
                    System.out.println(n - i);
                    break;
                }
            }
        }
    }

    // 判断是否是素数
    public static boolean judgePrime(int num) {
        int prime = 2; // 从2开始计算素数
        while (prime < num) {
            if (num % prime++ == 0) {
                return false; // 能被num以下的值整除，说明不是素数
            }
        }
        return true;
    }
}

