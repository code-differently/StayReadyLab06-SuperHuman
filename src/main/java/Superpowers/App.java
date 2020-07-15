package Superpowers;

import java.time.LocalDate;

public class App {
    public static void main(String [] args)
    {
        int id = 44; LocalDate birthDate = LocalDate.of(1996, 4,20);
        String name = "Miranda"; String gender = "Female"; String occupation = "Secretary";
        Human human = new Human(id, birthDate,name, gender, occupation);
        String abi1 = "reflection/light power"; String pow1 = "Ching";
        Superhuman oSuperhuman = new Superhuman(pow1, abi1, id, birthDate, name, gender, occupation);
        
        String ali = "Super girl"; String abi = "Super human Strength";
        Afilliation afill = Afilliation.Good; String cp = "I pity the fool"; String pow = "Boom!";
        Superhuman superhuman = new Superhuman(ali, abi, afill, cp, pow);
        


        System.out.println(human.getID());
        System.out.println(human.getDob());
        System.out.println(human.getName());
        System.out.println(human.getGender());
        System.out.println(human.getOccupation());

        System.out.println();

        System.out.println(superhuman.getalias());
        System.out.println(superhuman.getability());
        System.out.println(superhuman.getafiliation());
        System.out.println(superhuman.catchPhrase());
        System.out.println(superhuman.usePower());
        System.out.println();

        System.out.println(oSuperhuman.getName());
        System.out.println(oSuperhuman.getID());
        System.out.println(oSuperhuman.getDob());
        System.out.println(oSuperhuman.getGender());
        System.out.println(oSuperhuman.getOccupation());
        System.out.println(oSuperhuman.getPowers());
        System.out.println(oSuperhuman.getability());

    }
    
}