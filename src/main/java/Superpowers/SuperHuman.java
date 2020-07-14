package Superpowers;

public class SuperHuman extends Human {
    
    private String alias;
    private Affiliation affiliation;
    private String ability;
    private String phrase;
    private String effect;

    public SuperHuman(String alias, Affiliation affiliation, String ability, String phrase, String effect) {
        this.alias = alias;
        this.affiliation = affiliation;
        this.ability = ability;
        this.phrase = phrase;
        this.effect = effect;
    }

    public SuperHuman(){
        alias = "";
        affiliation = null;
        ability = "";
        phrase= "";
        effect = "";
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation){
        this.affiliation = affiliation;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getCatchPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String usePower() {
        return phrase + " "+ effect;
    }

    
    public void setEffect(String effect) {
        this.effect = effect;
    }




}