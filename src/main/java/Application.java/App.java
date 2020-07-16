import Superpowers.Affiliation;
import Superpowers.Human;
import Superpowers.SuperHuman;

public class App {
    public static void main(String[] args) {
    Human Lisa = new Human("Lisa", "Female", "Engineer", "15/08/2016");
    Human Coby = new Human("Coby", "Male", "Doctor", "15/08/2008");
    Human Corie = new Human("Corie", "Male", "Lawyer", "15/08/2016");
    
    Lisa.setName("Lauren");
    Coby.setGender("Male");
    Corie.setDob("10/20/1995");
    

    System.out.println("\nLauren's name was Lauren but now it's: " + Lisa.getName());
    System.out.println("Coby's gender was Male but now it's: " + Coby.getGender());
    System.out.println("Corie's birthday was 15/08/2016 but now it's: " + Corie.getDob());
    

    SuperHuman Storm = new SuperHuman("Lizzie", "Female", "Actress", "04/10/2012", "Storm", Affiliation.GOOD);
    SuperHuman BlackWidow = new SuperHuman("Fiona", "Female", "Singer", "15/03/1990", "BlackWidow", Affiliation.BAD);
    SuperHuman Supergirl = new SuperHuman("Michelle", "Female", "Clerk", "25/06/2001", "Supergirl", Affiliation.NEUTRAL);

    Storm.setPowerSoundEffect("BOOOOOM");
    BlackWidow.setCatchPhrase("Oh, I've got Stark. You get the big guy");
    BlackWidow.setAbility("Espionage");
    Storm.setCatchPhrase("Storm, Misstress of the elements");
    Supergirl.setAffiliation(Affiliation.GOOD);
    
    System.out.println("\nSupergirl's real name is " + Supergirl.getName());
    System.out.println("BlackWidow's real name is " + BlackWidow.getName());
    System.out.println("Storm's real name is " + Storm.getName());

    System.out.println("\nStorm's: " + Storm.usePower());
    System.out.println("BlackWidow's ability: " + BlackWidow.getAbility());
    System.out.println("Supergirl's new affiliation is: " + Supergirl.getAffiliation());
    }
}