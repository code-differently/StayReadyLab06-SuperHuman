package Superpowers;

import java.time.LocalDate;

public class HeroMain 
{
    public static void main(String [] args)
    {
        SuperHuman AllMight = new SuperHuman("All Might", Affiliation.Good, "All for One", "I'm at my limit, this is my all", "UNITED STATES OF SMAAAASSHHHH");
        AllMight.setName("Toshinori");
        AllMight.setGender("Male");
        AllMight.setOccupation("Symbol Of Peace");
        AllMight.setDOB(LocalDate.of(1970, 07, 12));

        Human Kristina = new Human();
        Kristina.setName("Kristina");
        Kristina.setGender("Female");
        Kristina.setOccupation("Social Media Intern");
        Kristina.setDOB(LocalDate.of(1999, 07, 10));

        SuperHuman AllForOne = new SuperHuman("All For One", Affiliation.Evil, "All For One", "Peace is a false hope", "BRAAAKKKK!!!");
        AllForOne.setName(AllForOne.getAlias());
        AllForOne.setGender("Male");
        AllForOne.setOccupation("Evil Incarnate");
        AllForOne.setDOB(LocalDate.of(1900, 03, 21));

        System.out.println(AllMight);
        System.out.println(Kristina);
        System.out.println(AllForOne);


    }
}