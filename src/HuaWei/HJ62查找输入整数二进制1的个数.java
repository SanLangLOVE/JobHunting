package HuaWei;
/*
Author:Sanro
Time:2022.05.25 17:15:02
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
输入一个正整数，计算它在二进制下的1的个数。
注意多组输入输出！！！！！！

数据范围：1≤n≤2 的31−1
输入描述：
输入一个整数

输出描述：
计算整数二进制中1的个数

示例1
输入：
5

输出：
2

说明：
5的二进制表示是101，有2个1
示例2
输入：
0

输出：
0

*/

import java.util.*;
import java.io.*;

import java.util.*;

public class HJ62查找输入整数二进制1的个数 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int in = input.nextInt();
            int count=0;
            while(in!=0){
                if(in%2==1) count++;
                in=in>>1;
            }
            System.out.println(count);
        }
    }
}
