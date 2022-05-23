package HuaWei;
/*
Author:Sanro
Time:2022.05.23 11:24:21
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;

import java.util.*;

public class HJ51输出单向链表中倒数第k个结点 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            ListNode header = new ListNode();
            for (int i=0; i< num;i++) {
                int value = scan.nextInt();
                ListNode node = new ListNode(value, header.next);
                header.next = node;
            }
            int target = scan.nextInt();
            for (int i=0; i<target; i++) {
                header = header.next;
            }
            System.out.println(header.value);
        }

    }
}


class ListNode{
    int value;
    ListNode next;
    public ListNode(){}
    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}



