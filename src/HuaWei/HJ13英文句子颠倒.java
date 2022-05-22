package HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Author：Sanro
Time： 2022.05.14 14:49:22
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:HJ13 句子倒序
描述
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
数据范围：输入的字符串长度满足 1 \le n \le 1000 \1≤n≤1000
注意本题有多组输入

输入描述：
输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。

输出描述：
得到逆序的句子

示例1
输入：
I am a boy

输出：
boy a am I

*/
public class HJ13英文句子颠倒 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接收的字符串后面再额外不一个空格，方便后面判断
        String str = sc.nextLine()+" ";
        char[] chars = str.toCharArray();
        //以空格为界限，把数字内容放入map中，再倒序输出
        Map<Integer,String> map = new HashMap<>();
        String s ="";
        System.out.println(s.length());
        int count =0;
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i]==' '){
                count++;
                map.put(count,s);
                System.out.println(map.values());
                s="";
            }
            else{ s=s+chars[i];}
        }
        for (int i = 0 ; i<count ; i++){
            System.out.print(map.get(count-i)+" ");
        }
    }
}
