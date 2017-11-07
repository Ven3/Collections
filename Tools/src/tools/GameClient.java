package tools;

import javax.swing.*;

/**
 * Created by Han on 2017/11/3.
 */
public class GameClient {

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("TwentyOne");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);

        jFrame.setLocation(0,0);
        jFrame.setLocationRelativeTo(null);

        JButton button=new JButton("Get");
        button.setSize(80,40 );
        jFrame.add(button);

        JLabel label=new JLabel("Good Time");
        label.setSize(80,40);
        label.setLocation(90,0);
        jFrame.add(label);
    }
}
