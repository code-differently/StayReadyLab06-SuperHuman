package Superpowers;


public class SuperHuman extends Human{
    
    private String alias;
    private Affiliation affiliation;
    private String ability;
    private String catchPhrase;
    private String powerSoundEffect;

    public SuperHuman(String name, String gender, String occupation, String date, String alias, Affiliation affiliation){

        super(name, gender, occupation, date);
        setAlias(alias);
        setAffiliation(affiliation);
        ability = "";
        catchPhrase = "";
        powerSoundEffect = "";
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public String getAlias(){
        return alias;
    }

    public void setAffiliation(Affiliation affiliation){
        this.affiliation = affiliation;
    }
    

    public Affiliation getAffiliation(){
        return affiliation;
    }

    public void setAbility(String ability){
        this.ability = ability;
    }

    public String getAbility(){
        return ability;
    }

    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public String catchPhrase(){
        return catchPhrase;
    }

    public void setPowerSoundEffect(String powerSoundEffect){
        this.powerSoundEffect = powerSoundEffect;
    }

    public String usePower(){
        return catchPhrase + " " + powerSoundEffect;
    }

}