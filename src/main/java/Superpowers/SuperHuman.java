package Superpowers;


public class SuperHuman extends Human
{
    
    public String alias;
    public Affiliation affiliation;
    public String ability;

    private String msg = "Superhuman";

    public enum Affiliation
    {
        LAWFUL_GOOD, TRUE_NEUTRAL, CHAOTIC_EVIL
    }

    public SuperHuman() 
    {
        super();
    }

    public SuperHuman(String alias, Affiliation affiliation, String ability)
    {
        this.alias = alias;
        this.affiliation = affiliation;
        this.ability = ability;
        
    }

    @Override
    public void catchPhrase()
    {
        System.out.println(msg);
    }

    public void usePower()
    {
        System.out.println("\n" + msg + ". "+ getAlias() + 
                            " used " + getAbility() + "!\n");
    }

    public Affiliation getAffilliation()
    {
        return this.affiliation;
    }

    public String getAlias()
    {
        return alias;
    }

    public String getAbility()
    {
        return ability;
    }      
}