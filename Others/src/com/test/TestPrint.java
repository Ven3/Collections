package com.test;

import java.util.Scanner;

/**
 * Created by Han on 2017/09/13.
 * 打印金字塔
 */
public class TestPrint {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        while (true){
            printOut(in.nextInt());
        }
    }

    private static void printOut(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j+i<n-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
