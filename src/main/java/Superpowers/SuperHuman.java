package Superpowers;

import java.time.LocalDate;

enum Affiliation {
    GOOD,BAD,NEUTRAL;

}

public class SuperHuman extends Human {
    private Affiliation affiliation;
    private String alias;
    private String ability;

    public SuperHuman(String name,String gender, String occupation, LocalDate dob,int id, String alias, String ability, Affiliation affiliation){
        super(name,gender,occupation,dob,id);
        this.alias=alias;
        this.ability=ability;
        this.affiliation=affiliation;
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
    
}