package Application;
import metier.*;
public class Main {
public static void  main(String[] args) {
        // first part of answers
        Reponse r1_1 = new Reponse("RABAT", true);
        Reponse r1_2 = new Reponse("FES", false);
        Reponse r1_3 = new Reponse("CASABLANCA", false);
        Reponse[] r1 = {r1_1, r1_2, r1_3};
        // second part of answers
        Reponse r2_1 = new Reponse("RABAT", true);
        Reponse r2_2 = new Reponse("FES", false);
        Reponse r2_3 = new Reponse("CASABLANCA", false);


//// Question number 1

        Question q1_1 = new Question("first Question ", "which of these cities is the capital of morocco ", r1);
        Question q1_2 = new Question("first Question ", "which of these cities is the capital of morocco ", r1);
        Question q1_3 = new Question("first Question ", "which of these cities is the capital of morocco ", r1);
        Question q1_4 = new Question("first Question ", "which of these cities is the capital of morocco ", r1);

//// Questionnaire
        Question[] q1 = {q1_1};
        Questionnaire qu1 = new Questionnaire("First Exam ", q1);

        qu1.startExam();



}

}