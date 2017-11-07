package ofo.Andy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[][] fill(int n, int m) {
        int[][] a=new int[n][m];
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=num;
                num++;
            }
        }
        print2DArray(a);
        System.out.println(list.toString());
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=list.get(k);
                k++;
            }
        }
        return a;

    }

    static List<Integer> list=new ArrayList<Integer>();
    static int num=1;

    static void print2DArray(int data[][]) {

        if (data[0].length == 1) {
            for (int i = 0; i < data.length; i++)
                list.add(num++);
            return;
        } else if (data.length == 1 && data[0].length != 1) {
            for (int i = 0; i < data[0].length; i++)
                list.add(num++);
            return;
        } else if (data.length > 1) {
            int row = data.length;
            int column = data[0].length;
            int i = 0;
            for (i = 0; i < column; i++)
                list.add(num++);
            for (i = 1; i < row; i++)
                list.add(num++);
            for (i = column - 2; i >= 0; i--)
               list.add(num++);
            for (i = row - 2; i >= 1; i--)
                list.add(num++);
            if (row - 2 > 0 && column - 2 > 0) {
                int subData[][] = new int[row - 2][column - 2];
                for (i = 1; i < row - 1; i++)
                    for (int j = 1; j < column - 1; j++)
                        subData[i - 1][j - 1] = data[i][j];
                data = null;
                print2DArray(subData);
            }
        }

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        res = fill(_n, _m);
        int res_rowLength = res.length;
        int res_colLength = res[0].length;
        for(int res_i=0; res_i < res_rowLength; res_i++) {
            for(int res_j=0; res_j < res_colLength; res_j++) {
                System.out.print(String.valueOf(res[res_i][res_j]) + " ");
            }
            System.out.println();
        }

    }
}
