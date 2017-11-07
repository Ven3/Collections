package com.test;

/**
 * Created by Han on 2017/09/09.
 */
public class Main {
    public static void main(String[] args) {
        new A2();
    }
    private static class A{
        A(){
            System.out.println("A");
        }
    }
    private static class A1 extends A{
        A1(){
            this("A1");
        }
        A1(String s){
            System.out.println(s);
        }
    }
    private static class A2 extends A1{
        A2(){
            super("A2");
            new A1();
        }
    }
}
