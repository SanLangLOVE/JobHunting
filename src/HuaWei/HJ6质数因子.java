package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）


数据范围： 1 \le n \le 2 \times 10^{9} + 14 \1≤n≤2×10
9
 +14
输入描述：
输入一个整数

输出描述：
按照从小到大的顺序输出它的所有质数的因子，以空格隔开。

示例1
输入：
180
复制
输出：
2 2 3 3 5

*/
import java.util.Scanner;

/**
 * 【质数因子】
 *  描述：输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）
 *  （如180的质因子为2 2 3 3 5 ）
 *  【重要知识点】：每一个正整数的质数因子都不会超过本身的算术平方根+1
 */
public class HJ6质数因子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nextInt = sc.nextInt();
        // 临时保存输入的初始值
        int temp = nextInt;
        // 输入值开平方根
        Double sqrt = Math.sqrt(nextInt);

        for (int k = 2; k <= sqrt.intValue() + 1;) {
            if (nextInt % k == 0) {
                nextInt = nextInt / k;
                System.out.print(k + " ");
            } else {
                k++;
            }
        }

        if (temp == nextInt) {
            // 本身就是质数
            System.out.println(temp);
        } else if (nextInt != 1) {
            System.out.println(nextInt);
        }
    }
}

