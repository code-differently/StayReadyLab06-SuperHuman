package SuperHuman;
 import Superpowers.Human;

public class SuperHuman extends Human {//bc SuperHuman is a subclass of Human

    private String alias; 
    private Affiliation.affiliation affiliation;
    private String ability;
    private String power;
    private String phrase; 


    public SuperHuman(String alias, Affiliation.affiliation affiliation, String ability, String power, String phrase){
        //super(id,name,dateOfBirth,gender,occupation); //importing from human
        this.alias=alias;
        this.affiliation=affiliation; 
        this.ability=ability; 
        this.power=power;
        this.phrase=phrase;
    }
    

	//getters 
    public String getAlias(){
        return alias; 
    }

    public Affiliation.affiliation getAffiliation(){
        return affiliation;
    }

    public String getAbility(){
        return ability; 
    }
     
    //setters 
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setAffiliation(Affiliation.affiliation aff) {

        this.affiliation = aff;
    }

    public void setAbility(String ability) {

        this.ability = ability;
    }

    public void setPhrase(String phrase){
        this.phrase=phrase; 
        
    }

    private String getPhrase(){
      return phrase;
    } 

    
    public void setPower(String power){
        this.power=power;
    }


    public String getPower(){

        return power; 
    }
    
    public String getCatchPhrase(){

        return getPhrase();
    }

    @Override
    public String toString(){

        return phrase +" "+ alias + " " +power+ " "+ affiliation+ " "+ ability;
    }
}    