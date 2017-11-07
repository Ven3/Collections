package iflytek.cathy;

import java.util.*;

/**
 * Created by Han on 2017/09/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();// Course Count

        Map<String,List<String>> courses=new HashMap<String,List<String>>();
        boolean flag=true;

        for(int i=0;i<n;i++){

            String ctime=in.next();
            String ccode=in.next();
            if(courses.containsKey(ctime)){
                courses.get(ctime).add(ccode);
                flag=false;
            }else {
                List<String> codes=new ArrayList<String>();
                codes.add(ccode);
                courses.put(ctime,codes);
            }
        }
        List<String> keys=new ArrayList<String>();
        if(flag) {
            System.out.println("YES");
        }else {
            for(String key:courses.keySet()){
                if(courses.get(key).size()>1){
                    keys.add(key);
                }
            }
            Collections.sort(keys);
            for(int i=0;i<keys.size();i++){
                System.out.print(keys.get(i)+" ");
                for(int j=0;j<courses.get(keys.get(i)).size();j++){
                    System.out.print(courses.get(keys.get(i)).get(j)+" ");
                }
                System.out.println();
            }
        }

    }
}
