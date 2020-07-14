package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class HumanTest {


    Human human;

    @Before
    public void setup(){
        human = new Human(1,"Peter Parker", LocalDate.of(1962,8,15),
                "male", "photographer");
    }

    @Test
    public void constructorTest(){
        // Given : check @Before

        // When
        int expectedId = 1;
        String expectedName = "Peter Parker";
        LocalDate expectedDob = LocalDate.of(1962,8,15);
        String expectedGender = "male";
        String expectedJob = "photographer";

        int actualId = human.getId();
        String actualName = human.getName();
        LocalDate actualDob = human.getDob();
        String actualGender = human.getGender();
        String actualJob = human.getOccupation();

        // Then
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDob,actualDob);
        Assert.assertEquals(expectedGender,actualGender);
        Assert.assertEquals(expectedJob,actualJob);
    }

    @Test
    public void getIdTest(){
        // Given : check @Before

        // When
        int expected = 1;
        int actual = human.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        // Given : check @Before

        // When
        String expected = "Peter Parker";
        String actual = human.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDobTest(){
        // Given : check @Before

        // When
        LocalDate expected = LocalDate.of(1962,8,15);
        LocalDate actual = human.getDob();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGenderTest(){
        // Given : check @Before

        // When
        String expected = "male";
        String actual = human.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getJobTest(){
        // Given : check @Before

        // When
        String expected = "photographer";
        String actual = human.getOccupation();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest(){
        // Given : check @Before

        // When
        int expected = 57;
        int actual = human.getAge();

        // Then
        Assert.assertEquals(expected, actual);

    }

}
