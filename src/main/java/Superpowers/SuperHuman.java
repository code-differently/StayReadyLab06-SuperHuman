package Superpowers;

public class SuperHuman extends Human {
  private String alias; 
  private HeroStatus affiliation;
  private String ability;

  public SuperHuman(){
    super();

  }

  public SuperHuman(String alias, String ability, HeroStatus side){
    super();
    this.alias = alias; 
    this.ability = ability;
    this.affiliation = side;
  }

  public String catchPhrase(){
    return "To infinity and beyond";
  }

  public String usePower(){
    return "You know what was coming..." + catchPhrase();
  }

  public void setAlias(String alias){
    this.alias = alias;
  }

  public String getAlias(){
    return this.alias;
  }

  public void setAbility(String ability){
    this.ability = ability;
  }

  public String getAbility(){
    return this.ability;
  }

  public void changeAffiliation(HeroStatus set){
    this.affiliation = set;
  }

  public HeroStatus getAffiliation(){
    return this.affiliation;
  }




  
}