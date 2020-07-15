package Superpowers;

public enum Affiliation {
    GOOD("Hero"),
    BAD("Villain"),
    NEUTRAL("SuperHuman");

    private String whichSide;

    Affiliation(String whichSide) {
        this.whichSide = whichSide;
    }

    public String getWhichSide(){
        return whichSide;
    }
}
