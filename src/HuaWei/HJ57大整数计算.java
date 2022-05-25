package HuaWei;
/*
Author:Sanro
Time:2022.05.25 12:46:37
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.math.*;
import java.util.*;
import java.io.*;

public class HJ57大整数计算 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s1 = scan.next();
            String s2 = scan.next(); //输入两个数
            BigInteger a = new BigInteger(s1); //将字符串转成大整数
            BigInteger b = new BigInteger(s2);//在java.math中
            System.out.println(a.add(b)); //大整数相加
        }
    }
}

