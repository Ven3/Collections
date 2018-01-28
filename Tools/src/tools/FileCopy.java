package tools;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
//        文件A
        File aFile = new File("E:/testFile/a/FileA.dat");
//        文件B
        File bFile = new File("E:/testFile/b/FileB.dat");
        try {
//            读取文件A
            FileReader fileReader = new FileReader(aFile);

//            获得文件A的流
            FileInputStream fis = new FileInputStream(aFile);
//            文件B的输出流
            FileOutputStream fos = new FileOutputStream(bFile);

            byte[] buffer = new byte[fis.available()];
            while (true) {
                int ins = fis.read(buffer);
                if (ins == -1) {
                    fis.close();
                    fos.flush();
                    fos.close();
                    break;
                } else
                    fos.write(buffer, 0, ins);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
