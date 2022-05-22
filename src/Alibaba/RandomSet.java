package Alibaba;

import java.util.Arrays; //打乱数组 
public class RandomSet { 
     public static int[] Srand(int[] a) { 
        int[] b = new int[a.length]; 
        for(int i = 0; i < a.length;i++) { 
            //随机获取下标 
            int tmp = (int)(Math.random()*(a.length - i)); 
            // 随机数:[ 0 ， a.length - i )
            b[i] = a[tmp]; //将此时a[tmp]的下标移动到靠后的位置 
            int change = a[a.length - i - 1]; 
            a[a.length - i - 1] = a[tmp]; 
            a[tmp] = change; }return b; }
public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9}; 
        System.out.println(Arrays.toString(Srand(a)));
    } 
}
