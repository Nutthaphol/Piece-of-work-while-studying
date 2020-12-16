package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    private JFrame windows;
    private JPanel panel;
    private JButton select1;
    private JButton select2;
    private JButton select3;
    private JButton select4;
    private JButton nextScore;
    private ImageIcon image;
    private JLabel problem;
    private JLabel saveImage;

    private Quiz quiz;
    private Answer ans;

    public int number;
    private int now = 1;
    private String userAns;
    public int score = 0;
    private String sysAns;

    public Game (JFrame windows){
        this.windows = windows;
    }

    public void creatWindows() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBorder(new EmptyBorder(new Insets(150,200,150,200)));

        quiz = new Quiz();
        number = quiz.getNumberOfQuestion();
        image = new ImageIcon(quiz.getImage(now));
        saveImage = new JLabel(image);
        saveImage.setBounds(455,10,350,150);;
        problem = new JLabel(quiz.getProblem(now));
        problem.setFont(new Font("DialogInput", Font.BOLD, 25));
        problem.setBounds(480,130,350,150);
        problem.setForeground(Color.black);

        panel.add(saveImage);
        panel.add(problem);

        select1 = new JButton(quiz.getChoice(now,1));
        select2 = new JButton(quiz.getChoice(now,2));
        select3 = new JButton(quiz.getChoice(now,3));
        select4 = new JButton(quiz.getChoice(now,4));

        select1.setBounds(300,250,250,50);
        select1.setBackground(Color.yellow);

        select2.setBounds(700,250,250,50);
        select2.setBackground(Color.yellow);

        select3.setBounds(300,350,250,50);
        select3.setBackground(Color.yellow);

        select4.setBounds(700,350,250,50);
        select4.setBackground(Color.yellow);

        panel.add(select1);
        panel.add(select2);
        panel.add(select3);
        panel.add(select4);

        windows.setContentPane(panel);
        Action();
        windows.setVisible(true);
    }

    public void Action(){
        ans = new Answer();

        select1.addActionListener((ActionEvent e)->{
            userAns = select1.getText();
            sysAns = ans.getAns(now);
            System.out.println(userAns + " = " + ans.getAns());
            if(userAns.equals(sysAns)){
                score++;
                System.out.println("yes, Score is "+score);
            }

            if (now < 10){
                now ++;
                nextProblem();
            }
            else{
                nextPage();
            }
        });

        select2.addActionListener((ActionEvent e)->{
            userAns = select2.getText();
            sysAns = ans.getAns(now);
            System.out.println(userAns + " = " + ans.getAns());
            if(userAns.equals(sysAns)){
                score++;
                System.out.println("yes, Score is "+score);
            }

            if (now < number){
                now ++;
                nextProblem();
            }
            else{
                nextPage();
            }
        });

        select3.addActionListener((ActionEvent e)->{
            userAns = select3.getText();
            sysAns = ans.getAns(now);
            System.out.println(userAns + " = " + ans.getAns());
            if(userAns.equals(sysAns)){
                score++;
                System.out.println("yes, Score is "+score);
            }

            if (now < number){
                now ++;
                nextProblem();
            }
            else{
                nextPage();
            }
        });

        select4.addActionListener((ActionEvent e)->{
            userAns = select4.getText();
            sysAns = ans.getAns(now);
            System.out.println(userAns + " = " + ans.getAns());
            if(userAns.equals(sysAns)){
                score++;
                System.out.println("yes, Score is "+score);
            }

            if (now < number){
                now ++;
                nextProblem();
            }
            else{
                nextPage();
            }
        });

    }

    private void nextProblem (){
        image = new ImageIcon(quiz.getImage(now));
        saveImage.setIcon(image);

        problem.setText(quiz.getProblem(now));

        select1.setText(quiz.getChoice(now,1));
        select2.setText(quiz.getChoice(now,2));
        select3.setText(quiz.getChoice(now,3));
        select4.setText(quiz.getChoice(now,4));
    }

    private void nextPage(){
        nextScore = new JButton("Score");
        nextScore.setBounds(500,450,250,50);
        nextScore.setBackground(Color.CYAN);
        panel.add(nextScore);
        windows.setVisible(false);
        windows.setVisible(true);

        nextScore.addActionListener((ActionEvent ee) ->{
            Score scorePage = new Score(windows,score,number);
            scorePage.creatAction();
        });
    }
}
