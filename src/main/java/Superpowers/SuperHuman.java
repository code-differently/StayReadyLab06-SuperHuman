package Superpowers;
import java.time.LocalDate;
public class SuperHuman extends Human {
    private String alias;
    private String ability;
    private Affiliation affiliation;
    private String phrase;
    private String power;

    public SuperHuman(Integer id,String name, LocalDate birthday, String gender, String occupation,  String alias, String ability, Affiliation affiliation, String phrase, String power) {
        super(id, name, birthday, gender, occupation);
        this.alias = alias;
        this.ability = ability;
        this.affiliation = affiliation;
        this.phrase = phrase;
        this.power = power;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getAlias() {
        return alias;
    }

    public String getAbility() {
        return ability;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

//    private String getPhrase() {
//        return phrase;
//    }

//    private String getPower() {
//        return power;
//    }

    public String catchPhrase(){
        return phrase;
    }

    public String usePower(){
        return power;
    }


}
