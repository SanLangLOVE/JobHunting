package HuaWei;
/*
Author:Sanro
Time:2022.05.25 12:49:22
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
输入n个整数，找出其中最小的k个整数并按升序输出
本题有多组输入样例
数据范围：1≤n≤1000  ，输入的整数满足 1≤val≤10000

输入描述：
第一行输入两个整数n和k
第二行输入一个整数数组

输出描述：
从小到大输出最小的k个整数，用空格分开。

示例1
输入：
5 2
1 3 5 7 2

输出：
1 2

*/

import java.util.*;
import java.io.*;

import java.util.*;

public class HJ58n个整数中最小的k个 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<k;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

