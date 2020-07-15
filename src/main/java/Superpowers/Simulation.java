package Superpowers;

import java.time.LocalDate;

public class Simulation {

    public static void main(String[] args) {


        // instantiating Human objects
        Human peter = new Human(1,"Peter Parker", LocalDate.of(2000, 3, 5),
                "male", "photographer");

        Human spdrmn = new SuperHuman(2,"Peter Parker", LocalDate.of(2000, 3, 5),
                "male", "photographer", "Spider-Man", Affiliation.GOOD, "Spidey-Sense",
                "Friendly neighbohood Spidey", "Thwip!");

        //instantiating SuperHuman objects
        SuperHuman btmn = new SuperHuman(3, "Burce Wayne", LocalDate.of(1939, 5,1),
                "male", "philanthropist", "Batman aka The Dark Knight", Affiliation.GOOD, "Batarang",
                "I'M BATMAN!", "HWIT!");

        // Simulating methods of Human instances
        System.out.println(peter.getAge()); // should be 20 years old
        System.out.println(spdrmn.getAge()); // should be 20 years old


        SuperHuman spdrmn2 = (SuperHuman)spdrmn; // Downcasting spdrmm to SuperHuman

        // Simulating methods of SuperHuman instances
        System.out.println(spdrmn2.catchPhrase());
        System.out.println(btmn.usePower());

        // Simulating inherited Human methods of SuperHuman instances
        System.out.println(btmn.getAge()); // should be 81 years old
        System.out.println(spdrmn.getOccupation());


    }
}
