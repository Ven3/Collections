package com.exam.netease.david;

import java.util.Scanner;

/**
 * Created by Han on 2017/09/12.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        if(t<1||t>10)
            return;

        while (t>0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }

            System.out.println("No");
            t--;
        }
    }
}
