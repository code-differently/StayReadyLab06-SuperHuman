package Superpowers;

import java.time.LocalDate;

public class City {
    public static void main(String[] args){
        LocalDate now=LocalDate.now();
        LocalDate past=now.minusYears(11);
        Human bob=new Human("Bob", "Male", "Janitor", now, 1);
        Human jill=new Human("Jill", "Female", "Worker", past, 2);
        Human rob=new Human("Rob", "Male", "Worker", now, 3);
        SuperHuman waterMan=new SuperHuman("Tim", "Male", "Programmer", past, 4,
             "WaterMan", "Water bending", Affiliation.GOOD, "Go go water!", "Water is my first name!");
        SuperHuman fireWoman=new SuperHuman("Jane", "Female", "CEO", now, 5,
             "FireWoman", "Fire bending", Affiliation.BAD, "Go go fire!", "Fire is everything!");
        SuperHuman brain=new SuperHuman("Unknown", "Unknown", "Unknown", past, 6,
             "Brain", "Read minds and knows everything", Affiliation.NEUTRAL, "Go Study now!", "Knowledge is everything!");

        SuperHuman[] superHeros={waterMan,fireWoman,brain};
        Human[] humans={bob,jill,rob};

        for (Human human : humans) {
            System.out.printf("Name: %s\nAge: %d\nGender: %s\nOccupation: %s\nID: %s\n\n",human.getName(),
                human.getAge(),human.getGender(),human.getOccupation(),human.getID());
        }
        for (SuperHuman human : superHeros) {
            System.out.printf("Alias: %s\nAge: %d\nGender: %s\nAffiliation: %s\nUsing Power: %s\nAbility: %s\nID: %d\n\n",
                human.getAlias(),human.getAge(),human.getGender(),human.getAffiliation(),human.usePower(),human.getAbility(),human.getID());
        }
    }
        

    
}