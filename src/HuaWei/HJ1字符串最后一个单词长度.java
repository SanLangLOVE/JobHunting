package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
•输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；

•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
输入描述：
连续输入字符串(每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：
abc

输出：
abc00000

*/
import java.util.Scanner;

public class HJ1字符串最后一个单词长度 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = s.length() - 1;
        int t = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            t++;
            i--;
        }
        System.out.println(t);
    }
}
