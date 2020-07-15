package Superpowers;

import java.time.LocalDate;

public class Superhuman extends Human{

    private String alias;
    enum affiliation { good, bad, neutral }
    private affiliation aff;
    private String ability;
    private String phrase;
    private String soundFx;


    public Superhuman(String name, LocalDate birthday, String gender, String occupation, String alias, String ability) {

        super(name, birthday, gender,occupation);
        this.alias = alias;
        this.ability = ability;
        this.aff = affiliation.neutral;;

    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public affiliation getAff() {
        return aff;
    }

    public void setAff(affiliation aff) {
        this.aff = aff;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String catchPhrase() {

        return phrase;
    }

    public String usePower() {

        return phrase + ", " + soundFx;
    }

    public void setPhrase(String phrase) {

        this.phrase = phrase;
    }

    public void setSoundFx(String fx) {

        this.soundFx = fx;
    }




}
