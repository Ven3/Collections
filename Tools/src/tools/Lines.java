package tools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Han on 2017/11/13.
 */
public class Lines extends JFrame implements ActionListener {

    int lineCount;
    int fileNums;

    JButton count=new JButton("开始统计");
    JTextField path=new JTextField();
    TextArea messageBox=new TextArea("",10,0,TextArea.SCROLLBARS_VERTICAL_ONLY);

//    JTextArea messageBox=new JTextArea();
    public Lines(){
        setTitle("代码行数统计");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        count.addActionListener(this);

        initItems();
        add(path);
        add(count);
        add(messageBox);

//        pack();

        setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    private void initItems() {
        count.setBorder(null);
        count.setBackground(Color.lightGray);
        count.setPreferredSize(new Dimension(200,60));
        count.setFont(new Font("Microsoft YaHei UI",0,32));

        path.setPreferredSize(new Dimension(340,60));
        path.setFont(new Font("Microsoft YaHei UI",0,32));


        messageBox.setPreferredSize(new Dimension(550,600));
        messageBox.setFont(new Font("Microsoft YaHei UI",0,32));
        messageBox.setEditable(false);
        messageBox.setBackground(Color.white);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        messageBox.setText("");

        File f=new File(path.getText());
        if(!f.exists()){
            messageBox.append("Path Is Not Correct!!");
            return;
        }
        lineCount=0;
        fileNums=0;
        doList(f);
        messageBox.append("文件总数: "+fileNums+"\n");
        messageBox.append("代码总行数: "+lineCount+"\n");



    }


    public void doList(File file){

        if(file.isDirectory()){

            File[] files=file.listFiles();
            for(File file1:files){
                doList(file1);
            }
        }else{
            if(file.getName().contains(".java")){
//                System.out.println(file.getName());
                fileNums++;
                messageBox.append(file.getName()+":"+countLines(file)+"\n");


            }
        }

    }

    public int countLines(File file) {
        try {

            BufferedReader br=new BufferedReader(new FileReader(file));
            int count=0;
            while (br.readLine()!=null){
                count++;
            }
            lineCount+=count;
            return count;
        }catch (Exception e){
//            System.err.println("Wrong!!!");
            return 0;
        }

    }

    public static void main(String[] args) {
        new Lines();
    }
}
