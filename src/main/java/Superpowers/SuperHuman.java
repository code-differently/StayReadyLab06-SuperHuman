package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {

    public enum Affiliation {GOOD,BAD,NEUTRAL};
    private String alias;
    private String ability;
    private Affiliation affiliation;
    private String catchPhrase;
    private String soundEffect;


    public SuperHuman(String name, int id, String gender, String occupation, LocalDate dateOfBirth, String address){
        super(name, id, gender, dateOfBirth, occupation);
        this.affiliation = affiliation;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPower() {
        return ability;
    }

    public void setPower(String ability) {
        this.ability = ability;
    }

    public Affiliation getAffiliations() {
        return affiliation;
    }

    public void setAffiliations(Affiliation affiliations) {
        this.affiliation = affiliation;
    }

    public String catchPhrase(){
        return "Frosting these hoes!";
    }

    public String usePower(){
        return catchPhrase() + "Splat!";
    }

    public static void main(String[] args) {

        //Create a main method that instantiates a few Human and SuperHuman classes

    }
}
