package Superpowers;

import java.time.LocalDate;

public class SuperHuman extends Human {
    private String alias;
    private String ability;
    Affiliation affiliation;
    private String phrase;
    private String effect;
    public enum Affiliation
    {
        GOOD, BAD, NEUTRAL;
    }
    public SuperHuman(String name, int id, String gender,String occupation, LocalDate dob){
        super(name, id, gender, occupation, dob);
    }
    
    public SuperHuman(String alias, String ability,String phrase, String effect){
        this.ability=ability;
        this.alias=alias;
        this.phrase=phrase;
        this.effect=effect;
    }
    public Affiliation getAffilliation(){
        return this.affiliation;
    }
    public String getAlias(){
        if (alias==null){
            return this.getName();
        }
        return alias;
    }
    public String getAbility(){
        return ability;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public void setAbility(String ability){
        this.ability=ability;
    }
    public void setEffect(String efx){
        effect=efx;
    }
    public void setCatchPhrase(String phrase) {
        this.phrase=phrase;
    }
    public String usePower() {
        return phrase + " "+ effect;
    }
    public String getCatchPhrase() {
        return phrase;
    }
    
    public String toString() {
        String output="";
            output+= this.getName() + " ID: " + this.getID() + " Gender: " + this.getGender() + " Job: " + 
            this.getOccupation() + " DOB: " + this.getDOB() +" Alias: "+this.getAlias()+" Powers: "+ability ;
        return output;
    }
    
    public static void main(String... args) {

        Human human1 = new Human("Dick Grayson", 27, "Male",
                            "Sidekick", LocalDate.of(1950, 6, 23));
        Human human2 = new SuperHuman("Batman", "espionage","I'm Batman", "kaboom");

        SuperHuman super1 = new SuperHuman("Spiderman","sticky","My spidey-senses are tingling", "pow");
        SuperHuman super2 = new SuperHuman("Stitch", 626,"Male", "alien",LocalDate.of(2003, 7, 5) );
        

        System.out.println("Human Catalog\n");
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(super1.toString());
        System.out.println(super2.toString());
        
        human1.setName("Night Wing"); human1.setDOB(LocalDate.of(1940, 1, 25));
        human1.setOccupation("Detective");
        human2.setName("Bruce Wayne");
        human2.setDOB(LocalDate.of(1956, 12, 1));
        human2.setGender("Male");
        human2.setOccupation("Billionaire");
        super1.setName("Peter Parker");
        super1.setOccupation("Student");
        super1.setDOB(LocalDate.of(2003, 6, 6));
        super1.setName("Peter Parker");
        super1.setGender("Male");
        super2.setAbility("strong");
        super2.setCatchPhrase("hiiii");
        super2.setEffect("bam!");
        super1.setAffiliation(Affiliation.GOOD);
        super2.setAffiliation(Affiliation.BAD);

        System.out.println("\nUpdated Catalog\n");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(super1);
        System.out.println(super2);

        System.out.println(super1.getAlias()+": " + super1.usePower()+" for "+super1.getAffilliation());
        System.out.println(super2.getAlias() +": "+ super2.usePower()+" for "+super2.getAffilliation());

    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getEffect() {
        return effect;
    }

}