package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Answer {
    private String ans = "?";

    public Answer(){}

    public Answer (int number){
        fineAnswer(number);
    }

    private void fineAnswer(int number){
        try{
            BufferedReader in = new BufferedReader(new FileReader("Quiz\\answer.txt"));
            for(int i = 0; i < number; i++){
                ans = in.readLine();
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAns (int number){
        fineAnswer(number);
        return ans;
    }

    public String getAns(){
        return ans;
    }
}
