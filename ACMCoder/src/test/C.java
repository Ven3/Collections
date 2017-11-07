package test;

import java.util.*;

/**
 * Created by Han on 2017/09/21.
 */
public class C {

    public static void main(String[] args) {

        char[] chars=new char[20];
        Set<Integer> set=new HashSet<Integer>();

        Random random=new Random();
        for(;set.size()<20;){
            int c=random.nextInt(26)+97;
            set.add(c);
        }
        int i=0;
        for(int num:set){
            chars[i]= (char) num;
            i++;
        }
        Arrays.sort(chars);
        for(int j=chars.length-1;j>0;j--){
            System.out.print(chars[j]+" ");
        }
    }
}
