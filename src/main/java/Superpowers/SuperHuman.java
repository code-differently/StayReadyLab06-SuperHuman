package Superpowers;

public class SuperHuman extends Human {

    private enum Affiliations {GOOD,BAD,NEUTRAL};
    private String heroName;
    private String power;
    private Affiliations affiliations;

    public SuperHuman(){
        super();
        heroName = "Cupcake";
        affiliations = Affiliations.NEUTRAL;
        power = "Quirk: Frost Shots";
    }

    public SuperHuman(String name, int age, String gender, String occupation, String address, String heroName, Affiliations affiliations, String power) {
        super(name, age, gender, occupation, address);
        this.heroName = heroName;
        affiliations = affiliations;
        this.power = power;
    }

    public SuperHuman(String name, int age, String gender, String heroName, Affiliations affiliations, String power) {
        super(name, age, gender);
        this.heroName = heroName;
        affiliations = affiliations;
        this.power = power;
    }

    public SuperHuman(String name, int age, String heroName, Affiliations affiliations, String power) {
        super(name, age);
        this.heroName = heroName;
        affiliations = affiliations;
        this.power = power;
    }

    public SuperHuman(String name, String heroName, Affiliations affiliations, String power) {
        super(name);
        this.heroName = heroName;
        affiliations = affiliations;
        this.power = power;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Affiliations getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(Affiliations affiliations) {
        this.affiliations = affiliations;
    }

    public SuperHuman(String heroName, Affiliations affiliations, String power) {
        super();
        this.heroName = heroName;
        affiliations = affiliations;
        this.power = power;
    }
}
