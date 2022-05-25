package HuaWei;
/*
Author:Sanro
Time:2022.05.25 17:11:08
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
把m个同样的苹果放在n个同样的盘子里，
允许有的盘子空着不放，问共有多少种不同的分法？
注意：如果有7个苹果和3个盘子，（
5，1，1）和（1，5，1）被视为是同一种分法。

数据范围：0≤m≤10 ，1≤n≤10 。

输入描述：
输入两个int整数

输出描述：
输出结果，int型

示例1
输入：
7 3

输出：
8

*/

import java.util.*;
import java.io.*;

import java.util.Scanner;
public class HJ61放苹果 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            System.out.println(count(sc.nextInt(),sc.nextInt()));
        }
        sc.close();
    }
    public static int count(int m,int n)
    {
        if(m<0||n<=0)
            return 0;
        //细分到苹果数为一或盘子数为一的情况返回一
        if(m==1||n==1||m==0)
            return 1;
        //将此事件无线细分
        return count(m,n-1)+count(m-n,n);
    }
}