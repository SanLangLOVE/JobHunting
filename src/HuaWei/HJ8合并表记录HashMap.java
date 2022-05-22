package HuaWei;
/*
Author:Sanro
Time:2022.05.15 14:01:01
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。


提示:
0 <= index <= 11111111
1 <= value <= 100000

输入描述：
先输入键值对的个数n（1 <= n <= 500）
接下来n行每行输入成对的index和value值，以空格隔开

输出描述：
输出合并后的键值对（多行）

示例1
输入：
4
0 1
0 2
1 2
3 4
复制
输出：
0 3
1 2
3 4
复制
示例2
输入：
3
0 1
0 2
8 9
复制
输出：
0 3
8 9

*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//数据表记录包含表索引index和数值value（int范围的正整数），
// 请对表索引相同的记录进行合并，
// 即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
//        提示:
//        0 <= index <= 11111111
//        1 <= value <= 100000
//
//        输入描述：
//        先输入键值对的个数n（1 <= n <= 500）
//        接下来n行每行输入成对的index和value值，以空格隔开
//
//        输出描述：
//        输出合并后的键值对（多行）
//输入：
//4
//0 1
//0 2
//1 2
//3 4
//
//输出：
//0 3
//1 2
//3 4
public class HJ8合并表记录HashMap {
    //哈希表重中之重
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tableSize = scanner.nextInt();
        Map<Integer, Integer> table = new HashMap<>(tableSize);
        for (int i = 0; i < tableSize; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (table.containsKey(key)) {
                table.put(key, table.get(key) + value);
            } else {
                table.put(key, value);
            }
        }
        for (Integer key : table.keySet()) {
            System.out.println( key + " " + table.get(key));
        }
    }
}
