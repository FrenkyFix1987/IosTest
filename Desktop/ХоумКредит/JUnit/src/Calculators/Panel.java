package Calculators;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel {

    private JButton buttons[]= new JButton[10];
    private Font font = new Font("SanSerif", Font.BOLD, 20);
    private JTextField textField = new JTextField();
    private JButton backspace = new JButton("<-");
    private JButton equ = new JButton("=");
    private JButton plus = new JButton("+");
    private JButton divide = new JButton("/");
    private JButton multiply = new JButton("*");
    private JButton minus = new JButton("-");

    public Panel(){
        setLayout(null);
        setFocusable(true);
        grabFocus();

        backspace.setBounds(10, 250, 50, 50);
        backspace.setFont(font);
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backspace.setText(null);
            }
        });
        add(backspace);

        equ.setBounds(130, 250, 50, 50);
        equ.setFont(font);
        add(equ);

        multiply.setBounds(190, 190, 50, 50);
        multiply.setFont(font);
        add(multiply);

        minus.setBounds(190, 130, 50, 50);
        minus.setFont(font);
        add(minus);

        plus.setBounds(190, 70, 50, 50);
        plus.setFont(font);
        add(plus);

        divide.setBounds(190, 250, 50, 50);
        divide.setFont(font);
        add(divide);

        buttons[0] = new JButton("0");
        buttons[0].setBounds(70,250,50, 50);
        buttons[0].setFont(font);
        add(buttons[0]);

        for(int x=0;x<3; x++){
            for (int y=0;y<3;y++){
                buttons[x * 3 + y + 1] = new JButton((x * 3 + y + 1) + "");
                buttons[x * 3 + y + 1].setBounds(y * (50 + 10) + 10, x * (50 + 10) + 70, 50, 50);
                buttons[x * 3 + y + 1].setFont(font);
                add(buttons[x * 3 + y + 1]);
            }

        }
        textField.setEditable(false);
        textField.setBounds(10,10,230,50);
        textField.setFont(font);

        add(textField);

        ActionListener l = (ActionEvent e) ->{
            JButton b = (JButton) e.getSource();
            textField.setText(textField.getText() + b.getText());
        };

        for(JButton b : buttons){
            b.addActionListener(l);
        }

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();
                if(Character.isDigit(symbol)){
                    return;
                }
                textField.setText(textField.getText() + symbol);
            }
        });


//        JButton b2 = new JButton("234");
//        b1.setBounds(100,100,50,50);
//        JButton b3 = new JButton("345");
//        b1.setBounds(100,100,50,50);
    }
}
