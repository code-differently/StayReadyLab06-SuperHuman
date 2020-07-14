package Superpowers;

public class SuperHuman extends Human{
    private String alias;
    private enum Affiliation {GOOD, BAD, NEUTRAL};
    private String ability;

    public SuperHuman() {
        alias = "";
        ability = "";
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

