package Superpowers;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class HumanTest {

    Human aHuman;
    @Before
    public void setUp(){
        this.aHuman = new SuperHuman();
    }

    @Test
    public void HumanConstructorTest(){
        // Given
        Integer expectedID = 10;
        String expectedName = "Francisco";
        String expectedGender = "Male";
        String expectedOccupation = "Software Engineer";
        LocalDate expectedDateOfBirth = LocalDate.of(1998,03,11);

        Human human = new Human(expectedID,expectedName, expectedGender, expectedOccupation, expectedDateOfBirth);

        // When
        String actualString = human.toString();
        String expectedString = expectedName + " " + expectedGender + " " + expectedOccupation + " " + expectedDateOfBirth;

        // Then
        Assert.assertTrue(expectedString.equals(actualString));
    }

    @Test
    public void getNameTest(){
        // Given
        String expected = "Madlyn";

        // When
        aHuman.setName("Madlyn");
        String actual = aHuman.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getGenderTest(){
        // Given
        String expected = "Male";

        // When
        aHuman.setGender("Male");
        String actual = aHuman.getGender();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOccupationTest(){
        // Given
        String expected = "Hero";

        // When
        aHuman.setGender("Hero");
        String actual = aHuman.getGender();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDateOfBirthTest(){
        // Given
        LocalDate expected = LocalDate.of(2020,10,10);

        // When
        aHuman.setDateOfBirth(LocalDate.of(2020,10,10));
        LocalDate actual = aHuman.getDateOfBirth();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void calculateAgeTest(){
        // Given
        Integer expected = 22;

        // When
        Integer actual = aHuman.calculateAge(LocalDate.of(1998,03,11));

        // Then
        Assert.assertEquals(expected,actual);
    }
}
