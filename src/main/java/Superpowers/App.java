package Superpowers;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {
    LocalDate bday =  LocalDate.of(1999, Month.OCTOBER, 29);

    Human john = new Human("john",bday, "male", "student");
    System.out.println(john.getId() + " Age is: " + john.getAge() + " Bday: " + john.getBirthday());

    bday =  LocalDate.of(1988, Month.APRIL, 11);
    Human bro = new Human("bro",bday, "male", "con");
    bro.setName("hammer");
    System.out.println(bro.getId() + " Name is: "+ bro.getName() + " Age is: " + bro.getAge() + " Bday: " + bro.getBirthday());

    bday =  LocalDate.of(1842, Month.AUGUST, 18);
    Superhuman sis = new Superhuman("sis", bday, "woman", "Math tutor", "Diana", "Super strength");
    sis.setAlias("Wonder Woman");
    sis.setAff(Superhuman.affiliation.good);
    sis.setPhrase("...Now Tell the truth");
    sis.setSoundFx("buzzzz");

    System.out.println(sis.getId() + " Name is: "+ sis.getName() + " Codename is: "+ sis.getAlias() + " Age is: " + sis.getAge() + " aff: " + sis.getAff());
    System.out.println(sis.usePower());

    }

}
