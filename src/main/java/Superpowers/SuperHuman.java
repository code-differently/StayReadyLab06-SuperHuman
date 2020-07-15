package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human{

    private String alias;
    private String ability;
    private String catchPhrase;
    private String soundEffect;
    private Affiliation affiliation;


    public SuperHuman(String name, LocalDate dob, String gender, String occupation, int age,
                        String alias, String ability, Affiliation affiliation, String catchPhrase,
                      String soundEffect) {
        super(name, dob, gender, occupation, age);
        this.ability = ability;
        this.affiliation = affiliation;
        this.alias = alias;
        this.catchPhrase = catchPhrase ;
        this.soundEffect = soundEffect;

    }
    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getUsePower() {
        return this.catchPhrase + this.soundEffect;
    }

    public String getSoundEffect() {
        return soundEffect;
    }

    public void setSoundEffect(String soundEffect) {
        this.soundEffect = soundEffect;
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
}
