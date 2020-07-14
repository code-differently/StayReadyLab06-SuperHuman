package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human{

    private String alias;
    //private enum Affiliation { GOOD, BAD, NEUTRAL };
    private Affiliation aff;
    private String ability;
    private String catchPhrase;
    private String soundEffect;

    public SuperHuman(int id, String name, LocalDate dob, String gender,
                      String occupation, String alias, Affiliation aff,
                      String ability, String catchPhrase, String soundEffect) {

        super(id, name, dob, gender, occupation);
        this.alias = alias;
        this.aff = aff;
        this.ability = ability;
        this.catchPhrase = catchPhrase;
        this.soundEffect = soundEffect;

    }

    public String getAlias(){
        return alias;
    }

    public Affiliation getAff(){
        return aff;
    }

    public String getAbility(){
        return ability;
    }

    public String getSoundEffect(){
        return soundEffect;
    }

    public String catchPhrase(){
        return catchPhrase;
    }

    public String usePower(){
        return catchPhrase + ", " + soundEffect;
    }
}
