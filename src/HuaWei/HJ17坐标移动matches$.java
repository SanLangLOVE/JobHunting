package HuaWei;
/*
Author:Sanro
Time:2022.05.16 13:27:59
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。
从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
输入：
合法坐标为A(或者D或者W或者S) + 数字（两位以内）
坐标之间以;分隔。
非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
下面是一个简单的例子 如：

A10;S20;W10;D30;X;A1A;B10A11;;A10;

处理过程：
起点（0,0）
+   A10   =  （-10,0）
+   S20   =  (-10,-20)
+   W10  =  (-10,-10)
+   D30  =  (20,-10)
+   x    =  无效
+   A1A   =  无效
+   B10A11   =  无效
+  一个空 不影响
+   A10  =  (10,-10)

结果 （10， -10）

数据范围：每组输入的字符串长度满足 1\le n \le 10000 \1≤n≤10000  ，
坐标保证满足 -2^{31} \le x,y \le 2^{31}-1 \−2
31≤x,y≤2 31-1  ，且数字部分仅含正数

输入描述：
一行字符串

输出描述：
最终坐标，以逗号分隔

示例1
输入：
A10;S20;W10;D30;X;A1A;B10A11;;A10;

输出：
10,-10

示例2
输入：
ABC;AKL;DA1;

输出：
0,0

*/

import java.util.*;
import java.io.*;
import java.util.*;
import java.io.*;

public class HJ17坐标移动matches$ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(";");
        int x = 0;
        int y = 0;
        for(String s : in){
            // 不满足题目给定坐标规则
            if(!s.matches("[WASD][0-9]{1,2}")){ continue; }
            int val = Integer.valueOf(s.substring(1));
            switch(s.charAt(0)){
                case 'W': y += val;break;
                case 'S': y -= val;break;
                case 'A': x -= val;break;
                case 'D': x += val;break;
            }
        }System.out.println(x+","+y);
    }
}

//public class HJ17坐标移动 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//    }
//
//    public static void xyz (String[] strs ){
//        String[] str = strs.split(";");
//        System.out.println(strs.length);
//            Integer x = 0,y=0;
//            char a = 'A',d='B',w='W',s='S';
//            for (int i = 0; i < strs.length; i++) {
//                System.out.println(strs[i]);
//                char[] chars = String.valueOf(strs[i]).toCharArray();
//                int WASD = Integer.parseInt(String.valueOf(chars[1])) * 10
//                        + Integer.parseInt(String.valueOf(chars[2]));
//                if (chars[0] == a) {
//                    x = x - WASD;
//                } else if (chars[0] == d) {
//                    x = x + WASD;
//                } else if (chars[0] == w) {
//                    y = y + WASD;
//                } else if (chars[0] == s) {
//                    y = y - WASD;
//                } else ;
//                System.out.println(WASD);
//            }
//            System.out.println(x+","+y);
//        }
//
//}


//输入：
//A10;S20;W10;D30;A10
//输出：
//10,-10