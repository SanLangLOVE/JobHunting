package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。

数据范围： 1 \le n \le 500 \1≤n≤500
输入描述：
输入一行没有空格的字符串。

输出描述：
输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。

示例1
输入：
abc
复制
输出：
3
复制
示例2
输入：
aaa
复制
输出：
1
复制
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
描述
编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。

数据范围： 1 \le n \le 500 \1≤n≤500
输入描述：
输入一行没有空格的字符串。

输出描述：
输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。

示例1
输入：
abc

输出：
3

示例2
输入：
aaa

输出：
1

 */
public class HJ10字符不重复个数统计 {
    public static void main(String[] args) {
        //思路：map去重 再求不重复个数
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int length = chars.length;
        //System.out.println(chars);
        Map<Integer,Character> map = new HashMap<>();
        for (int i=0; i<length ; i++){
            if (map.containsValue(chars[i])) continue;
            else map.put(i,chars[i]);
        }
        System.out.println(map.size());
    }
}
