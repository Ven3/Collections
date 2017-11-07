package com.test;

/**
 * Created by Han on 2017/10/12.
 */
public class FindMax {
    public static void main(String[] args) {

        int[] a={4,3,5,6,2,67,7,2,23,67,24,86};
        System.out.println(doFind(a,0));

    }

    public static int doFind(int[] a,int i){
        if(i==a.length-1){
            return a[i];
        }
        return a[i]>doFind(a,i+1)? a[i]:doFind(a,i+1);
    }
}
