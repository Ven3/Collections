package com.test;

import javax.swing.*;

/**
 * Created by Han on 2017/09/23.
 */
public class C {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Show");

    }

}
class MyThread implements Runnable{


    @Override
    public void run() {

        for(int i=0;i<10;i++){

            try {
                System.out.println("OK");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}