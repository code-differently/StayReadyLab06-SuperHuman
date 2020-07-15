package Superpowers;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);

        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman (expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);

        System.out.println(human.getId());
        System.out.println(superhuman.getId());
        System.out.println(human.getOccupation());
        System.out.println(superhuman.getPower());
    }

}
