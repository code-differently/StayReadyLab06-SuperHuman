package Superpowers;

public class SuperHuman extends Human 
{
    private String alias = "";
    private Affiliation affiliation = Affiliation.Neutral;
    private String ability = "";
    private String phrase = "";
    private String sfx = "";

 
    public SuperHuman()
    {
        super();
    }

    public SuperHuman(String alias, Affiliation affiliation, String ability, String phrase, String sfx)
    {
        super();
        this.alias = alias;
        this.affiliation  = affiliation;
        this.ability = ability;
        this.phrase = phrase;
        this.sfx = sfx;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public String getAlias()
    {
        return this.alias;
    }

    public void setAffiliation(Affiliation affiliation)
    {
        this.affiliation = affiliation;
    }

    public Affiliation getAffiliation()
    {
        return this.affiliation;
    }

    public void setAbility(String ability)
    {
        this.ability = ability;
    }

    public String getAbility()
    {
        return this.ability;
    }

    public void setPhrase(String phrase)
    {
        this.phrase = phrase;
    }

    private String catchPhrase()
    {
        return this.phrase;
    }

    public void setSound(String sfx)
    {
        
        this.sfx = sfx;
    }

    public String usePower()
    {
        return this.getAlias()+": "+catchPhrase()+", "+this.sfx;
    }

   
}