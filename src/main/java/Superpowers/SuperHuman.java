package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {
    private String alias = "";
    private String ability = "";
    private Affiliation affiliation;
    private String catchPhrase = "";
    private String sound = "";

    public SuperHuman(){
    }

    public SuperHuman(String alias, String ability, Affiliation affiliation, String catchPhrase, String sound, String name, LocalDate dob, String gender, String occupation){
        super(name, dob, gender, occupation);
        this.alias = alias;
        this.ability = ability;
        this.affiliation = affiliation;
        this.catchPhrase = catchPhrase;
        this.sound = sound;
    }
    private String catchPhrase(){
        return this.catchPhrase;
    }

    public String usePower(){
        return catchPhrase()+" "+this.sound;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
