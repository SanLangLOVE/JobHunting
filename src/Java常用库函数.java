/*
Author:Sanro
Time:2022.05.23 10:54:54
Blog:https://sanlangcode.com
Email:sanlangcode@163.com
Desc:
*/

import java.util.*;
import java.io.*;

public class Java常用库函数 {
    public static void main(String[] args) {
//        字符串
//
//        整数转字符串：
//
//        String str = String.valueOf(a);
//        1
//        字符串转字符数组：
//
//        char[] chars = str.toCharArray();
//        1
//        字符串替换：
//
//        str.replace('a','b');
//        1
//        字符串去除空格
//
//        str.trim();
//        1
//        字符串拼接：
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(a);
//        sb.length(a);
//        sb.deleteCharAt(index);
//
//
//        截取字符串：
//        str.substring(start,end);//含前不含后，也可以只有
//        str.substring(start);
//
//
//        字符串获取某个字符的位置：
//        str.indexOf('a');
//
//        字符串分割：
//        str.split("\\s+"); 按空格分割
//        list/deque重组成String:
//        String.join("",list);String.join("",deque);
//
//        数组
//        数组初始化：
//        char[] array = new char[len];int[] arr = {1,2,3};int[] arr = new int[]{1,2,3,4,5};

//        数组自定义排序：
//        Arrays.sort(nums)

//                数组转list：
//                ArrayList<String> arraylist = new ArrayList<Strin>(Array.asList(arrays));
//                List<String> list = Arrays.asList(arrays);
//                List<String> list2 = new ArrayList<String>(arrays.length);
//                Collection.addAll(list2,arrays);
//
//        Array根据元素查找位置：
//        int position = Arrays.binarySearch(arrays,"f");
//        array中填充元素：
//        Arrays.fill(array,Integer.MAX_VALUE);

//        list列表相关
//                基本类型数组转成包装类型LIst;
//        int[] nums = {1,2,3};Arrays.stream(nums).boxed().collect(Collectors.toList());
//
//        list转数组（只适用于list成员是包装类型）
//
//        String[] strs = list.toArray(new String[list.size]);
//
//        list复制：
//
//        targetList.addAll(sourceList);
//
//        list自定义排序：
//
//        Collections.sortt()
//
//        list反转：
//
//        Collections.reverse(list);
//
//        list按位置移除元素：
//
//        list.remove(index);
//
//        list获取某个元素的位置：
//
//        list.indexOf(value) //默认返回第一个元素所在位置
//
//        list添加元素：
//
//        list.add(value) //在队尾添加list.add(place,value);//在指定位置添加
//
//        栈
//        栈初始化：
//        Stack stack = new Stack();
//        栈插入元素
//        stack.push();
//
//        栈弹出元素：
//        stack.pop();
//
//        栈取栈顶元素，不删减元素：
//        stack.peek();
//
//        判断栈是不是空：
//        stack.isEmpty();
//
//        队列
//        Queue<String> queue = new LinkedList<String>();

//        队列插入元素：
//        queue.offer(elment);

//        队列弹出元素
//        queue.peek();

//        队列头元素：
//        queue.peek();

//        双端队列
//        双端队列初始化：
//        Deque<String> d = new ArrayDeque<String>();
//        双端队列队首插入元素：
//        d.offerFirst(ele);
//        双端队列队尾插入元素：
//        d.offer();
//        d.offerLast();
//
//        双端队列队首弹出元素：
//
//        deque.pollFirst();
//        deque.poll();
//
//        双端队列队尾弹出元素
//
//        deque.pollLast();
//
//        map
//
//        groupItemsMap.computeIfAbent(group[items],key->new ArrayList<Integer>().add(item))
//
//        添加元素：
//
//        HashMap<K,V> map = new HashMap<K,V>();
//        map.put(K key,V value);//会覆盖原本含key的元素
//
//        判断：
//
//        map.containsKey(K key);
//        map.containValue(V value);
//
//        map遍历：
//
//        EntrySet遍历(性能最好）：
//                Map<K,V> map = new HashMap<K,V>();

//        for(Map.Entry<K,V> entry : map.entrySet()){
//            entry.getKey();
//            entry.getValue();
//        }
//
//        KeySet或者是Values遍历：
//
//        for(K key : map.keySet()){
//
//        for(V value : values : map.values()){
//
//        }
//
//        使用Iterator遍历：
//
//        Iterator<Map.Entry<K,V> it = map.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry<K,V> entry = it.next();
//            entry.getKey();
//            entry.getValue();
//
//        Lambda
//
//        map.forEach(key,value) -> {
//
//
//        函数
//
//        Math.max(a,b);
//        Math.min(a,b);
//        Math.pow(a,digit);
//        Math.ceil(a)//a为double，并且函数返回值也为double，向下取整
//        Math.floor(a)//向上取整
//
//        java.util.Random()方法摘要：
//
//        protected int next(int bits)：生成下一个伪随机数。
//        boolean nextBoolean()：返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的boolean值。
//        void nextBytes(byte[] bytes)：生成随机字节并将其置于用户提供的 byte 数组中。
//        double nextDouble()：返回下一个伪随机数，它是取自此随机数生成器序列的、在0.0和1.0之间均匀分布的 double值。
//        float nextFloat()：返回下一个伪随机数，它是取自此随机数生成器序列的、在0.0和1.0之间均匀分布float值。
//        double nextGaussian()：返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的double值，其平均值是0.0标准差是1.0。
//        int nextInt()：返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
//        int nextInt(int n)：返回一个伪随机数，它是取自此随机数生成器序列的、在（包括和指定值（不包括）之间均匀分布的int值。
//        long nextLong()：返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值。
//        void setSeed(long seed)：使用单个 long 种子设置此随机数生成器的种子;
//
//
//        Scanner input = new Scanner(System.in);
//        input.next();//返回值为String
//        input.nextInt()//返回值为int
//        input.hasNext();//返回值为boolean
//
//        //输入一行数字，数字间以”，“分割，将数组存入数组
//
//        Scanner input = new Scanner(System.in);
//        String s = input.nextLine();
//        String[] num = s.split(",");
//        int size = num.length();
//        int[] a = new int[size];
//        for(int i = 0; i < size; i++){
//            a[i] = Integer.parseInt(num[i]);
//        }
//
//    }
    }
}
