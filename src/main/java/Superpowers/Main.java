package Superpowers;

import java.time.LocalDate;

public class Main {
    public static void main(String Args[]){
        LocalDate date = LocalDate.now();
        Human keithCozart = new Human("Keith", 300, "male", "pizzaGuy");
        Human stampedSteve = new Human("Steve", 300, "male", "richMan");

        SuperHuman chiefKeef = new SuperHuman("sosa","Flight");
        SuperHuman superSteve = new SuperHuman("superSteve","Super Jump");

        System.out.println(keithCozart.getName());
        System.out.println(keithCozart.getID());

        superSteve.setName("steven");
        System.out.println(superSteve.getName());

        System.out.println(chiefKeef.getAbility());
        System.out.println(chiefKeef.getAlias());

        System.out.println(stampedSteve.getGender());
        stampedSteve.setID(457);
    }
}