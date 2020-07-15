package Superpowers;
import java.time.LocalDate;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        SuperHuman Mega  = new SuperHuman(43, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "It's punching time!");
        Human John = new Human(10, "John", LocalDate.of(2020, 2, 7), "male", "lawyer");
    }
}