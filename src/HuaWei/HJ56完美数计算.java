package HuaWei;
/*
Author:Sanro
Time:2022.05.24 12:09:13
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
例如：28，它有约数1、2、4、7、14、28，除去它本身28外，
其余5个数相加，1+2+4+7+14=28。
输入n，请输出n以内(含n)完全数的个数。
数据范围： 1≤n≤5×10


输入描述：
输入一个数字n

输出描述：
输出不超过n的完全数的个数

示例1
输入：
1000

输出：
3

*/

import java.util.*;
import java.io.*;

public class HJ56完美数计算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
//这种题，不可能真的从 1 到 n 这个范围内找 有多少个 完全数。
// 因为题目给定的 n 的范围是 1<=n<=5∗1051<=n<=5*10^51<=n<=5∗10
// 所以就算是单纯遍历这么多个数，就已经相当的耗时了，
// 更别说一个一个数的判断，它是不是 完全数，不现实。
// 因此，我们直接看，完全数 到底有哪些，直接 给结果就好。
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = Integer.valueOf(scan.nextLine().trim());
//        if (n < 6) {
//            System.out.println(0);
//        } else if (n < 28) {
//            System.out.println(1);
//        } else if (n < 496) {
//            System.out.println(2);
//        } else if (n < 8128) {
//            System.out.println(3);
//        } else {
//            System.out.println(4);
//        }
//    }
//}