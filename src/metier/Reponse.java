package metier;

public class Reponse  {
    private  String titre  ;
    private Boolean coorect ;
// Constructor
    public Reponse(String titre, Boolean coorect) {
        this.titre = titre;
        this.coorect = coorect;}
//    Getters
public String getTitre() {
        return titre;
    }
    public Boolean getCoorect() {
        return coorect;
    }
    //Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCoorect(Boolean coorect) {
        this.coorect = coorect;
    }
}



