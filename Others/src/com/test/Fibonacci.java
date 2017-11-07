package com.test;

/**
 * Created by Han on 2017/09/10.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int f=0;
        int g=1;
        for(int i=0;i<10;i++){
            System.out.println(g);
            g=f+g;
            f=g-f;
        }
    }
}
