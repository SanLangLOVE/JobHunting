package HuaWei;
/*
Author:Sanro
Time:2022.05.24 11:54:19
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;

public class HJ53杨辉三角变形 {
    //这题不难，就是看规律。
    //如果是第一行和第二行，直接输出-1。
    //可以看出规律，奇数行的的第二位数值都是偶数。
    //另外，可以发现4的倍数行，第三位数值都是偶数。
    //其余，第四位数值都是偶数。
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int ans = 0;
            if(n == 1 || n == 2){    //如果是第一行和第二行，直接输出-1。
                ans = -1;
            }else if(n % 2 != 0){    //可以看出规律，奇数行的的第二位数值都是偶数。
                ans = 2;
            }else if(n % 4 == 0){    //另外，可以发现4的倍数行，第三位数值都是偶数。
                ans = 3;
            }else{                    //其余，第四位数值都是偶数。
                ans = 4;
            }
            System.out.print(ans);
        }
    }
}

