package com.test;

/**
 * Created by Han on 2017/09/22.
 */
public class A {
    public static void main(String[] args) {

        System.out.println(foo(6));
    }
    public static int foo(int n){
        if (n<=2){
            return n;
        }
        return foo(n-1)+foo(n-2);
    }
}
