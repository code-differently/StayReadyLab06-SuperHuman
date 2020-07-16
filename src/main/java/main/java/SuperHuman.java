package main.java;

import Superpowers.Human;

public class SuperHuman extends Human { // bc SuperHuman is a subclass of Human
    
    
    private String alias; 
    Affiliation affiliation;
    private String ability;

    public SuperHuman(){

    }

    public SuperHuman(String alias,Affiliation aff,String ability){
        this.alias=alias;
        this.affiliation=aff; 
        this.ability=ability; 
    }
    
    //getters 
    public String getAlias(){
        return alias; 
    }

    public Affiliation getAffiliation(){
        return affiliation;
    }

    public String getAbility(){
        return ability; 
    }
     
    //setters 
    public void setAlias(String alias) {
        this.alias = alias;}

    public void setAffiliation(String aff) {
        this.affiliation = aff;}

    public void setAbility(String ability) {
        this.ability = ability;}
    

    private String getCatchPhrase(){
      return catchPhrase;
    } 

    private String usePower(){
       
        return ability; 
    }


    @Override
    public String toString(){
        return catchphrase +" "+ alias + " " +usePower; 
    }


}