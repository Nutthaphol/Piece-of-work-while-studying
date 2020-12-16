package com.company;
import java.io.*;

public class Quiz {
    private String problem;
    private String [] choice;
    private String image;
    private int allQuestion;
    private String howto;

    public Quiz(){}

    public Quiz (int number){
        fineQuiz(number);
    }

    private void fineQuiz(int number){
        try{
            BufferedReader in = new BufferedReader(new FileReader("Quiz\\"+number+".txt"));
            problem = in.readLine();
            choice = new String[4];
            image = "Image\\"+number+".png";
            for(int i = 0; i < 4; i++){
                choice[i] = in.readLine();
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getChoice (int number,int select){
        fineQuiz(number);
        return choice[select-1];
    }

    public String getProblem (int number){
        fineQuiz(number);
        return problem;
    }

    public String getProblem (){
        return problem;
    }

    public String getImage(){
        return image;
    }
    public String getImage(int number){
        fineQuiz(number);
        return image;
    }

    public int getNumberOfQuestion() {
        int allQuestion = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("Quiz\\Number of question.txt"));
            allQuestion = Integer.parseInt(in.readLine());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allQuestion;
    }

    public String getHowto(){
        try {
            BufferedReader in = new BufferedReader(new FileReader("Quiz\\How to.txt"));
            howto = in.readLine();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return howto;
    }
}
