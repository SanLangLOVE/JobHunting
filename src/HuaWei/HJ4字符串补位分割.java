package HuaWei;

import java.util.Scanner;

public class HJ4字符串补位分割 {
    public static void main(String[] args) {


        /**
         *1.输入字符串大于8时，递归截取前8位输入，直至小于8位时进入循环补0
         *2.字符串小于8时直接跳到循环补0操作，补满至8位时打印输出
         *3.正好等于8位或为空字符串时，直接打印输出
         */
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s=in.nextLine();
            while(s.length()>8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }
            while(s.length()<8&&s.length()>0){
                s+="0";
            }
            System.out.println(s);
        }
    }
}

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        char[] chars = str.toCharArray();
//        if (chars.length % 8 == 0) {   //长度是8倍数 循环输出
//            for (int i = 0; i < chars.length; i++) {
//                System.out.print(chars[i]);
//                if ((i + 1) % 8 == 0) {
//                    System.out.println();
//                }
//            }
//        }
//        //长度不是8的倍数则补
//        else {
//            if (chars.length < 8) {
//                char[] chars1 = new char[8];
//                for (int i=0;i<8;i++){
//                    if(i<chars.length) chars1[i]=chars[i];
//                    else chars1[i] = '0';
//                }
//                for (int i=0;i<8;i++){
//                    System.out.print(chars1[i]);
//                }
//
//            }
//            else {
//                int m = chars.length % 8;
//                int len = chars.length + (8 - m);
//                char[] chars1 = new char[len];
//                for (int i = 0; i < chars1.length; i++) {
//                    if (i < chars.length) {
//                        chars1[i] = chars[i];
//                    }else chars1[i] = '0';
//                }
//                    for (int i = 0; i < chars1.length; i++) {
//                        System.out.print(chars1[i]);
//                        if ((i + 1) % 8 == 0) {
//                            System.out.println();
//                        }
//                    }
//                }
//            }
//        }
