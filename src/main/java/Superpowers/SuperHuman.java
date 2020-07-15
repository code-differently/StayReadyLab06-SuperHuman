package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human{
    private String alias;
    private Affiliation affiliation;
    private String ability;
    private String catchPhrase;
    private String soundEffect;

    public SuperHuman(int id, String name, LocalDate dob, String gender, String occupation, String alias, String ability, String catchPhrase, String soundEffect, Affiliation affilation) {
        super(id, name, dob, gender, occupation);
        this.alias = alias;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
        this.soundEffect = soundEffect;
        this.affiliation = affilation;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public String getAbility(){
        return this.ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getCatchPhrase() {
        return this.catchPhrase;
    }
    
    public void setCatchPhrase(String phrase) {
        this.catchPhrase = phrase;
    }

    public String getSoundEffect() {
        return this.soundEffect;
    }
    
    public void setSoundEffect(String sound) {
        this.soundEffect = sound;
    }

    public String usePower() {
        return getCatchPhrase() + " " + getSoundEffect();
    }

    @Override
    public String toString() {
        return "id: " + super.getId() + " name: "+ super.getName() + " age: " + super.getAge() + " gender: " + super.getGender() + " occupation: " + super.getOccupation() + "ability: " + ability + " power: " + usePower() + " affiliation: " + affiliation;
    }
}

