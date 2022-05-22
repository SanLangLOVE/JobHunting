package Test;
/*
Author:Sanro
Time:2022.05.17 16:00:56
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;

public class Solution {
    /*1、定义一个函数，要求传入一个数组，
    使奇数在偶数前面;*/
    public static class Main {
        public static void main(String[] args) {
            int[] nums = {1,3,4,6,5,7};
            solution(nums);
        }
        public static void solution(int[] nums){
            int len = nums.length;
            Arrays.sort(nums);//第一步：先排序
            int[] nums_ji = new int[len];
            int[] nums_ou = new int[len];
            for(int i =0 ; i<len ; i++){ //第二步：分奇偶
                if (nums[i]%2==0){ nums_ou[i]=nums[i];}
                else{ nums_ji[i] = nums[i];}
            }
            for(int i =0 ; i<len ; i++){//第三步：再比较输出
                if(nums_ji[i]>nums_ou[i]) System.out.println(nums_ji[i]);
                else System.out.println(nums_ou[i]);
            }
        }
    }

}
