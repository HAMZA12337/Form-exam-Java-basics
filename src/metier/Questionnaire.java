package metier;

import java.util.Arrays;
import java.util.Scanner;

public class Questionnaire {

    private  String titre ;
    private Question[] question=new Question[5];


    // Constructor

    public Questionnaire(String titre, Question[] question) {
        this.titre = titre;
        this.question =question;
    }


//    Getters

    public String getTitre() {
        return titre;
    }

    public Question[] getQuestion() {
        return question;
    }


//Setters


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setQuestion(Question[] question) {
        this.question = question;
    }


    @Override
    public String toString() {
        String temp ="Questionnaire :"+getTitre();
        for(Question ques :question){
            temp+="\n"+ques.toString();
        }

        return temp;}


    // we need a methode that will stop users to enter their answers

    public void startExam(){
        String temp ="Questionnaire :"+getTitre();
        for(Question ques :question){
            System.out.println(ques.toString());
            System.out.println("Write down  the answer that  you think is correct :");
            Scanner scanner =new Scanner(System.in);
            String answer=scanner.nextLine();
               if(answer.equalsIgnoreCase(ques.getAnswer())){
                    ques.setScore(1);

               }
        }
System.out.println("You finish your first Exam ");

        int score=0;
        for(Question ques :question) {

        score+=ques.getScore();
        }

        System.out.println("Your Score is :"+score);





    }











}



