package Superpowers;

public class SuperHuman extends Human {
    private String alias;
    private String ability;
    enum Affiliation{
        Good,
        Neutral,
        Bad
    }
    Affiliation set = Affiliation.Bad;


    
    public SuperHuman(String alias, String ability){
        this.alias = alias;
        this.ability = ability;
    }

    public SuperHuman(){
        this.alias = "";
        this.ability = "";
    }



    public String catchPhrase(){
        return "Sosa Baby";
    }

    public String usePower(){
        return catchPhrase() + " bang bang!";
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public void setAbility(String ability){
        this.ability = ability;
    }

    public String getAlias(){
        return alias;
    }

    public String getAbility(){
        return ability;
    }

    public Affiliation getAffiliation(){
        return set;
    }


}