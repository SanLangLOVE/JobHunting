package HuaWei;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HJ2计算某字符出现次数 {

//        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            String str = in.nextLine();    //读入字符串
//            char target0 = in.next().charAt(0);    //读入待查询字母
//            char[] target = new char[2];    //存储要查询的字母的大小写形式
//            target[0] = target0;
//
//            //如果输入为大写，则转换为小写
//            if(target0>='A' && target0<='Z')
//                target[1] = (char)(target0 - 'A' + 'a');
//            //如果输入为小写，则转换为大写
//            if(target0>='a' && target0<='z')
//                target[1] = (char)(target0 - 'a' + 'A');
//
//            //计数
//            int sum = 0;
//            for(int i=0; i < str.length(); i++)
//                if(str.charAt(i)==target[0] || str.charAt(i)==target[1])
//                    sum++;
//
//            System.out.println(sum);
//        }



//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            String string = scanner.nextLine();
//
//            String character = scanner.nextLine();
//
//            Pattern compile = Pattern.compile(character, Pattern.CASE_INSENSITIVE);
//            Matcher matcher = compile.matcher(string);
//            int count = 0;
//            while (matcher.find()) {
//                count++;
//            }
//            System.out.println(count);
//        }



//        public static void main(String[] args) throws IOException {
//            int counts=0;
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            char[] chars1 = bufferedReader.readLine().toLowerCase().toCharArray();
//            char[] chars2 = bufferedReader.readLine().toLowerCase().toCharArray();
//            for(char c : chars1){
//                if(c==chars2[0]){
//                    counts++ ;
//                }
//            }
//            System.out.print(counts);
//        }
//


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String in1 =sc.nextLine().toLowerCase();
            String in2 = sc.nextLine().toLowerCase();
            // 把所有in2字符全替换成“”，组成新字符串
            String str = in1.replaceAll(in2,"");
            // 原始字符串长度 - 新字符串长度 = 字符出现的次数
            System.out.println(in1.length()-str.length());
        }

}
