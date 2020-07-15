package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {

    public enum Affiliation {GOOD,BAD,NEUTRAL};
    private String alias;
    private String ability;
    private Affiliation affiliation;
    private String catchPhrase;
    private String soundEffect;


    public SuperHuman(String name, String gender, String occupation, LocalDate dateOfBirth, String address){
        super(name, gender, occupation, dateOfBirth, address, );
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

    public Affiliations getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(Affiliations affiliations) {
        this.affiliations = affiliations;
    }

    public SuperHuman(String alias, Affiliations affiliations, String ability) {
        super();
        this.alias = alias;
        affiliations = affiliations;
        this.ability = ability;
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
