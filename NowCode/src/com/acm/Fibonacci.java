package com.acm;

import java.util.Scanner;

/**
 * Created by Han on 2017/09/09.
 * 输入一个整数n，请你输出斐波那契数列的第n项。
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println(fibonacci(2));
    }

    public static int fibonacci(int n) {
        int f = 0, g = 1;
        while (n>0) {
            g += f;
            f = g - f;
            n--;
        }
        return f;
    }
}
