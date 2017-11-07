package com.exam.didi.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Han on 2017/09/10.
 */
public class Main {


    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        List<Integer> arr=new ArrayList<Integer>();
            for (int i = 0; i < count; i++)
            {
                int data;
                data=in.nextInt();
                arr.add(data);
            }
            int start = 0;
            int sum=0;

            for (int i = 0; i < count; i++)
            {
                if (arr.get(i) == 0)
                {
                    sum++;
                    start = i + 1;
                    continue;
                }
                for (int j = start; j < i; j++)
                {
                    int flag = 0;
                    for (int k = j; k <= i; k++)
                    {
                        flag ^= arr.get(k);
                    }
                    if (flag == 0)
                    {
                        sum++;
                        start = i + 1;
                        continue;
                    }
                }
            }
        System.out.println(sum);
    }
}
