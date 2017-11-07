package com.exam.didi.one;
import java.util.Arrays;
import java.util.Scanner;

public class NewClass{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println(findUgly(scanner.nextInt()));
    }
    public static int compare(int two,int threee,int five){
        if(two <=threee){
            if(two <= five)
                return two;
            else
                return five;
        }
        else if(threee <= five)
            return threee;
        else
            return five;
    }


    public static int findUgly(int num){
        int ugly[]=new int[99999];
        Arrays.fill(ugly, 1);
        int count=1;
        while(true){
            int two = 0;
            int three = 0;
            int five = 0;
            for(int i = 0 ; i < count ; i++){
                if(ugly[i]*2 >ugly[count-1]){
                    two = ugly[i]*2;
                    break;
                }
            }
            for(int i = 0 ; i < count ; i++){
                if(ugly[i]*3 >ugly[count-1]){
                    three = ugly[i]*3;
                    break;
                }
            }
            for(int i = 0 ; i < count ; i++){
                if(ugly[i]*5 >ugly[count-1]){
                    five = ugly[i]*5;
                    break;
                }
            }
            ugly[count]=compare( two, three, five);
            count++;
            if(count==num)
                return ugly[count-1];
        }
    }
}
