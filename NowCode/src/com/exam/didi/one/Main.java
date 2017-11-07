package com.exam.didi.one;

import java.util.*;

/**
 * Created by Han on 2017/09/10.
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Main {
    private static List<Integer> choushu=new ArrayList<Integer>();

    public static void main(String[] args) {

        for(int i=2;i<99999;i++){
            if(isChoushu(i)){
                choushu.add(i);
            }
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(findN(n)+1);

    }

    public static int findN(int num){

        int flag=-1;
        for(int i=0;i<choushu.size();i++){
            if(num==choushu.get(i)){
                flag=i;
                break;
            }else if(num<choushu.get(i)){
                break;
            }
        }
        return flag;

    }

    public static boolean isChoushu(int num){

        if(num==0){
            return false;
        }

        while (num%2==0&&num>0){
            num=num/2;
        }
        while (num%3==0&&num>0){
            num=num/3;
        }
        while (num%5==0&&num>0){
            num=num/5;
        }
        if(num==1){
            return true;
        }else {
            return false;
        }

    }
}
