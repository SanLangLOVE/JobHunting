package HuaWei;
/*
Author:Sanro
Time:2022.05.18 20:03:05
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;
/*
想要换最多的汽水，就要厚脸皮，
每两个空瓶向老板借一瓶汽水，
喝完之后拿三个空瓶再换一瓶还给老板；
相当于自己每两个空瓶可以换到一瓶汽水
核心代码bottle/2
*/
public class HJ22汽水瓶 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextInt()){
                int bottle = sc.nextInt();
                if(bottle==0){
                    break;
                }
                System.out.println(bottle/2);
            }
        }

}
