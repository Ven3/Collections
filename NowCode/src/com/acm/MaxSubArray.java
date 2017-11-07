package com.acm;

import java.util.Arrays;

/**
 * Created by Han on 2017/09/09.
 * 求最大子数组
 */
public class MaxSubArray {

    public static void main(String[] args) {

        int[] a = {2,-3,6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(findMaxSubArray(a));
        ;
    }

    public static int findMaxSubArray(int[] array) {
        if (array.length == 0 || array == null) {
            return 0;
        }
        int subSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (subSum <= 0) {
                subSum = array[i]; //记录当前最大值
            } else {
                subSum += array[i]; //当array[i]为正数时，加上之前的最大值并更新最大值。
            }
            if (subSum > maxSum) {
                maxSum = subSum;
            }
        }
        return maxSum;
    }
}
