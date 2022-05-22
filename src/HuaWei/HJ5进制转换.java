package HuaWei;
//16进制的表示 0x（0x是固定写法）数字或者字母(A-F)可以是小写，
// 英文字母A，B，C，D，E，F分别表示数字10～15。
//        逢16进1，
//        例如:0xAF=175 的十进制如下：
//        相当于 10*16¹ + 15*16º = 160 +15 =175
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。

数据范围：保证结果在 1 \le n \le 2^{31}-1 \1≤n≤2
31
 −1
输入描述：
输入一个十六进制的数值字符串。

输出描述：
输出该数值的十进制字符串。不同组的测试用例用\n隔开。

示例1
输入：
0xAA
复制
输出：
170

*/

import java.util.Scanner;
public class HJ5进制转换 {
    public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         while(scan.hasNext()){
             String str=scan.next();
             //解法二： 直接用Integer.parseInt("String", 进制) 进行转换。
            System.out.println(Integer.parseInt(str.replaceAll("0x",""),16));
         }
    }
}

//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String str = in.nextLine();
//            String s1 = str.substring(2);
//            int a = Integer.valueOf(s1,16);
//            System.out.println(a);
