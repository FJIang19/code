package cn.lastwhisper.interview.InnerClass.anonymous;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class OuterClassExample extends JFrame{
    JPasswordField passwordField;
    JTextField textField;
        OuterClassExample(){
            super();
             
            setTitle("QQ");
            setBounds(100, 100, 380, 280); 
            getContentPane().setLayout(null); 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
            textField = new JTextField("密码");
            textField.setBounds(100, 155, 120, 21);
            getContentPane().add(textField);
            textField.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    getContentPane().remove(textField);
                    passwordField = new JPasswordField();
                    passwordField.setBounds(100, 155, 120, 21); 
                    getContentPane().add(passwordField);
                }
            });
             
        }
        public static void main(String[] args) {
            new OuterClassExample().setVisible(true);;
        }
}