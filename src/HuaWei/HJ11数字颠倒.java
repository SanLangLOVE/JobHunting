package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001


数据范围： 0 \le n \le 2^{30}-1 \0≤n≤2
30
 −1
输入描述：
输入一个int整数

输出描述：
将这个整数以字符串的形式逆序输出

示例1
输入：
1516000
复制
输出：
0006151
复制
示例2
输入：
0
复制
输出：
0

*/
import java.util.Scanner;

/*
描述
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001


数据范围： 0 \le n \le 2^{30}-1 \0≤n≤2
30
 −1
输入描述：
输入一个int整数

输出描述：
将这个整数以字符串的形式逆序输出

示例1
输入：
1516000

输出：
0006151

*/
public class HJ11数字颠倒 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        char[] chars = String.valueOf(nextInt).toCharArray();
        //System.out.println(chars[0]);
        for (int i= 0 ;i<chars.length ; i++){
            System.out.print(chars[chars.length-i-1]);
        }
    }
}
