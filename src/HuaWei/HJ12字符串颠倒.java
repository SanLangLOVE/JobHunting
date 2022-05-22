package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）

输入描述：
输入一行，为一个只包含小写字母的字符串。

输出描述：
输出该字符串反转后的字符串。

示例1
输入：
abcd
复制
输出：
dcba

*/
import java.util.Scanner;

/*
* 描述
接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）

输入描述：
输入一行，为一个只包含小写字母的字符串。

输出描述：
输出该字符串反转后的字符串。

示例1
输入：
abcd

输出：
dcba
*/
public class HJ12字符串颠倒 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        char[] chars = String.valueOf(next).toCharArray();
        //System.out.println(chars[0]);
        for (int i= 0 ;i<chars.length ; i++){
            System.out.print(chars[chars.length-i-1]);
        }
    }
}
