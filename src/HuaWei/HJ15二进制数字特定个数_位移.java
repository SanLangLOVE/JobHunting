package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。

数据范围：保证在 32 位整型数字范围内
输入描述：
 输入一个整数（int类型）

输出描述：
 这个数转换成2进制后，输出1的个数

示例1
输入：
5
输出：
2

示例2
输入：
0
输出：
0

*/

import java.util.*;
import java.io.*;
/*
位移是我的知识短板，下面补齐知识不足
左移运算符 <<
右移运算符 >>
无符号左移运算符 <<<
无符号右移运算符 >>>
1100 1101 (205)
左移一位 0001 1001 1010 (410) 左边加一位1
右移一位 0000 0110 0110 (102) 右边减一位

无符号右移运算符>>>和右移运算符>>是一样的，
只不过右移时左边是补上符号位（负数补1整数补0），
而无符号右移运算符是补上0，
也就是说，对于正数移位来说等同于：>>，
负数通过此移位运算符能移位成正数。
*/
public class HJ15二进制数字特定个数_位移 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //假如输入1010 0011
        int n = 0; //统计个数
        for (int i = 0; i < 32; i++) {  //32确定二进制不超过32位
            if ((num&1)==1) n++;        //末位与1进行与运算 同1为1其他为零
            num=num>>>1;                //无符号右移一位 比较数据的第二位
        }
        System.out.println(n);
    }
}
