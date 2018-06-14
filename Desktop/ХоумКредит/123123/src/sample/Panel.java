package sample;

import javax.swing.*;

public class Panel extends JPanel {
    public Panel(){
        setLayout(null);

        JButton b1 = new JButton("123");
        b1.setBounds(100,100,50,50);
        add(b1);
//        JButton b2 = new JButton("234");
//        b1.setBounds(100,100,50,50);
//        JButton b3 = new JButton("345");
//        b1.setBounds(100,100,50,50);
    }
}
