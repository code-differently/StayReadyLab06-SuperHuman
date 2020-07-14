package Superpowers;

public class SuperHuman extends Human{
    private String alias;
    private enum Affiliation {GOOD, BAD, NEUTRAL};
    private String ability;
    private String catchPhrase;
    private String soundEffect;

    public SuperHuman() {
        alias = "";
        ability = "";
        catchPhrase = "";
        soundEffect = "";
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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


    private enum Affilation{
        GOOD("Hero"), BAD("Villan"), NEUTRAL("SuperHuman");
        private String whichSide;

        public String getWhichSide(){
            return whichSide;
        }

        private Affilation(String whichSide){
            this.whichSide = whichSide;
        }
    }
}

