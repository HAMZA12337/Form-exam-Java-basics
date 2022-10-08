package metier;

import java.util.Arrays;

public class Question {




    private  String titre ;
    private String  description;
    private Reponse[] reponse = new Reponse[3];
    private  int score ;

    // Constructor

    public Question(String titre, String description, Reponse[] reponse) {
        this.titre = titre;
        this.description = description;
        this.reponse = reponse ;
    }

//methode to get the right answer

   public String getAnswer(){
        for(Reponse rep :reponse){
            if(rep.getCoorect()==true){

            return  rep.getTitre(); }
        }
   return null; }


//    Getters

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Reponse[] getReponse() {
        return reponse;
    }

    public int getScore() {
        return score;
    }


//Setters


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReponse(Reponse[] reponse) {
        this.reponse = reponse;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
       String temp="Question "+ getDescription() ;
        for(Reponse rep :reponse){
            temp+="\n"+rep.getTitre();
        }


    return temp;}
}










