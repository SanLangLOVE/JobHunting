package HuaWei;
/*
Author:Sanro
Time:2022.05.25 12:52:54
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
找出字符串中第一个只出现一次的字符
数据范围：输入的字符串长度满足 1≤n≤1000
输入描述：
输入一个非空字符串

输出描述：
输出第一个只出现一次的字符，如果不存在输出-1

示例1
输入：
asdfasdfo

输出：
o

*/

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class HJ59字符串中第1个只出现1次的字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int len = str.length(); // 字符串总长度
            char res = '0'; // 存放结果的字符
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String s = String.valueOf(ch);
                int newLen = str.replaceAll(s, "").length();
                if ((len - newLen) == 1) {
                    res = ch;
                    break; // 存在只出现一次的字符，退出循环输出结果
                }
            }

            // 打印结果
            if ('0' == res) {
                System.out.println(-1);
            } else {
                System.out.println(res);
            }
        }
    }
}

