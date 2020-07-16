package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {
    private String alias;
    private String ability;
    private String catchPhrase;
    private String usePower;
    private Affiliation affiliation;


    //constructor
    public SuperHuman(Integer id, String name, LocalDate dob, String gender, String occupation, String alias, String ability, String catchPhrase, String usePower, Affiliation affiliation) {
        super(id, name, dob,gender, occupation);
        this.setAlias(alias);
        this.setAbility(ability);
        this.setCatchPhrase(catchPhrase);
        this.setUsePower(usePower);
        this.setAffiliation(Affiliation.NEUTRAL);
    }

    public String getAlias(){
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability){
        this.ability = ability;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getUsePower(){
        return usePower;
    }

    public void setUsePower(String usePower){
        this.usePower = usePower;

    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }
}

