package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Han on 2017/10/17.
 * 功能：统计Java文件数和代码行数
 */
public class CodeCount {

    static int fileNums =0;
    static int lineCount=0;
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter A Path:");
        String path=in.nextLine();

        File file=new File(path);
        if(!file.exists()){
            System.err.println("Path Not Exist!!");
            System.exit(0);
        }
        doList(file);
        System.out.println("File Count:"+fileNums);
        System.out.println("Total Lines:"+lineCount);

    }

    public static void doList(File file){

        if(file.isDirectory()){

            File[] files=file.listFiles();
            for(File file1:files){
                doList(file1);
            }
        }else{
            if(file.getName().contains(".java")){
                System.out.println(file.getName());
                fileNums++;
                countLines(file);
            }
        }

    }

    public static void countLines(File file) {
        try {

            BufferedReader br=new BufferedReader(new FileReader(file));
            int count=0;
            while (br.readLine()!=null){
                count++;
            }
            lineCount+=count;
        }catch (Exception e){
            System.err.println("Wrong!!!");
        }

    }
}
