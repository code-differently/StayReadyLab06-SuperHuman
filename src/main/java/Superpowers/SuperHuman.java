package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {

    private String alias;
    private Affiliation aff;
    private String ability;
    private String catchPhrase;
    private String soundEffect;

    public SuperHuman(String name, int id, String gender, LocalDate dob, String occupation, String alias, Affiliation aff, String ability, String catchPhrase, String sd) {
        super(name, id, gender, dob, occupation);
        this.alias = alias;
        this.aff = aff;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
        this.soundEffect = sd;
    }

    public String catchPhrase() {
        return catchPhrase;
    }

    public String usePower() {
        return catchPhrase + " " + soundEffect;
    }

    public String getAlias() {
        return alias;
    }

    public Affiliation getAff() {
        return aff;
    }

    public String getAbility() {
        return ability;
    }

    public String getSoundEffect() {
        return soundEffect;
    }

}
