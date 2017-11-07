package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Han on 2017/09/18.
 */
public class B {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for (;;) {
            int n = in.nextInt();
            int sum = 0;
            String str = String.valueOf(n);

            String[] strings = str.split("");//拆分为单个数字
            for (int i = 0; i < strings.length; i++) {
                sum += Integer.parseInt(strings[i]);//计算各位数上和
            }
            sum += n;//与初值相加
            if (sum % 10 > 0) {
                sum /= 10;
                sum *= 10;
                sum += 10;
            } else {

            }
            System.out.println(sum);
        }
    }
}
