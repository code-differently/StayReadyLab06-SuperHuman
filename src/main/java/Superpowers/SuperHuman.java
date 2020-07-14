package Superpowers;

import java.time.LocalDate;

enum Affiliation {
    GOOD,BAD,NEUTRAL;

}

public class SuperHuman extends Human {
    private Affiliation affiliation;
    private String alias;
    private String ability;
    private String power;
    private String catchPhrase;

    public SuperHuman(String name,String gender, String occupation, LocalDate dob,int id, 
        String alias, String ability, Affiliation affiliation, String power, String catchPhrase){
        super(name,gender,occupation,dob,id);
        this.alias=alias;
        this.ability=ability;
        this.affiliation=affiliation;
        this.power=power;
        this.catchPhrase=catchPhrase;
    }

    public Affiliation getAffiliation(){
        return this.affiliation;
    }

    public String getAlias(){
        return this.alias;
    }

    public String getAbility(){
        return this.ability;
    }

    public void setAlias(String alias){
        this.alias=alias;
    }

    public void setAbility(String ability){
        this.ability=ability;
    }

    public String catchPhrase(){
        return catchPhrase;
    }

    public String usePower(){
        return this.catchPhrase+this.power;
    }

    public String getPower(){
        return this.power;
    }
    
}