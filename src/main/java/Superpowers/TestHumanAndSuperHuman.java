
package Superpowers;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestHumanAndSuperHuman {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<SuperHuman> superHumans = new ArrayList<>();

        Human jamaal = new Human(12, "Jamaal Hester", LocalDate.of(1994, 2, 3), "male", "Neurosurgeon");
        Human greta = new Human(13,"Greta Romero", LocalDate.of(1986, 4, 24), "woman", "Wind Turbine Technician");

        humans.add(jamaal);
        humans.add(greta);

        SuperHuman bruce = new SuperHuman(14, "Bruce Banner", LocalDate.of(1969,12, 18), "male", "destroying stuff", "Hulk", "super strength", "Hulk smash!", "Boom!", Affiliation.GOOD);
        SuperHuman johnny = new SuperHuman(13, "Johnny Blaze", LocalDate.of(1971,8, 16), "male", "tracking down and destroying BlackHeart", "Ghost Rider", "control fire", "Sorry, all out of mercy.", "Boom!", Affiliation.BAD);

        superHumans.add(bruce);
        superHumans.add(johnny);

        for(Human human: humans) {
            System.out.println(human.getName() + "'s age is: " + human.getAge() + ". " + human.getName() + " is a " + human.getOccupation());
            System.out.println();
        }

        for(SuperHuman superHuman: superHumans) {
            System.out.println(superHuman.getName() + "'s age is: " + superHuman.getAge() + ". " + superHuman.getName() + "'s occupation consists of " + superHuman.getOccupation() + ".");
            System.out.println(superHuman.getName() + " goes by: " + superHuman.getAlias() + " and sometimes likes to say: " + superHuman.usePower());
            System.out.println();
        }
    }
}