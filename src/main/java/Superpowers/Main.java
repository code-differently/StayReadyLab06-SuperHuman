package Superpowers;

import Superpowers.SuperHuman.Affiliation;

public class Main 
{
    public static void main (String args[])
    {
        SuperHuman SHuman1 = new SuperHuman("Atom", Affiliation.LAWFUL_GOOD, "the Atom Suit.");
        SuperHuman SHuman2 = new SuperHuman("Lobo", Affiliation.TRUE_NEUTRAL, "a chain with a hook connected at the end");
        SuperHuman SHuman3 = new SuperHuman("Sinestro", Affiliation.CHAOTIC_EVIL, "the yellow(fear) power ring");

        SHuman1.setGender(" ");
        SHuman2.usePower();
        SHuman3.setAge(0);
        SHuman3.usePower();

        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        human1.setAge(0);
        human2.setGender(" ");
        human3.setOccupation(" ");

        human1.catchPhrase();
    }
    
}