package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    @Test
    public void constructorTest() {
        // Given
        String expectedName = "Peter Parker";
        int expectedId = 1;
        LocalDate expectedDob = LocalDate.of(1962,8, 15);
        String expectedGender = "Man";
        String expectedOccupation = "Photographer";
        String expectedAlias = "Spider-Man";
        Affiliation expectedAff = Affiliation.GOOD;
        String expectedAbility = "shoots webs";
        String expectedCp = "It's your Friendly Neighborhood Spider-Man!";
        String expectedSe = "THWIP!";

        // When
        SuperHuman testSupHuman = new SuperHuman(expectedName, expectedId, expectedGender, expectedDob, expectedOccupation, expectedAlias, expectedAff, expectedAbility, expectedCp, expectedSe);
        String actualName = testSupHuman.getName();
        int actualId = testSupHuman.getId();
        LocalDate actualDob = testSupHuman.getDob();
        String actualGender = testSupHuman.getGender();
        String actualOccupation = testSupHuman.getOccupation();
        String actualAlias = testSupHuman.getAlias();
        Affiliation actualAff = testSupHuman.getAff();
        String actualAbility = testSupHuman.getAbility();
        String actualCp = testSupHuman.catchPhrase();
        String actualSe = testSupHuman.getSoundEffect();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedDob, actualDob);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedAlias, actualAlias);
        Assert.assertEquals(expectedAff, actualAff);
        Assert.assertEquals(expectedAbility, actualAbility);
        Assert.assertEquals(expectedCp, actualCp);
        Assert.assertEquals(expectedSe, actualSe);
    }

    SuperHuman testSupHuman;
    @Before
    public void initialize() {
        testSupHuman = new SuperHuman("Peter Parker", 1, "Man", LocalDate.of(1962, 8, 15), "SuperHero", "Spider-Man", Affiliation.GOOD, "shoots webs", "It's your Friendly Neighborhood Spider-Man!", "THWIP!");
    }

    @Test
    public void catchPhraseTest() {
        // Given
        String expected = "It's your Friendly Neighborhood Spider-Man!";

        // When
        String actual = testSupHuman.catchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void usePowerTest() {
        // Given
        String expected = "It's your Friendly Neighborhood Spider-Man! THWIP!";

        // When
        String actual = testSupHuman.usePower();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAliasTest() {
        // Given
        String expected = "Spider-Man";

        // When
        String actual = testSupHuman.getAlias();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAffTest() {
        // Given
        Affiliation expected = Affiliation.GOOD;

        // When
        Affiliation actual = testSupHuman.getAff();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAbilityTest() {
        // Given
        String expected = "shoots webs";

        // When
        String actual = testSupHuman.getAbility();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSoundEffectTest() {
        // Given
        String expected = "THWIP!";

        // When
        String actual = testSupHuman.getSoundEffect();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
