package Superpowers;

import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) {

        /**
         * Create a main method that instantiates a few Human and SuperHuman classes
         * Demonstrate calling methods from the Human instances
         * Demonstrate calling methods inherited from Human on your SuperHuman instances
         */

        Human Man = new Human("Santana", 20, LocalDate.of(1999,9,10),
                "Man","Dancer");

        Human Women = new Human("Ash", 30, LocalDate.of(1989, 9, 13),
                "Women", "Accountant");

        Human NonBinary = new Human("Skai", 35, LocalDate.of(1985, 9, 13),
                "NonBinary", "Swimmer");

        SuperHuman superMan = new SuperHuman("John",40, "Man", "Developer",
                LocalDate.of(1980, 5,20), "Cool Guy", "Write Code",
                SuperHuman.Affiliation.NEUTRAL,"Whats the error?", "Beep!");

        SuperHuman superWomen = new SuperHuman("Julia", 50, "Women", "Quality Assurance",
                LocalDate.of(1970,3,13), "Cool Gal", "Test Code",
                SuperHuman.Affiliation.GOOD, "Does it work?", "Boop!");

        SuperHuman AverageJoe = new SuperHuman("Joe", 60, "Androgyne", "Unemployed",
                LocalDate.of(1960,3,13), "Regular Degular", "Be Average",
                SuperHuman.Affiliation.BAD, "...", ":)");

        SuperHuman[] superHeros = {superMan, superWomen, AverageJoe};
        Human[] humans = {Man, Women, NonBinary};

        for (Human human : humans) {

            System.out.printf("Name: %s\nAge: %d\nGender: %s\nOccupation: %s\nID: %s\n\n",human.getName(),
                    human.getAge(), human.getGender(), human.getOccupation(), human.getid());
        }

        for (SuperHuman human : superHeros) {

            System.out.printf("Alias: %s\nAge: %d\nGender: %s\nAffiliation: %s\nUsing Power: %s\nAbility: %s\nID: %d\n\n",
                    human.getAlias(), human.getAge(), human.getGender(), human.getAffiliations(), human.usePower(),
                    human.getPower(), human.getid());
        }

    }
}
