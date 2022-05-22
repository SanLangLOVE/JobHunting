package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是 0 。

数据范围： 1 \le n \le 10^{8} \1≤n≤10
8

输入描述：
输入一个int型整数

输出描述：
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入：
9876673
复制
输出：
37689

*/
import org.omg.Messaging.SyncScopeHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
描述
输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是 0 。

数据范围： 1 \le n \le 10^{8} \1≤n≤10

输入描述：
输入一个int型整数

输出描述：
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入：
9876673

输出：
37689
*/
public class HJ9提取不重复整数 {
    //下面正确思路：先倒置数组  再放进Map中  最后去重输出
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        char[] c_d = new char[c.length];
        //倒置数组
        for (int i= 0; i<c.length ; i++){
            c_d[c.length-i-1] = c[i];
        }
        //放入map
        Map<Integer, Character> table = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
          if (table.containsValue(c_d[i])) continue;
            else    table.put( i,  c_d[i]);
        }
        //去重输出
        for (int i = 0; i< c.length ;i++){
            if (table.get(i)!=null) System.out.print(table.get(i));
            else continue;
        }

    }
}
/*
正确思路：先倒置 再去重输出
2344356
6534432
65342
错误思路：先去重 再倒置输出
2344356
23456
65432
*/