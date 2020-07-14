import Superpowers.Affiliation;
import Superpowers.Human;
import Superpowers.SuperHuman;

public class Application {
    public static void main(String[] args) {
    Human Bob = new Human("Bob", "Male", "Office work", "15/08/2016");
    Human Lil = new Human("Lil", "Female", "Ranger", "15/08/2016");
    Human Tim = new Human("Tim", "Male", "Home", "15/08/2016");
    
    Bob.setName("Tom");
    Lil.setGender("Male");
    Tim.setDob("10/10/2000");
    

    System.out.println("\nBobs name was Bob but now it's: " + Bob.getName());
    System.out.println("Lils gender was Female but now it's: " + Lil.getGender());
    System.out.println("Tims birthday was 15/08/2016 but now it's: " + Tim.getDob());
    

    SuperHuman WonderWoman = new SuperHuman("Becc", "Female", "Reporter", "04/10/2012", "WonderWoman", Affiliation.Good);
    SuperHuman Flash = new SuperHuman("Henry", "Male", "Professor", "15/03/1990", "Flash", Affiliation.Bad);
    SuperHuman CatWoman = new SuperHuman("Grace", "Female", "Barista", "25/06/2001", "CatWoman", Affiliation.Neutral);

    WonderWoman.setPowerSoundEffect("Swooooshh");
    Flash.setCatchPhrase("Flash to the rescue!");
    Flash.setAbility("super speed");
    WonderWoman.setCatchPhrase("I guess we'll have to use the belt of truth.");
    CatWoman.setAffiliation(Affiliation.Good);
    
    System.out.println("\nCatWoman's real name is " + CatWoman.getName());
    System.out.println("Flash's real name is " + Flash.getName());
    System.out.println("WonderWoman's real name is " + WonderWoman.getName());

    System.out.println("\nWonderWoman: " + WonderWoman.usePower());
    System.out.println("Flash's ability: " + Flash.getAbility());
    System.out.println("CatWoman's new affiliation is: " + CatWoman.getAffiliation());
    }
}