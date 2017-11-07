package test;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Han on 2017/10/12.
 */
public class Test extends Thread {
    static String sName = "vandeleur";

    public static void main(String argv[]) {
        Test t = new Test();
        t.piggy(sName);
        System.out.println(sName);
    }

    public void piggy(String sName) {
        sName = sName + " wiggy";
        start();
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            sName = sName + " " + i;
        }
    }
}
