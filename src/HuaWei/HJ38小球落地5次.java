package HuaWei;
/*
Author:Sanro
Time:2022.05.22 18:45:11
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半;
再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
数据范围：输入的小球初始高度满足1≤n≤1000  ，且保证是一个整数

输入描述：
输入起始高度，int型

输出描述：
分别输出第5次落地时，共经过多少米以及第5次反弹多高。
注意：你可以认为你输出保留六位或以上小数的结果可以通过此题。
示例1
输入：
1

输出：
2.875
0.03125

*/

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ38小球落地5次 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine()) != null) {
            double height = Double.parseDouble(s);
            // length at 1st get ground
            double length = height + 0.0;
            for (int i = 2; i <= 5; i++) {
                length += height;
                height /= 2;
            }
            System.out.println(length);
            System.out.println(height/2);

        }
        br.close();
    }
}
