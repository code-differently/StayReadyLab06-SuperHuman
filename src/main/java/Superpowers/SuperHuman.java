package Superpowers;

public class SuperHuman extends Human
{
    // Declaring variables
    private String alias;
    private Affiliation affiliation;
    private String ability;
    private String catchPhrase;
    protected final static String POWER_NOISE = "Fwoosh fwip fwop";

    // Overloading constructor
    public SuperHuman()
    {
        this.alias = "No alias";
        this.affiliation = Affiliation.GOOD;
        this.ability = "Ability not unlocked";
        this.catchPhrase = "What to say";
    }

    public SuperHuman(String alias, Affiliation affiliation, String ability, String catchPhrase)
    {
        this.alias = alias;
        this.affiliation = affiliation;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
    }

    // Getters and setters
    public String catchPhrase()
    {
        return this.catchPhrase;
    }
    public void setCatchPhrase(String catchPhrase)
    {
        this.catchPhrase = catchPhrase;
    }

    public String getAlias()
    {
        return this.alias;
    }
    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public String getAffiliation()
    {
        return this.affiliation.toString();
    }
    public void setAffiliation(Affiliation affiliation)
    {
        this.affiliation = affiliation;
    }

    public String getAbility()
    {
        return this.ability;
    }
    public void setAbility(String ability)
    {
        this.ability = ability;
    }


    public String usePower()
    {
        return catchPhrase() + " " + POWER_NOISE;
    }

}