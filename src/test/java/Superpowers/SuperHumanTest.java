package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    SuperHuman aSuperHuman;
    @Before
    public void setup(){
        this.aSuperHuman = new SuperHuman();
    }

    @Test
    public void superHumanTest(){
        // Given
        Integer expectedID = 10;
        String expectedName = "Francisco";
        String expectedGender = "Male";
        String expectedOccupation = "Software Engineer";
        LocalDate expectedDateOfBirth = LocalDate.of(1998,03,11);
        String expectedAlias = "Superman";
        String expectedAbility = "Super Strength";
        String expectedPhrase = "You will never win!";
        String expectedSoundEffect = "ahhhhh!";

        SuperHuman superHuman = new SuperHuman(expectedID,expectedName, expectedGender, expectedOccupation, expectedDateOfBirth, expectedAlias, expectedAbility, expectedPhrase, expectedSoundEffect);

        // When
        String actualString = superHuman.toString();
        String expectedString = expectedName + " " + expectedGender + " " + expectedOccupation + " " + expectedDateOfBirth + " " + expectedAlias + " " + expectedAbility + " " + expectedPhrase + " " + expectedSoundEffect;

        // Then
        Assert.assertTrue(expectedString.equals(actualString));

    }

    @Test
    public void getAliasTest(){
        // Given
        String expected = "Spiderman";

        // When
        aSuperHuman.setAlias("Spiderman");
        String actual = aSuperHuman.getAlias();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAbilityTest(){
        // Given
        String expected = "Spiderman";

        // When
        aSuperHuman.setAlias("Spiderman");
        String actual = aSuperHuman.getAlias();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void AffiliationTest(){
       SuperHuman.Affiliation aSuperHuman = SuperHuman.Affiliation.GOOD;
       Assert.assertEquals(SuperHuman.Affiliation.valueOf("GOOD"), aSuperHuman);
    }

    @Test
    public void catchPhraseTest(){
        // Given
        String expected = "My Spider-Sense is tingling";

        // When
       // aSuperHuman.setPhrase("My Spider-Sense is tingling");
        String actual = aSuperHuman.catchPrase("My Spider-Sense is tingling");

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void usePowerTest(){
        // Given
        String expected = "To infinity and beyond, whizzzz!";

        // When
        String actual = aSuperHuman.usePower("To infinity and beyond");

        // Then
        Assert.assertEquals(expected,actual);
    }
}
