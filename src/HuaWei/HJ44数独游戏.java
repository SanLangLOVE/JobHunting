package HuaWei;
/*
Author:Sanro
Time:2022.05.23 10:07:15
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
/*
     * 解密9*9数独：
     * 格子内填充1-9的数字（空格用0代替），使任意格子的行，列，九宫格都出现1-9的数字
     * 例：
     * 8 0 0 0 0 0 0 0 0
     * 0 0 3 6 0 0 0 0 0
     * 0 7 0 0 9 0 2 0 0
     * 0 5 0 0 0 7 0 0 0
     * 0 0 0 0 4 5 7 0 0
     * 0 0 0 1 0 0 0 3 0
     * 0 0 1 0 0 0 0 6 8
     * 0 0 8 5 0 0 0 1 0
     * 0 9 0 0 0 0 4 0 0
     * 结果：
     * 8 1 2 7 5 3 6 4 9
     * 9 4 3 6 8 2 1 7 5
     * 6 7 5 4 9 1 2 8 3
     * 1 5 4 2 3 7 8 9 6
     * 3 6 9 8 4 5 7 2 1
     * 2 8 7 1 6 9 5 3 4
     * 5 2 1 9 7 4 3 6 8
     * 4 3 8 5 2 6 9 1 7
     * 7 9 6 3 1 8 4 5 2
*/


import java.util.*;
import java.io.*;

public class HJ44数独游戏 {
        static int[][] source = new int[9][9];//原始数组
        static int[][] target = new int[9][9];//结果数组
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            /*
             * 空格从最上面的行开始，逐行从左向右填充数值
             */
            Integer firstX = null;//第一个空格的行号
            Integer firstY = null;//第一个空格的列号

            /*
             * 数组录入输入的数字，并获得第一个空格的行号和列号
             */
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int c = scanner.nextInt();
                    source[i][j] = c;
                    target[i][j] = c;
                    if (firstX == null && firstY == null && source[i][j] == 0) {
                        firstX = i;
                        firstY = j;
                    }
                }
            }

            //开始遍历填充
            go(firstX, firstY);

            //打印结果数组
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(target[i][j] + " ");
                }
                System.out.println("");
            }
        }

        public static void go(int x, int y) {
            boolean flag = build(x, y);//填充

            if (flag) {//填充成功，获取下一个空格的行号和列号，以源数组为参照
                do {
                    if (x == 8 && y == 8) {//最后的空格填充完毕，结束填充
                        return;
                    }
                    if (y == 8) {
                        y = 0;
                        x = x + 1;
                    } else {
                        y = y + 1;
                    }
                } while (source[x][y] != 0);
            } else {//填充失败，获取上一个空格的行号和列号，以源数组为参照（因为上一个空格已被填充过，所以需要以源数组作为参照）
                do {
                    if (x == 0 && y == 0) {//退到第一个空格且无可填充的值，证明无解，结束
                        return;
                    }
                    if (y == 0) {
                        y = 8;
                        x = x - 1;
                    } else {
                        y = y - 1;
                    }
                } while (source[x][y] != 0);
            }
            /*
             * 1.如果当前空格填充成功，则填充的是下一个空格
             * 2.如果当前空格填充失败，则对上一个已填充的空格重新填充
             */
            go(x, y);
        }

        /*
         * 1.填充时，优先填充1-9中的较小值
         * 2.填充时，会有两种情况：1.新空格填充，空格值等于0 2.因后续空格无法继续填充，老空格
         *   尝试填充新的值，再进行后续空格填充
         * 3.经过填充后，空格没有获得新值，说明已无合适数字进行填充，需要将空格重置成0，返回f-
         *   -alse对上一空格进行重新填充
         * 4.经过填充后，空格获得新值，返回true根据结果判断对后续空格进行填充
         */
        public static boolean build(int x, int y) {
            int r = target[x][y];
            for (int n = r + 1; n < 10; n++) {
                target[x][y] = n;
                if (isExists(x, y)) {
                    target[x][y] = r;
                } else {
                    break;
                }
            }
            if (target[x][y] == r) {
                target[x][y] = 0;//已无可填充数字，将格子重置成0，并重新填充上一个格子
                return false;
            } else {
                return true;
            }
        }

        //判断当前空格的值是否已存在于同行，同列或同九宫格的其他格子中
        public static boolean isExists(int x, int y) {
            Set<Integer> set = getExists(x, y);
            return set.contains(target[x][y]);
        }

        //获取当前格子的行，列，九宫格中已填充的数字
        public static Set getExists(int x, int y) {
            Set<Integer> set = new TreeSet<Integer>();
            for (int i = 0; i < 9; i++) {
                if (i == x) {
                    continue;
                }
                if (target[i][y] == 0) {
                    continue;
                }
                set.add(target[i][y]);
            }
            for (int i = 0; i < 9; i++) {
                if (i == y) {
                    continue;
                }
                if (target[x][i] == 0) {
                    continue;
                }
                set.add(target[x][i]);
            }
            int xn = x / 3;
            int yn = y / 3;
            for (int i = xn * 3; i < xn * 3 + 3; i++) {
                for (int j = yn * 3; j < yn * 3 + 3; j++) {
                    if (i == x && j == y) {
                        continue;
                    }
                    if (target[i][j] == 0) {
                        continue;
                    }
                    set.add(target[i][j]);
                }
            }
            return set;
        }

}

