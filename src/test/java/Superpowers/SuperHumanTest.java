package Superpowers;

import java.time.LocalDate;
import org.junit.Test;
import org.junit.Assert;

public class SuperHumanTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman (expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);
        //When
        String expectedString = expectedAlias +" "+ expectedAbility +" "+ expectedAffiliation +" "+ expectedPhrase +" "+ expectedPower;
        //Then
        Assert.assertTrue(expectedString.equals(superhuman.toString()));
    }

    @Test
    public void getAliasTest(){
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman (expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);
        //When
        String actualAlias = superhuman.getAlias();
        //Then
        Assert.assertEquals(expectedAlias, actualAlias);
    }

    @Test
    public void getAbilityTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);
        //When
        String actualAbility = superhuman.getAbility();
        //Then
        Assert.assertEquals(expectedAbility, actualAbility);
    }

    @Test
    public void getAffiliationTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);
        //When
        Affiliation actualAffiliation = superhuman.getAffiliation();
        //Then
        Assert.assertEquals(expectedAffiliation, actualAffiliation);
    }

    @Test
    public void getPhraseTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);
        //When
        String actualPhrase = superhuman.getPhrase();
        //Then
        Assert.assertEquals(expectedPhrase, actualPhrase);
    }

    @Test
    public void getPowerTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        String expectedAlias = "T'Challa";
        String expectedAbility = "Strength";
        Affiliation expectedAffiliation = Affiliation.Good;
        String expectedPhrase = "Wakanda Forever!";
        String expectedPower = "Knowledge";
        SuperHuman superhuman = new SuperHuman(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation, expectedAlias, expectedAbility, expectedAffiliation, expectedPhrase, expectedPower);
        //When
        String actualPower = superhuman.getPower();
        //Then
        Assert.assertEquals(expectedPower, actualPower);
    }

}
