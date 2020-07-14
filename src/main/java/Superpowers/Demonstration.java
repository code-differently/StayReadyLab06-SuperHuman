package Superpowers;

import java.time.LocalDate;

public class Demonstration {

    public static void main(String... args) {

        Human human1 = new Human("Harry Potter", 25, "Boy",
                            LocalDate.of(2003, 9, 13),"Wizard");
        Human human2 = new Human("James Bond", 7, "Man",
                            LocalDate.of(1980, 3, 4), "Agent");

        SuperHuman super1 = new SuperHuman("Clark Kent", 100, "Man",
                            LocalDate.of(1990, 4, 30), "Journalist",
                            "Superman", Affiliation.GOOD, "Fly", "Up, up, and away!", "wooosh");
        SuperHuman super2 = new SuperHuman("Peter Parker", 1, "Man",
                            LocalDate.of(1998, 8, 15), "Photographer",
                            "Spider-Man", Affiliation.GOOD, "Shoot webs", "It's your Friendly Neighborhood Spider-Man!", "thwwip");

        // Demonstration of getter methods
        System.out.println("Human 1 Information");
        printHumanInfo(human1);
        System.out.println("\nHuman 2 Information");
        printHumanInfo(human2);

        // Demonstration of setter methods
        System.out.println("\nUpdating humans...\n");
        human1.setName("Alfred Pennyworth"); human1.setDob(LocalDate.of(1940, 1, 25)); human1.setGender("Man"); human1.setOccupation("Butler");
        human2.setName("Mary Jane Watson"); human2.setDob(LocalDate.of(1999, 7, 11)); human2.setGender("Woman"); human2.setOccupation("Reporter");

        // Showing updated information of humans
        System.out.println("Human 1 Information");
        printHumanInfo(human1);
        System.out.println("\nHuman 2 Information");
        printHumanInfo(human2);

        // Demonstration of methods inherited from Human and methods created in SuperHuman
        System.out.println("\nSuperHuman 1 Information");
        printSuperInfo(super1);
        System.out.println("\nSuperHuman 2 Information");
        printSuperInfo(super2);

        // Demonstration of SuperHumans using powers
        System.out.println("\n" + super1.getAlias() + " using powers...\n" + super1.usePower());
        System.out.println("\n" + super2.getAlias() + " using powers...\n" + super2.usePower());

    }

    private static void printHumanInfo(Human human) {
        System.out.println("Name: " + human.getName() + "\nID: " + human.getId() + "\nGender: " + human.getGender() +
                "\nDate of Birth: " + human.getDob() + ", Age: " + human.getAge() + "\nOccupation: " + human.getOccupation());
    }

    private static void printSuperInfo(SuperHuman human) {
        System.out.println("Name: " + human.getName() + ", Alias: " + human.getAlias() + "\nID: " + human.getId() + "\nGender: " + human.getGender() +
                "\nDate of Birth: " + human.getDob() + ", Age: " + human.getAge() + "\nOccupation: " + human.getOccupation() +
                "\nAffiliation: " + human.getAff() + "\nCatch Phrase: " + human.catchPhrase() + "\nAbility: " + human.getAbility());
    }
}
