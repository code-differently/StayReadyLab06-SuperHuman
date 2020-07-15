package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {

    private String alias;
    private String ability;
    private Affiliation affiliation;
    private String phrase;
    private String power;

    public SuperHuman(int id, String name, LocalDate dob, String gender, String occupation, String alias, String ability, Affiliation affiliation, String phrase, String power) {
        super(id, name, dob, gender, occupation);
        this.alias = alias;
        this.ability = ability;
        this.affiliation = affiliation;
        this.phrase = phrase;
        this.power = power;
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

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String catchPhrase() {
        return getPhrase();
    }

    public String usePower() {
        return getPhrase() + ", " + getPower();
    }

    @Override
    public String toString() {
        return alias + " " + ability + " " + affiliation + " " + phrase + " " + power;
    }

}
