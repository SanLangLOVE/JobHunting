package HuaWei;
/*
Author:Sanro
Time:2022.05.17 20:03:40
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
密码要求:
1.长度超过8位
2.包括大小写字母.数字.其它符号,以上四种至少三种
3.不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）

数据范围：输入的字符串长度满足 1≤n≤100
输入描述：
一组字符串。

输出描述：
如果符合要求输出：OK，否则输出NG

示例1
输入：
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000

输出：
OK
NG
NG
OK

*/

import java.util.*;
import java.io.*;

public class HJ20密码合格验证 {
    //依次判断密码的条件。
    // 1：长度判断。
    // 2：四个种类的字符判断。用一个abcd四个变量代表四个条件来判断即可。
    // 3：重复判断，这个可以利用循环截取3个字符组成字符串s，
    // 使剩余字符与s模式匹配，如果匹配到了那说明重复，不合格。
    /*
    示例1
输入：
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000

输出：
OK
NG
NG
OK
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { //作用输入直到回车
            String pwds = in.nextLine();
            char[] pwd = pwds.toCharArray();
            int a=0,b=0,c=0,d=0 ;
            if(pwd.length>=8){
                for(int i =0;i<pwd.length;++i){
                    if(pwd[i]>='0'&&pwd[i]<='9')a=1;
                    else if(pwd[i]>='A'&&pwd[i]<='Z') b=1;
                    else if(pwd[i]>='a'&&pwd[i]<='z') c=1;
                    else d=1;
                    if(a+b+c+d>=3)break;
                }
                if(a+b+c+d>=3){
                    boolean isvalid = true;
                    for(int i =0;i<pwds.length()-3;++i){
                        String s = pwds.substring(i,i+3);
                        String ssuffix = pwds.substring(i+3);
                        if( ssuffix.contains(s)){
                            System.out.println("NG");
                            isvalid = false;
                            break;
                        }
                    }
                    if(isvalid)
                        System.out.println("OK");
                    continue;
                }
                else {
                    System.out.println("NG");
                    continue;
                }
            }
            System.out.println("NG");
        }
    }

}
