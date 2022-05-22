package HuaWei;
/*
Author:Sanro
Time:2022.05.22 18:42:48
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
有一种兔子，从出生后第3个月起每个月都生一只兔子，
小兔子长到第三个月后每个月又生一只兔子。
例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
数据范围：输入满足1≤n≤31
输入描述：
输入一个int型整数表示第n个月

输出描述：
输出对应的兔子总数

示例1
输入：
3

输出：
2
*/

import java.util.*;
import java.io.*;

import java.util.*;

public class HJ37生兔子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int month = scanner.nextInt();
            System.out.println(f(month));
        }
    }

    public static int f(int month) {
        if (month < 3) {
            return 1;
        }
        // 前两个月的情况已经写出来了，我们从第三个月开始算
        int m1 = 0;
        int m2 = 1;
        int m3 = 0;
        for (int i = 2; i < month; i++) {
            m3 = m1 + m2;
            m2 = m1;
            m1 = m3;
        }
        return m1 + m2 + m3;
    }
}

