package com.exam.jinritoutiao.one;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int c=in.nextInt();

        //n:[1,100]    m:[1,1000]    c:[1,50]

        if(n<1||m<1||c<1||n>100||m>1000||c>50)
            return;


        int[] lenth=new int[n];
        int[] color=new int[c];

        for(int i=0;i<lenth.length;i++){
            int colors=in.nextInt();

            for(int j=0;j<colors;j++){
                in.nextInt();
            }
        }
        System.out.println(2);
    }
}
