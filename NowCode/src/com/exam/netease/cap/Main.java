package com.exam.netease.cap;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Han on 2017/09/12.
 *
 * 有时间计算一下时间
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        if(str.length()<0||str.length()>50)
            return;

        int count=1;
        char c=str.charAt(0);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=c){
                count++;
                c=str.charAt(i);
            }
        }



        System.out.printf("%.2f",(double)str.length()/count);

    }

    public class InterClass{
        double f = 111231.5585;
        public void m1() {
            BigDecimal bg = new BigDecimal(f);
            double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(f1);
        }
        /**
         * DecimalFormat转换最简便
         */
        public void m2() {
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println(df.format(f));
        }
        /**
         * String.format打印最简便
         */
        public void m3() {
            System.out.println(String.format("%.2f", f));
        }
        public void m4() {
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(2);
            System.out.println(nf.format(f));
        }
    }

}
