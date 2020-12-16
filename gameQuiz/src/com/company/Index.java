package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Index{
    private JButton play, how, exit;
    public JFrame windows;
    private JPanel panel;

    public Index(JFrame windows){
        this.windows = windows;
    }

    public Index() {
    }

    public void createWindows () {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBorder(new EmptyBorder(new Insets(150,200,150,200)));

        play = new JButton("PLAY");
        play.setSize(300,200);
        play.setBackground(Color.GREEN);
        play.setBounds(460,200,300,75);
        panel.add(play);

        how = new JButton("HOW TO PLAY");
        how.setSize(300,200);
        how.setBounds(460,300,300,75);
        how.setBackground(Color.yellow);
        panel.add(how);

        exit = new JButton("EXIT");
        exit.setSize(300,200);
        exit.setBounds(460,400,300,75);
        exit.setBackground(Color.RED);
        panel.add(exit);

        windows.add(panel);
        windows.setVisible(true);
    }

    public void Action (){

        play.addActionListener((ActionEvent e) -> {
            System.out.println("Next");
            Game next = new Game(windows);
            next.creatWindows();
            // เรียกใช้หน้าต่อไป
        });

        how.addActionListener((ActionEvent e) -> {
            new How();
            System.out.println("How");
            //เรียกใช้หน้าแสดงวิธี
        });

        exit.addActionListener((ActionEvent e) -> {
            windows.setVisible(false);
            System.out.println("Exit");
            System.exit(0);
        });

    }

}
