package Superpowers;

import java.time.LocalDate;

enum Afilliation
{
    Good,Bad,Neutral;
}
public class Superhuman extends Human {
    
    private String alias;
    private String ability; 
    private Afilliation afilliation;
    private String catchPhrase;
    private String power; 

    

    Superhuman()
    {
        super();
        this.alias = "My alias";
        this.ability = "My ability";
        this.afilliation = Afilliation.Good;
        this.catchPhrase = "catch Phrase";
        this.power = "power";

    }
    Superhuman(String pow,String abi , int id, LocalDate dob ,String name,String gender,String occupation)
    {
        super(id, dob, name, gender, occupation);
        this.ability = abi;
        this.power = pow; 
    }
    Superhuman(String ali, String abi, Afilliation afill, String cp, String pow)
    {
        super();
        this.alias= ali;
        this.ability = abi; 
        this.afilliation = afill;
        this.catchPhrase=cp;
        this.power = pow;
    }
    

    public String getalias()
    {
      return this.alias;
    }
    public void setalias(String ali)
    {
        this.alias = ali;
    }
    public String getability()
    {
      return this.ability;

    }
    public void setability(String abi)
    {
        this.ability = abi;
    }
    public Afilliation getafiliation()
    {
      return this.afilliation;

    }
    public void setafiliation(Afilliation afill)
    {
        this.afilliation = afill;
    }
    public String catchPhrase()
    {
        return this.catchPhrase;
    }
    public void setCatchPhrase(String cp)
    {
        this.catchPhrase = cp;
    }
    public String usePower()
    {
        return this.catchPhrase + this.power;
    }
    public void setPowers(String pow)
    {
        this.power = pow; 
    }
    public String getPowers()
    {
        return this.power;
    }
}