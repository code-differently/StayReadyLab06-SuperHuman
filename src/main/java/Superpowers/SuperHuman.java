package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human{
    private String alias;
    private String ability;
    private String phrase;
    private String soundEffect;

    public enum Affiliation{
        GOOD, BAD, NEUTRAL;
    }

    public SuperHuman(){
        super(0, "", "", "", LocalDate.of(0001,01,01));
        this.alias = "";
        this.ability = "";
    }

    public SuperHuman(Integer id, String name, String gender, String occupation, LocalDate dateOfBirth, String alias, String ability, String phrase, String soundEffect){
        super(id, name, gender, occupation, dateOfBirth);
        this.alias = alias;
        this.ability = ability;
        this.phrase = phrase;
        this.soundEffect = soundEffect;
    }

    public String getAlias(){
        return alias;
    }

    public String getAbility(){
        return ability;
    }

    public String getPrase(){
        return phrase;}

    public String getSoundEffect(){ return soundEffect;}


    public void setAlias(String alias){
        this.alias = alias;
    }

    public void setAbility(String ability){
        this.ability = ability;
    }

    public void setPhrase(String phrase){
        this.phrase = phrase;
    }

    public void setSoundEffect(String soundEffect){
        this.soundEffect = soundEffect;
    }

    public String catchPrase(String phrase){
        setPhrase(phrase);
        return getPrase();
    }

    public String usePower(String phrase){
        String soundEffect = catchPrase(phrase) + ", whizzzz!";
        return soundEffect;
    }

    public String toString(){
        return alias + " " + ability + " " + phrase + " " + soundEffect;
    }
}
