package com.exam.netease.ben;

import java.util.Scanner;

/**
 * Created by Han on 2017/09/12.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        String[] nums=(n+"").split("");
        StringBuffer num=new StringBuffer();
        for(int i=0;i<nums.length;i++){
            num.append(nums[nums.length-1-i]);
        }
        System.out.println(n+Integer.parseInt(String.valueOf(num)));

    }
}
