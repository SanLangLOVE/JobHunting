package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

public class HJ3数字去重 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int count = in.nextInt();    //随机数总数
                int[] data = new int[count];
                for(int i=0; i < count; i++)    //读入生成的随机数
                    data[i] = in.nextInt();

                Arrays.sort(data);    //使用库函数排序
                System.out.println(data[0]);    //打印排序后的第一个数（必不重复）
                for(int i=1; i < count; i++){    //打印其他数字，需与前面数字比较，不重复才能打印
                    if(data[i] != data[i-1])
                        System.out.println(data[i]);
                }
            }
        }




//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            //获取个数
//            int num = sc.nextInt();
//            //创建TreeSet进行去重排序
//            TreeSet set = new TreeSet();
//            //输入
//            for(int i =0 ; i < num ;i++){
//                set.add(sc.nextInt());
//            }
//
//            //输出
//            Iterator iterator = set.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }
//        }

}
