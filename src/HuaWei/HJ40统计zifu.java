package HuaWei;
/*
Author:Sanro
Time:2022.05.22 19:12:18
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
数据范围：输入的字符串长度满足 1≤n≤1000
输入描述：
输入一行字符串，可以有空格

输出描述：
统计其中英文字符，空格字符，数字字符，其他字符的个数

示例1
输入：
1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][

输出：
26
3
10
12

*/

import java.util.*;
import java.io.*;

public class HJ40统计zifu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            String s1=str.replaceAll("[A-Z]+|[a-z]+", "");
            System.out.println(str.length()-s1.length());
            String s2=s1.replaceAll(" ", "");
            System.out.println(s1.length()-s2.length());
            String s3=s2.replaceAll("[0-9]+", "");
            System.out.println(s2.length()-s3.length()+"\n"+s3.length());
        }
    }
}
