package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Score {
    private JFrame windows;
    private JPanel panel;
    private JLabel scoreLabel;
    private JButton toIndex, exit;
    private int score, number;

    public Score(JFrame windows, int score, int number){
        this.windows = windows;
        this.score = score;
        this.number = number;

    }

    public void creatAction(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBorder(new EmptyBorder(new Insets(150,200,150,200)));

        scoreLabel = new JLabel ("You Score : "+score+"/"+number+"  Point");
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Monospaced", Font.BOLD, 40));
        scoreLabel.setForeground(new Color(210, 105, 30));
        scoreLabel.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
        scoreLabel.setBounds(300,100,600,100);

        toIndex = new JButton("Back to home");
        toIndex.setSize(300,200);
        toIndex.setBounds(460,300,300,75);
        toIndex.setBackground(Color.green);

        exit = new JButton("EXIT");
        exit.setSize(300,200);
        exit.setBounds(460,400,300,75);
        exit.setBackground(Color.RED);

        panel.add(scoreLabel);
        panel.add(toIndex);
        panel.add(exit);
        windows.setContentPane(panel);

        Action();
        windows.setVisible(true);
    }

    public void Action() {
        toIndex.addActionListener((ActionEvent e)->{
            Main.createWindows();
            windows.setVisible(false);
        });

        exit.addActionListener((ActionEvent e)->{
            System.exit(0);
        });
    }


}
