package HuaWei;
/*
Author:Sanro
Time:2022.05.22 09:17:48
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
按照指定规则对输入的字符串进行处理。

详细描述：

第一步：将输入的两个字符串str1和str2进行前后合并。如给定字符串 "dec" 和字符串 "fab" ， 合并后生成的字符串为 "decfab"

第二步：对合并后的字符串进行排序，要求为：下标为奇数的字符和下标为偶数的字符分别从小到大排序。这里的下标的意思是字符在字符串中的位置。注意排序后在新串中仍需要保持原来的奇偶性。例如刚刚得到的字符串“decfab”，分别对下标为偶数的字符'd'、'c'、'a'和下标为奇数的字符'e'、'f'、'b'进行排序（生成 'a'、'c'、'd' 和 'b' 、'e' 、'f'），再依次分别放回原串中的偶数位和奇数位，新字符串变为“abcedf”

第三步：对排序后的字符串中的'0'~'9'、'A'~'F'和'a'~'f'字符，需要进行转换操作。
转换规则如下：
对以上需要进行转换的字符所代表的十六进制用二进制表示并倒序，然后再转换成对应的十六进制大写字符（注：字符 a~f 的十六进制对应十进制的10~15，大写同理）。
如字符 '4'，其二进制为 0100 ，则翻转后为 0010 ，也就是 2 。转换后的字符为 '2'。
如字符 ‘7’，其二进制为 0111 ，则翻转后为 1110 ，对应的十进制是14，转换为十六进制的大写字母为 'E'。
如字符 'C'，代表的十进制是 12 ，其二进制为 1100 ，则翻转后为 0011，也就是3。转换后的字符是 '3'。
根据这个转换规则，由第二步生成的字符串 “abcedf” 转换后会生成字符串 "5D37BF"。


数据范围：输入的字符串长度满足 1 \le n \le 100 \1≤n≤100

输入描述：
样例输入两个字符串，用空格隔开。

输出描述：
输出转化后的结果。

示例1
输入：
dec fab

输出：
5D37BF

示例2
输入：
ab CD

输出：
3B5D

说明：
合并后为abCD，按奇数位和偶数位排序后是CDab（请注意要按ascii码进行排序，所以C在a前面，D在b前面），转换后为3B5D
*/

import java.util.*;
import java.io.*;

public class HJ30字符串合并 {
    public static void main(String[] args) {
                processStr();
            }
            public static void processStr(){
                //hash 保存十六进制反转的对应表， 空间换时间
                Map<Character,Character> map = new HashMap<Character,Character>(){{
                    put('0', '0');
                    put('1', '8');
                    put('2', '4');
                    put('3', 'C');
                    put('4', '2');
                    put('5', 'A');
                    put('6', '6');
                    put('7', 'E');
                    put('8', '1');
                    put('9', '9');
                    put('a', '5');
                    put('b', 'D');
                    put('c', '3');
                    put('d', 'B');
                    put('e', '7');
                    put('f', 'F');
                    put('A', '5');
                    put('B', 'D');
                    put('C', '3');
                    put('D', 'B');
                    put('E', '7');
                    put('F', 'F');
                }};

                Scanner scanner = new Scanner(System.in);
                String s = "";
                while (scanner.hasNext()){
                    String s1 = scanner.next();
                    String s2 = scanner.next();
                    char[] ch = (s1 + s2).toCharArray();
                    //偶数位
                    char[] r1 = new char[ch.length / 2];
                    //奇数位
                    char[] r2 = new char[ch.length - ch.length / 2];
                    for (int i = 0, j = 0, k = 0; i < ch.length; i++){
                        if ( i % 2 == 0){
                            r2[j] = ch[i];
                            j++;
                        }else {
                            r1[k] = ch[i];
                            k++;
                        }
                    }

                    Arrays.sort(r1);
                    Arrays.sort(r2);

                    for (int i = 0, j = 0, k = 0; i < ch.length; i++){
                        if (i % 2 == 0){
                            //注意存在码表不包含的情况，使用原值
                            ch[i] = map.getOrDefault(r2[j], r2[j]);
                            j++;
                        }else {
                            ch[i] = map.getOrDefault(r1[k], r1[k]);
                            k++;
                        }
                    }

                    s = new String(ch);
                    System.out.println(s);

                }

                //return s;
            }

}
