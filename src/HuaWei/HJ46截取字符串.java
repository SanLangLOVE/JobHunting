package HuaWei;
/*
Author:Sanro
Time:2022.05.23 10:24:14
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;

import java.util.*;

public class HJ46截取字符串 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            // 输入字符串和k
            String str = sc.next();
            int k = sc.nextInt();
            // 直接使用String的substring方法输出结果
            System.out.println(str.substring(0,k));
        }
    }
}

