package Test;
/*
Author:Sanro
Time:2022.05.15 15:41:13
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;

public class aa {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2} ;
        int n = 5;
        int K = 3;
        findKth(a,5,3);
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        int q = a[K-1];
        System.out.println(q);
        return 0;
    }

}
