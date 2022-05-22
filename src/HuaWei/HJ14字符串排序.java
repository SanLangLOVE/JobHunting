package HuaWei;
import java.util.Arrays;
import java.util.Scanner;

/*
Author:Sanro
Time:2022.05.14 16:22:50
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
给定 n 个字符串，请对 n 个字符串按照字典序排列。

数据范围： 1 \le n \le 1000 \1≤n≤1000  ，字符串长度满足 1 \le len \le 100 \1≤len≤100
输入描述：
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
输出描述：
数据输出n行，输出结果为按照字典序排列的字符串。
示例1
输入：
9
cap
to
cat
card
two
too
up
boat
boot

输出：
boat
boot
cap
card
cat
to
too
two
up

*/
public class HJ14字符串排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            //strs[i] = sc.nextLine();
            //这是因为之前输入一个nextInt后，输入的回车会被nextLine给接受，所以排序会少最后输入的字符串。
            //更改方案：可以将nextLine改为next，后者不接受空格回车：
            strs[i] = sc.next();
        }
        Arrays.sort(strs);
        for (String s : strs) {
            System.out.println(s);
        }
    }
}
