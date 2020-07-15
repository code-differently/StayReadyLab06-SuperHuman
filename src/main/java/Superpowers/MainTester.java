package Superpowers;

import java.time.LocalDate;

public class MainTester
{
    public static void main(String[] args)
    {
        SuperHuman s = new SuperHuman("Mr.MuffinMan", Affiliation.GOOD, "Flying Muffins", "Whippy Dippy I got some muffins inna jiffy!");
        SuperHuman s2 = new SuperHuman("The Gingerbread Man", Affiliation.BAD, "Super speed", "You can't catch me, I'm the gingerbread man ");

        System.out.println(s.catchPhrase());
        System.out.println(s.usePower());

        Human h = new Human("Aaron Allen", LocalDate.ofYearDay(2001, 10), "male", "Java's full time husband");
        Human h2 = new Human("Lucious Morrison", LocalDate.of(1870, 5 ,15), "male", "Gunslinger");
        System.out.println(h.getOccupation());
        System.out.println(h.getName());
        System.out.println(h2);
        System.out.println(s2.usePower());

    }
}