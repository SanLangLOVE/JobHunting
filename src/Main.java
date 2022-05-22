import com.sun.org.apache.xpath.internal.axes.OneStepIterator;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
//全部引入，不需要再区分，但是内存消耗变大

//主函数只能是Main且唯一
public class Main{

public static void main(String[] args) throws Exception {


//    //1.输入一个整数
//    Scanner input_a = new Scanner(System.in);
//    int a = input_a.nextInt();
//    System.out.println(a);
//
//    //2.输入一个字符
//    Scanner input_s = new Scanner(System.in);
//    String s = input_s.nextLine();
//    char to_s = s.charAt(0); //把输入的字符串变成字符数组，只取第一个字符
//    System.out.println(to_s);
//
//    //3.输入一个字符串
//    Scanner input_str = new Scanner(System.in);
//    String str = input_s.next();
//    System.out.println(str);
//
//    //4.输入一行字符串
//    Scanner input_str_cow = new Scanner(System.in);
//    String str_cow = input_str_cow.nextLine();
//    System.out.println(str_cow);
//
//    //5.一行输入n个数字
//    Scanner input_num = new Scanner(System.in);
//    int n = input_num.nextInt();
//    int arr[] = new int[n];
//    for (int i = 0 ; i < n ; i++ ){
//        arr[i] = input_num.nextInt();
//    }
//    System.out.println(Arrays.toString(arr));

    //6.输入一个整数m行的的矩阵（行数m 每行的列数不定）
//    Scanner input_mn = new Scanner(System.in);
//    int m = Integer.parseInt(input_mn.nextLine());
//    for (int i = 0 ; i < m ; i++){
//        String str = input_mn.nextLine();
//        System.out.println(str);
//    }

    //7.输入任意行 空行截至
//    Scanner input_all = new Scanner(System.in);
//    String nextLine = input_all.nextLine();
//    while (nextLine != null && !nextLine.equals("")){
//        String[] str = nextLine.split(" ");
//        int[] nums = new int[str.length];
//        for ( int i = 0 ; i < str.length ; i++){
//            nums[i] = Integer.parseInt(str[i]);
//        }
//        nextLine = input_all.nextLine();
//    }

   //8.数字变字符+字符变数组
    //输入一个数字把他变成字符类型，输入一个字符为数字把他变成数字类型。
    //char字符类型 String字符串类型
//    Scanner input_num = new Scanner(System.in);
//    int num = input_num.nextInt();
//    System.out.println(num); //接收一个int类型数字
//
//    char num_char = (char)num;//把int类型变成char 会输出对应的ASCII代表的符号
//    System.out.println(num_char);
//
//    String num_str = String.valueOf(num);//把int变成String类型
//    System.out.println(num_str);
//
//    int num_new = Integer.parseInt(num_str); //把string类型变成int
//
//    char[] num_list1 = num_str.toCharArray();
//    System.out.println(num_list1[2]);
//    char[] num_list2 = String.valueOf(num).toCharArray();//把int先变成string再变成char数组
//    System.out.println(num_list2[1]);


    //单行IO-数字 字符
//    Scanner scanner = new Scanner(System.in);
//    int n = Integer.parseInt(scanner.nextLine());
//    String m = scanner.next();
//
//    System.out.println(n);
//    System.out.println(m);

    //多行IO-数字 字符

//    Scanner scanner1 = new Scanner(System.in);
//    int b = Integer.parseInt(scanner1.nextLine());
//    for (int i =0 ; i < b ; i++){
//        String a = scanner1.nextLine();
//        System.out.println(a);
//    }

//    //五种char变成String
//    //1
//    String s1 = String.valueOf('c');
//    //2
//    String s2 = String.valueOf(new char[]{'c'});
//    //3
//    String s3 = Character.toString('c');
//    //4
//    String s4 = new Character('c').toString();
//    //5
//    String s5 =""+'c';

    //把String 变成Sting数组
    String s = "1 a,b c,d e";
    String[] strs = s.split(",");

    //函数
//    public static void function_name(){
//
//        System.out.println("hello world");
//
//    }

}
}
