package ByteDance;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args) {
    //数据输入：一行输入n个数字
    /*
    input：
    3
    6 2 1
    output：
    36
    */
    Scanner input_num = new Scanner(System.in);
    int n = input_num.nextInt();
    int arr[] = new int[n];
    for (int i = 0 ; i < n ; i++ ){
        arr[i] = input_num.nextInt();
    }

    //数据处理：求输入数据的非空子集，每个子集再求其最大的特定值（最小的元素*所有元素的和）
    /*
    6 2 1的非空子集  特定值
    6              6*6=36
    2              2*2=4
    1              1*1=1
    6 2            2*（6+2）=16
    6 1            1*（1+6）=7
    2 1            1*（2+1）=3
    6 2 1          1（6+2+1）=9

    特定值数组集合result[]=[36,4,1,16,7,3,9]
    输出result.max()完成本题
    */
    int result = sumArray(arr);

    //数据输出
   // System.out.println(Arrays.toString(arr));
    System.out.println(result);

    }

    public static int sumArray(int[] myarray) {
        int len = myarray.length;
        int min = Arrays.stream(myarray).min().getAsInt();
        int sum = Arrays.stream(myarray).sum();
        if (len ==1){
            return myarray[0]*myarray[0];
        }
        else
            return min*sum;
    }

    public static int result(int[] myarray){
        int result_max = 0;
        int[] setSum_value = {};
        int len =myarray.length;
        for(int i=0 ; i<len ; i++){
            if (i == 0){
                //setSum_value.

            }

        }

        return result_max;

    }


}
