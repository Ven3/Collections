package com.acm;

/**
 * Created by Han on 2017/09/14.
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 */
public class OneToN {

    public static void main(String[] args) {
        System.out.println(Sum_Solution(100));
    }

    public static int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }

}
