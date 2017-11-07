package com.acm;

/**
 * Created by Han on 2017/09/21.
 */
public class BinSearch {


    public static void main(String[] args) {
        int[] a={1,5,8,11,19,23,31,35,40,45,48,49,50};
        System.out.println(binSearch(a,10,0,a.length));

    }

    public static int binSearch(int[] a,int key,int start,int end){
        int mid=(start+end)/2;
        System.out.println(a[mid]);
        if(key==a[mid])
            return mid;
        if(start==end)
            return -1;
        while (start<end){
            if(key<a[mid]){
                end=mid-1;
                return binSearch(a,key,start,end);
            }else if(key>a[mid]){
                start=mid+1;
                return binSearch(a,key,start,end);
            }else {
                return a[mid];
            }
        }


        return 0;
    }
}
