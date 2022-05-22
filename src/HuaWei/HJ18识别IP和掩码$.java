package HuaWei;
/*
Author:Sanro
Time:2022.05.16 15:51:17
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。

所有的IP地址划分为 A,B,C,D,E五类

A类地址从1.0.0.0到126.255.255.255;

B类地址从128.0.0.0到191.255.255.255;

C类地址从192.0.0.0到223.255.255.255;

D类地址从224.0.0.0到239.255.255.255；

E类地址从240.0.0.0到255.255.255.255


私网IP范围是：

从10.0.0.0到10.255.255.255

从172.16.0.0到172.31.255.255

从192.168.0.0到192.168.255.255


子网掩码为二进制下前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
（注意二进制下全是1或者全是0均为非法子网掩码）

注意：
1. 类似于【0.*.*.*】和【127.*.*.*】的IP地址不属于上述输入的任意一类，也不属于不合法ip地址，计数时请忽略
2. 私有IP地址和A,B,C,D,E类地址是不冲突的

输入描述：
多行字符串。每行一个IP地址和掩码，用~隔开。

请参考帖子https://www.nowcoder.com/discuss/276处理循环输入的问题。
输出描述：
统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。

示例1
输入：
10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0

输出：
1 0 1 0 0 2 1
说明：
10.70.44.68~255.254.255.0的子网掩码非法，19..0.~255.255.255.0的IP地址非法，所以错误IP地址或错误掩码的计数为2；
1.0.0.1~255.0.0.0是无误的A类地址；
192.168.0.2~255.255.255.0是无误的C类地址且是私有IP；
所以最终的结果为1 0 1 0 0 2 1
示例2
输入：
0.201.56.50~255.255.111.255
127.201.56.50~255.255.111.255

输出：
0 0 0 0 0 0 0

说明：
类似于【0.*.*.*】和【127.*.*.*】的IP地址不属于上述输入的任意一类，也不属于不合法ip地址，计数时请忽略
*/

import java.util.*;
import java.io.*;

import java.util.*;
/*
结合前面几位大佬的题解，整出一个Java版.这里有个大坑，
若是ip是0或者127开头的直接忽略，即使子网掩码是非法的，
也不能将此算到error里去。 具体实现

查看ip第一段是否为“0”或“127”，若是忽略；
判断子网掩码是否合法，如果满足下列条件之一即为非法掩码
数字段数不为4
在二进制下，不满足前面连续是1，然后全是0
在二进制下，全为0或全为1
判断IP地址是否合法，如果满足下列条件之一即为非法地址
数字段数不为4，比如存在空段，即【192..1.0】这种；
某个段的数字大于255
判断ip是否是ABCDE类地址，若是对应类加一。

所有的IP地址划分为 A,B,C,D,E五类：
A类地址1.0.0.0 ~ 126.255.255.255;
B类地址128.0.0.0 ~ 191.255.255.255;
C类地址192.0.0.0 ~ 223.255.255.255;
D类地址224.0.0.0 ~ 239.255.255.255；
E类地址240.0.0.0 ~ 255.255.255.255

判断ip是否私有地址。
私网IP范围是：
10.0.0.0～10.255.255.255
172.16.0.0～172.31.255.255
192.168.0.0～192.168.255.255
*/
public class HJ18识别IP和掩码$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aNum = 0;
        int bNum = 0;
        int cNum = 0;
        int dNum = 0;
        int eNum = 0;
        int errNum = 0;
        int pNum = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] strArr = str.split("~");
            int ipFirst = getIpSeg(strArr[0], 0);
            if (ipFirst == 0 || ipFirst == 127) {
                continue;
            }
            if (maskIsInvaild(strArr[1])) {
                errNum++;
                continue;
            }
            if (ipIsInvaild(strArr[0])) {
                errNum++;
                continue;
            }
            if (ipFirst >= 1 && ipFirst <= 126) {
                aNum++;
            }
            if (ipFirst >= 128 && ipFirst <= 191) {
                bNum++;
            }
            if (ipFirst >= 192 && ipFirst <= 223) {
                cNum++;
            }
            if (ipFirst >= 224 && ipFirst <= 239) {
                dNum++;
            }
            if (ipFirst >= 240 && ipFirst <= 255) {
                eNum++;
            }
            int ipSecond = getIpSeg(strArr[0], 1);
            if (ipFirst == 10 || (ipFirst == 172 && ipSecond >= 16 && ipSecond <=31) || (ipFirst == 192 && ipSecond == 168)) {
                pNum++;
            }
        }
        System.out.println(aNum + " " + bNum + " " + cNum + " " + dNum + " " + eNum + " " + errNum + " " + pNum);
    }

    public static boolean maskIsInvaild(String mask) {
        String[] maskArr = mask.split("\\.");
        if (maskArr.length != 4) {
            return true;
        }
        String maskBinary = toBinary(maskArr[0]) + toBinary(maskArr[1]) + toBinary(maskArr[2]) + toBinary(maskArr[3]);
        if (!maskBinary.matches("[1]{1,}[0]{1,}")) {
            return true;
        }
        return false;
    }

    public static String toBinary(String num) {
        String numBinary = Integer.toBinaryString(Integer.valueOf(num));
        while (numBinary.length() < 8) {
            numBinary = "0" + numBinary;
        }
        return numBinary;
    }

    public static boolean ipIsInvaild(String ip) {
        String[] ipArr = ip.split("\\.");
        if (ipArr.length != 4) {
            return true;
        }
        if (Integer.valueOf(ipArr[0]) > 255 || Integer.valueOf(ipArr[1]) > 255 || Integer.valueOf(ipArr[2]) > 255 || Integer.valueOf(ipArr[3]) > 255) {
            return true;
        }
        return false;
    }

    public static int getIpSeg(String ip, int index) {
        String[] ipArr = ip.split("\\.");
        return Integer.valueOf(ipArr[index]);
    }
}

