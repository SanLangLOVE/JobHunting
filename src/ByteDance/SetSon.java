package ByteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetSon {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		Set<Set<Integer>> as = new Demo().getsubset3(new int[] {1,2,3,4},4,4);
//		System.out.println(as);
        Set<Set<Integer>> as1 = new SetSon().getsubset2(new int[] {1,2,3,4});
        System.out.println(as1);
        ArrayList<ArrayList<Integer>> as2 = new SetSon().getsub1(new int[] {1,2,3,4});

        System.out.println(as2);

    }

    //递归方法
    /**
     *
     * @param A 数组
     * @param cur 当前元素位置的下标
     * @return 返回一个嵌套的集合
     */
    private Set<Set<Integer>> getsubset3(int[] A, int cur) {
        Set<Set<Integer>> newres = new HashSet<>();
        if (cur == 0) {
            Set<Integer> nil = new HashSet<>();
            Set<Integer> first = new HashSet<>();
            first.add(A[0]);
            newres.add(nil);
            newres.add(first);
            return newres;
        }

        Set<Set<Integer>> oldres = getsubset3(A, cur-1);
        for (Set<Integer> set : oldres) {
            newres.add(set);
            Set<Integer> copy = (Set<Integer>)(((HashSet)set).clone());
            copy.add(A[cur-1]);
            newres.add(copy);

        }
        return newres;
    }

    //迭代
    /**
     *
     * @param A 数组
     * @return
     */
    private Set<Set<Integer>> getsubset2(int[] A) {
        Set<Set<Integer>> res = new HashSet<>();
        Set<Integer> nil = new HashSet<>();
        res.add(nil);
        for (int i = 0; i < A.length; i++) {

            Set<Set<Integer>> help = new HashSet<>();
            help.addAll(res);
            for (Set<Integer> set : res) {
                Set a = (HashSet)(((HashSet)set).clone());
                a.add(A[i]);
                help.add(a);
            }
            res = help;
        }
        return res;



    }

    //二进制法
    /**
     *
     * @param A 数组
     * @return
     */
    private ArrayList<ArrayList<Integer>> getsub1(int[] A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int maxnum = cifang(2, A.length)-1;
        for (int i = maxnum; i > 0; i--) {
            ArrayList<Integer> res_new = new ArrayList<>();
            String bit = new StringBuilder((Integer.toBinaryString(i))).reverse().toString();
            for (int j = 0; j <bit.length(); j++) {
                if (bit.charAt(j) == '1') {
                    res_new.add(A[j]);
                }
            }
            res.add(res_new);
        }
        return res;

    }
    //生成次方的方法
    private int cifang(int i,int n) {
        if (n == 0) {
            return 1;
        } else {
            int de = i;
            for (int j = 1; j < n; j++) {
                de=de<<1;
            }
            return de;
        }
    }
}