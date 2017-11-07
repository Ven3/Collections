package iflytek.ben;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Han on 2017/09/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<String,Integer> groups=new HashMap<String,Integer>();

        for(int i=0;i<n+1;i++){
            String tmp=in.nextLine();
            groups.put(tmp,new Integer(0));
        }

        for(int i=0;i<n*(n-1)/2;i++){

            String str=in.nextLine();
            String[] strs=str.split("-| |:");
            System.out.println(Arrays.toString(strs));

            if(Integer.parseInt(strs[2])>Integer.parseInt(strs[3])){
                int count=groups.get(strs[0])+3;
                groups.put(strs[0],count);
            }else if (Integer.parseInt(strs[2])<Integer.parseInt(strs[3])){
                int count=groups.get(strs[1])+3;
                groups.put(strs[1],count);
            }else {
                int countA=groups.get(strs[0])+1;
                groups.put(strs[0],countA);
                int countB=groups.get(strs[1])+1;
                groups.put(strs[1],countB);
            }
        }


    }
}
