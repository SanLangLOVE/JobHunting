package HuaWei;
/*
Author:Sanro
Time:2022.05.19 10:19:59
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，
则把出现次数最少的字符都删除。输出删除这些单词后的字符串，
字符串中其它字符保持原来的顺序。
数据范围：输入的字符串长度满足  \1≤n≤20  ，
保证输入的字符串中仅出现小写字母

输入描述：
字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。

输出描述：
删除字符串中出现次数最少的字符后的字符串。

示例1
输入：
aabcddd

输出：
aaddd
*/

import java.util.*;
import java.io.*;

public class HJ23s删除字符串出现最少的字符 {
    //利用HashMap，其中key为每一个字符，value为每个字符出现的次数
    // 记录下最小的次数，最后将出现次数为非最小值的输出。
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        while(in.hasNextLine()){
            int min = Integer.MAX_VALUE;
            String str = in.nextLine();
            int len = str.length();
            for(int i = 0; i < len; i++){
                char ch = str.charAt(i);
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                    min = Math.min(min,1);
                }else{
                    int num = map.get(ch) + 1;
                    map.put(ch,num);
                    if(!map.containsValue(min)){//最小值增大的情况
                        min = num;
                    }
                }
            }
            for(int i = 0; i < len; i++){
                if(min != map.get(str.charAt(i))){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
            map.clear();
        }
    }
}
