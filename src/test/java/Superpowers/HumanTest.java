package Superpowers;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class HumanTest {

    @Test
    public void constructorTest() {
        // Given
        String expectedName = "Peter Parker";
        int expectedId = 1;
        LocalDate expectedDob = LocalDate.of(1962,8, 15);
        String expectedGender = "Man";
        String expectedOccupation = "Photographer";

        // When
        Human testHuman = new Human(expectedName, expectedId, expectedGender, expectedDob, expectedOccupation);
        String actualName = testHuman.getName();
        int actualId = testHuman.getId();
        LocalDate actualDob = testHuman.getDob();
        String actualGender = testHuman.getGender();
        String actualOccupation = testHuman.getOccupation();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedDob, actualDob);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

    Human testHuman;
    @Before
    public void initialize() {
        testHuman = new Human("Peter Parker", 1, "Man", LocalDate.of(1962, 8, 15), "SuperHero");
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedName = "Peter Parker";

        // When
        String actualName = testHuman.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String expectedName = "Tony Stark";

        // When
        testHuman.setName(expectedName);
        String actualName = testHuman.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getIdTest() {
        // Given
        int expectedId = 1;

        // When
        int actualId = testHuman.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getDobTest() {
        // Given
        LocalDate expectedDob = LocalDate.of(1962, 8, 15);

        // When
        LocalDate actualDob = testHuman.getDob();

        // Then
        Assert.assertEquals(expectedDob, actualDob);
    }

    @Test
    public void setDobTest() {
        // Given
        LocalDate expectedDob = LocalDate.of(1962, 8, 15);

        // When
        testHuman.setDob(expectedDob);
        LocalDate actualDob = testHuman.getDob();

        // Then
        Assert.assertEquals(expectedDob, actualDob);
    }

    @Test
    public void getAgeTest() {
        // Given
        int expectedAge = 57;

        // When
        int actualAge = testHuman.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getGenderTest() {
        // Given
        String expectedGender = "Man";

        // When
        String actualGender = testHuman.getGender();

        // Then
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void setGenderTest() {
        // Given
        String expectedGender = "Man";

        // When
        testHuman.setGender(expectedGender);
        String actualGender = testHuman.getGender();

        // Then
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void getOccupationTest() {
        // Given
        String expectedOccupation = "SuperHero";

        // When
        String actualOccupation = testHuman.getOccupation();

        // Then
        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

    @Test
    public void setOccupationTest() {
        // Given
        String expectedOccupation = "SuperHero";

        // When
        testHuman.setOccupation(expectedOccupation);
        String actualOccupation = testHuman.getOccupation();

        // Then
        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

}
