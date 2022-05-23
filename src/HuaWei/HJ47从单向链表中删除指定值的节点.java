package HuaWei;
/*
Author:Sanro
Time:2022.05.23 10:26:35
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;

//根本不需要链表，一个有插入功能的数组就可以了。
// 比如Java中直接用一个ArrayList即可。

public class HJ47从单向链表中删除指定值的节点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int total = sc.nextInt();
            int head = sc.nextInt();

            List<Integer> linkedlist = new ArrayList<>();

            linkedlist.add(head);
            for (int i = 0; i < total - 1; i ++) {
                int value = sc.nextInt();
                int target = sc.nextInt();
                linkedlist.add(linkedlist.indexOf(target) + 1, value);
            }

            int remove = sc.nextInt();
            linkedlist.remove(linkedlist.indexOf(remove));
            for (int i : linkedlist) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
