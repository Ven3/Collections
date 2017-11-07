package com.exam.netease.gross;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Han on 2017/09/12.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }

//        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        System.out.println(getABS(nums));

    }

    public static int getABS(int[] nums){
        int sum=0;
        if (nums.length==1)
            return nums[0];
        else {
            for(int i=0;i<nums.length-1;i++){
                sum+=Math.abs(nums[i+1]-nums[i]);
                System.out.println(sum);
            }
        }
        return sum;
    }

}
