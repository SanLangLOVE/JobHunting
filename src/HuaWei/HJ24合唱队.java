package HuaWei;
/*
Author:Sanro
Time:2022.05.19 10:56:19
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
N 位同学站成一排，音乐老师要请最少的同学出列，使得剩下的 K 位同学排成合唱队形。
设KK位同学从左到右依次编号为 1，2…，K ，他们的身高分别为T_1,T_2,…,T_KT
若存在i(1\leq i\leq K)i(1≤i≤K) 使得T_1<T_2<......<T_{i-1}<T_iT
且 T_i>T_{i+1}>......>T_KT
则称这KK名同学排成了合唱队形。
通俗来说，能找到一个同学，他的两边的同学身高都依次严格降低的队形就是合唱队形。

例子：
123 124 125 123 121 是一个合唱队形
123 123 124 122不是合唱队形，因为前两名同学身高相等，不符合要求
123 122 121 122不是合唱队形，因为找不到一个同学，他的两侧同学身高递减。

你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。

注意：不允许改变队列元素的先后顺序 且 不要求最高同学左右人数必须相等

数据范围： \1≤n≤3000
输入描述：
用例两行数据，第一行是同学的总数 N ，第二行是 N 位同学的身高，以空格隔开

输出描述：
最少需要几位同学出列

示例1
输入：
8
186 186 150 200 160 130 197 200

输出：
4

说明：
由于不允许改变队列元素的先后顺序，所以最终剩下的队列应该为186 200 160 130或150 200 160 130

*/

import java.util.*;
import java.io.*;
//求数组中最长递增子序列的变种问题。在此基础上，要求某个元素左边的序列是递增的，
//右边的序列是递减的，需要找出符合条件的总长度最长的序列。
//求某个元素的左边最长递增子序列和右边最长递减子序列，都可以使用动态规划来解决。
//然后求出以各个下标元素为合唱队峰值的
//最长序列长度 = 左侧最长递增子序列长度 + 右侧最长递减子序列长度 - 1（因为该位置被算了两次，所以减1）
//最后在所有最长序列长度中找出最长的那个，作为合唱队的最大人数。
//总人数减去这个值，就是应该淘汰的人数。
public class HJ24合唱队 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] heights = new int[num];

        for(int i = 0; i < num; i++){
            heights[i] = sc.nextInt();
        }
        sc.close();

        // 每个元素左边（含元素本身）最长的递增子序列的长度
        int[] left = new int[num];
        // 每个元素右边（含元素本身）最长的递减子序列的长度
        int[] right = new int[num];

        // 使用动态规划计算 left[] 和 right[] 数组
        for(int i = 0; i < num; i++){
            left[i] = 1;
            for(int j = 0; j < i; j++){
                if(heights[i] > heights[j]){
                    left[i] = Math.max(left[i], left[j] + 1);
                }
            }
        }

        for(int i = num - 1; i >= 0; i--){
            right[i] = 1;
            for(int j = num - 1; j > i; j--){
                if(heights[i] > heights[j]){
                    right[i] = Math.max(right[i], right[j] + 1);
                }
            }
        }

        // 计算以各个元素作为合唱队峰值（指挥人员）的最大合唱队人数
        int[] size = new int[num];
        for(int i = 0; i < num; i++){
            // 指挥人员本身在计算 left[] 和 right[] 时，各计算了一次，所以需要减 1
            size[i] = left[i] + right[i] - 1;
        }

        // 从 size[] 数组中选取出最大的一个合唱队人数
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num; i++){
            if(size[i] > max) max = size[i];
        }

        // 总人数减去合唱队人数，即是需要淘汰的人数
        System.out.println(num - max);

    }
}
/*
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        int[] fromLeft = new int[n];
        int[] fromRigt = new int[n];
        for(int i = 0; i < n; i++){
            students[i] = scanner.nextInt();
            fromLeft[i] = 1;
            fromRigt[i] = 1;
        }
        //dp[i]表示以第i个同学为最高同学时需要删除的同学数目
        //则students[0:i]的同学的身高需要呈现出递增,students[i:n]的同学身高需要呈现出递减
        //即左边删除最小数目的学生，右边也删除最小数目的学生
        //其实就是找两次最长递增子序列
        //分别是从左到右找最长递增子序列和从右向左找最长递增子序列

        //使用动态规划找
        //使用dp[i]表示以student[i]为末尾的最长递增子序列的长度
        //dp[i] = max(1,dp[j]+1 & student[j]<students[i])
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(students[i] > students[j]){
                    fromLeft[i] = Math.max(fromLeft[i], fromLeft[j] + 1);
                }
            }
        }

        for(int i = n - 2; i >= 0; i--){
            for(int j = n - 1; j >i; j--){
                if(students[i] > students[j]){
                    fromRigt[i] = Math.max(fromRigt[i], fromRigt[j] + 1);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int temp = n-(fromLeft[i] + fromRigt[i] - 1);
            ans = Math.min(ans, temp);
        }
        System.out.println(ans);
    }

}

*/