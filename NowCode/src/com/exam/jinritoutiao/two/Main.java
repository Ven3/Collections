package com.exam.jinritoutiao.two;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();//n

        int[] user=new int[n];

        for(int i=0;i<n;i++){
            user[i]=in.nextInt();//user 初始化
        }

        int q=in.nextInt();//q

        for(int i=0;i<q;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            int k=in.nextInt();

            int count=0;
            for(int j=l;j<r;j++){
                if(user[j-1]==k){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
