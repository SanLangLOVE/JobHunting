package HuaWei;
/*
Author:Sanro
Time:2022.05.24 11:57:44
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
描述
给定一个字符串描述的算术表达式，计算出结果值。
输入字符串长度不超过 100 ，合法的字符包括 ”+, -, *, /, (, )” ， ”0-9” 。

数据范围：运算过程中和最终结果均满足 ∣≤2的31 -1  ，即只进行整型运算，确保输入的表达式合法
输入描述：
输入算术表达式

输出描述：
计算出结果值

示例1
输入：
400+5

输出：
405

*/

import java.util.*;
import javax.script.*;

public class HJ54表达式求值_万能法 {
    public static void main(String [] args) throws ScriptException{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "(");
        input = input.replace("{", "(");
        input = input.replace("}", ")");
        input = input.replace("]", ")");
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        System.out.println(scriptEngine.eval(input));
    }
}
