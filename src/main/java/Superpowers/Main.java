package Superpowers;

import java.time.LocalDate;

public class Main {

    public static void main(String [] args){

        Human Robyn = new Human();
        Robyn.setName("Robyn");
        Robyn.setGender(("Female"));
        Robyn.setOccupation("Entrepreneur");
        Robyn.setDob(LocalDate.of(1988,02,20));

        SuperHuman Gon = new SuperHuman("Gon", "Nose Senses", Affiliation.GOOD, "All right", "yahh", "Gon", LocalDate.of(2008,01,01),"Male","Hunter");

        Human KC = new Human();
        KC.setName("Keith");
        KC.setGender("Male");
        KC.setOccupation("Artist");
        KC.setDob(LocalDate.of(1995,8,15));

    }
}
