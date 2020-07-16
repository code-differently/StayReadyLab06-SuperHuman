package Superpowers;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    public static void main(String[] args){

        ArrayList<Human> humanArray = new ArrayList<>();

        Human pepper = new Human();
        Human peggyCarter = new Human();
        Human janeFoster = new Human();
        Human maryJane = new Human();

        humanArray.add(pepper);
        humanArray.add(peggyCarter);
        humanArray.add(janeFoster);
        humanArray.add(maryJane);


        ArrayList<SuperHuman> superHumanArray = new ArrayList<>();

        SuperHuman ironMan = new SuperHuman();
        SuperHuman captainAmerica = new SuperHuman();
        SuperHuman spiderMan = new SuperHuman();
        SuperHuman thor = new SuperHuman();
        SuperHuman hulk = new SuperHuman();

        superHumanArray.add(ironMan);
        superHumanArray.add(captainAmerica);
        superHumanArray.add(spiderMan);
        superHumanArray.add(thor);
        superHumanArray.add(hulk);
    }
}
