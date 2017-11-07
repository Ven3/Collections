package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Han on 2017/09/18.
 */
public class A {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int[] a=new int[3];
        int zero=0;//查找1的个数
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
            if(a[i]==1)
                zero++;
        }
        Arrays.sort(a);
        if(zero>0){
            switch (zero){
                case 1://一个1的情况
                case 2://两个1的情况
                    System.out.println((a[0]+a[1])*a[2]);
                    break;
                case 3://三个1的情况
                    System.out.println(a[0]+a[1]+a[2]);
                    break;
            }
        }else {
            System.out.println(a[0]*a[1]*a[2]);
        }
    }

}


