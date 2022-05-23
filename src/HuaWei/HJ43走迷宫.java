package HuaWei;
/*
Author:Sanro
Time:2022.05.23 10:00:42
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
定义一个二维数组 N*M ，如 5 × 5 数组下所示：


int maze[5][5] = {
0, 1, 0, 0, 0,
0, 1, 1, 1, 0,
0, 0, 0, 0, 0,
0, 1, 1, 1, 0,
0, 0, 0, 1, 0,
};


它表示一个迷宫，其中的1表示墙壁，0表示可以走的路，
只能横着走或竖着走，不能斜着走，
要求编程序找出从左上角到右下角的路线。
入口点为[0,0],既第一格是可以走的路。


数据范围：2≤n,m≤10  ， 输入的内容只包含 0≤val≤1

输入描述：
输入两个整数，分别表示二维数组的行数，列数。再输入相应的数组，
其中的1表示墙壁，0表示可以走的路。数据保证有唯一解,
不考虑有多解的情况，即迷宫只有一条通道。

输出描述：
左上角到右下角的最短路径，格式如样例所示。

示例1
输入：
5 5
0 1 0 0 0
0 1 1 1 0
0 0 0 0 0
0 1 1 1 0
0 0 0 1 0

输出：
(0,0)
(1,0)
(2,0)
(2,1)
(2,2)
(2,3)
(2,4)
(3,4)
(4,4)

*/

import java.util.*;
import java.io.*;

public class HJ43走迷宫 {
    // 简单的位置类
    public static class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) {
            // 注意 while 处理多个 case
            int n = in.nextInt();
            int m = in.nextInt();
            // 构造迷宫
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = in.nextInt();
                }
            }
            // 路径存储的数组
            List<Pos> path = new ArrayList<>();
            // DFS 搜索路径
            dfs(map, 0, 0, path);
            // 输出
            for (Pos p : path) {
                System.out.println("(" + p.x + "," + p.y + ")");
            }
        }
    }

    // 返回值 标记是否找到可通行的路劲
    public static boolean dfs(int[][] map, int x, int y, List<Pos> path) {
        // 添加路径并标记已走
        path.add(new Pos(x, y));
        map[x][y] = 1;
        // 结束标志
        if (x == map.length - 1 && y == map[0].length - 1) {
            return true;
        }
        // 向下能走时
        if (x + 1 < map.length && map[x + 1][y] == 0) {
            if (dfs(map, x + 1, y, path)) {
                return true;
            }
        }
        // 向右能走时
        if (y + 1 < map[0].length && map[x][y + 1] == 0) {
            if (dfs(map, x, y + 1, path)) {
                return true;
            }
        }
        // 向上能走时
        if (x - 1 > -1 && map[x - 1][y] == 0) {
            if (dfs(map, x - 1, y, path)) {
                return true;
            }
        }
        // 向左能走时
        if (y - 1 > -1 && map[x][y - 1] == 0) {
            if (dfs(map, x, y - 1, path)) {
                return true;
            }
        }
        // 回溯
        path.remove(path.size() - 1);
        map[x][y] = 0;
        return false;
    }

}
