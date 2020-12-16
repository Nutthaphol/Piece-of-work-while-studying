package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class How extends JFrame{
    private JPanel panel;
    private double time = 60;

    public How (){
        setSize(600,500);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);

        Quiz quiz = new Quiz();
        JLabel text = new JLabel(quiz.getHowto());
        text.setFont(new Font("DialogInput", Font.BOLD, 25));
        text.setBounds(30,5,550,150);
        text.setForeground(Color.black);
        panel.add(text);
        ImageIcon image = new ImageIcon("Image\\java.png");
        System.out.println(image);
        JLabel img = new JLabel(image);
        img.setBounds(8,120,570,350);;
        panel.add(img);

        setContentPane(panel);

        setVisible(true);
    }

}
