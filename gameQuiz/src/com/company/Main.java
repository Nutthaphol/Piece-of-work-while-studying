package com.company;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        createWindows();
    }

    public static void createWindows (){
        JFrame windows = new JFrame ("Guess Who Back");

        windows.setSize(1280,720);
        windows.setLocationRelativeTo(null);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Index index = new Index(windows);
        index.createWindows();
        index.Action();
    }
}
