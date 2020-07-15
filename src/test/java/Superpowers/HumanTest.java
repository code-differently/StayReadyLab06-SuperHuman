package Superpowers;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class HumanTest {

    @Test
    public void constructorTest() {
        // Given
        String expectedName = "Cupcake";
        int expectedId = 215;
        LocalDate expectedDateOfBirth = LocalDate.of(2000,3, 13);
        String expectedGender = "Women";
        String expectedOccupation = "Cook";

        // When
        Human testHuman = new Human(expectedName, expectedId, expectedDateOfBirth, expectedGender, expectedOccupation);
        String actualName = testHuman.getName();
        int actualId = testHuman.getAge();
        LocalDate actualDob = testHuman.getDateOfBirth();
        String actualGender = testHuman.getGender();
        String actualOccupation = testHuman.getOccupation();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedDateOfBirth, actualDob);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

    Human testHuman;
    @Before
    public void initialize() {
        testHuman = new Human("Cupcake", 215, LocalDate.of(2000, 3, 13), "Women", "Cook");
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedName = "Cupcake";

        // When
        String actualName = testHuman.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String expectedName = "Red Velvet";

        // When
        testHuman.setName(expectedName);
        String actualName = testHuman.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getIdTest() {
        // Given
        int expectedId = 215;

        // When
        int actualId = testHuman.getid();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getDobTest() {
        // Given
        LocalDate expectedDob = LocalDate.of(2000, 3, 13);

        // When
        LocalDate actualDob = testHuman.getDateOfBirth();

        // Then
        Assert.assertEquals(expectedDob, actualDob);
    }

    @Test
    public void setDobTest() {
        // Given
        LocalDate expectedDob = LocalDate.of(2000, 3, 13);

        // When
        testHuman.setDateOfBirth(expectedDob);
        LocalDate actualDob = testHuman.getDateOfBirth();

        // Then
        Assert.assertEquals(expectedDob, actualDob);
    }

    @Test
    public void getAgeTest() {
        // Given
        int expectedAge = 20;

        // When
        int actualAge = testHuman.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getGenderTest() {
        // Given
        String expectedGender = "Women";

        // When
        String actualGender = testHuman.getGender();

        // Then
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void setGenderTest() {
        // Given
        String expectedGender = "Women";

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