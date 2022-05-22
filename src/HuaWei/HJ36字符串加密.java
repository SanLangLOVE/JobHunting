package HuaWei;
/*
Author:Sanro
Time:2022.05.22 18:18:11
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：
首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，
只保留第1个，将所得结果作为新字母表开头，
并将新建立的字母表中未出现的字母按照正常字母表顺序加入新字母表。如下所示：
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
(实际需建立小写字母的字母表，此字母表仅为方便演示）

上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，
信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一
取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，
 Attack AT DAWN (黎明时攻击)就会被加密为Tpptad TP ITVH。
请实现下述接口，通过指定的密匙和明文得到密文。

数据范围：1 \le n \le 100 \1≤n≤100  ，保证输入的字符串中仅包含小写字母
输入描述：
先输入key和要加密的字符串
输出描述：
返回加密后的字符串
示例1
输入：
nihao
ni

输出：
le

*/

import java.util.*;
import java.io.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HJ36字符串加密 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        char[] target = bufferedReader.readLine().toCharArray();
        char[] chars = str.toCharArray();
        // 原始字母表
        Map<Character, Integer> letterMap = new TreeMap<>();
        for (int i = 0; i < 26; i++) {
            letterMap.put((char) ((int) 'a' + i), i);
        }
        // 新字母表
        List<Character> letterListNew = new LinkedList<>();
        // 遍历数据创建密钥字母表
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                // 建表时忽略大小写
                char c = String.valueOf(chars[i]).toLowerCase().charAt(0);
                // 若新字母表包含这个字母跳过
                if (letterListNew.contains(c)){
                    continue;
                }
                // 否则添加，并删除其在旧字母表中的信息
                else {
                    letterListNew.add(c);
                    letterMap.remove(c);
                }
            }
        }
        // 遍历填满剩下的字母
        for (Character character : letterMap.keySet()) {
            letterListNew.add(character);
        }
        // 暂存加密后的信息
        StringBuilder stringBuilder = new StringBuilder();
        // 遍历要加密的信息
        for (int i = 0; i < target.length; i++) {
            // 若是字母则加密
            if (Character.isLetter(target[i])){
                // 找到原始字母表中的顺序
                int i1 = (int)target[i] - (int)'a';
                // 插入当前字母表中该位置的字母
                stringBuilder.append(letterListNew.get(i1));
            }
            // 不是字母则直接插入
            else {
                stringBuilder.append(target[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}


