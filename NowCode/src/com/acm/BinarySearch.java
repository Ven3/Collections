package com.acm;

/**
 * Created by Han on 2017/09/14.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a={11,27,28,33};
        int index=getPos(a,4,28);
        System.out.println(index);

        if(index>0){
            System.out.println(a[index]);
        }else {
            System.out.println("未找到");
        }
    }
//    public static int binSearch(int[] a,int num){
//        int left=0;
//        int right=a.length-1;
//
//        while (left<right){
//            int mid=left+right/2;
//            if(a[mid]==num){
//                return mid;
//            }else if(num<a[mid]){
//                right=mid-1;
//            }else {
//                left=mid+1;
//            }
//
//        }
//        return -1;
//    }

    public static int getPos(int[] A, int n, int val) {
        int left=0;
        int right=A.length-1;

        while (left<right){
            int mid=left+right/2;
            if(A[mid]==val){
                return mid;
            }else if(val<A[mid]){
                System.out.println("left");
                right=mid;
            }else {
                System.out.println("right");
                left=mid;
            }

        }
        return -1;
    }
}
