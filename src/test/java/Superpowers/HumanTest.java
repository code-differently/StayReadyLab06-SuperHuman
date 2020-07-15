package Superpowers;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class HumanTest {

    Human human;

    @Before
    public void setup(){
        this.human = new Human(24, "Chi-Khan Foosball", LocalDate.of(2012, 3, 12), "male", "Molecular Biologist");
    }

    @Test
    public void constructorTest() {
        String expected = "id: 24 name: Chi-Khan Foosball age: 8 gender: male occupation: Molecular Biologist";
        String actual = human.toString();
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void getIdTest() {
        //Given
        int expected = 24;
        //When
        int actual = human.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given
        String expected = "Chi-Khan Foosball";
        //When
        String actual = human.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        //Given
        String expected = "Bob";
        //When
        human.setName("Bob");
        String actual = human.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void getAgeNotNullTest() {
        //Given
        int expectedNumYears = 8;
        //When
        int actualNumYears = human.getAge();
        //Then
        Assert.assertEquals(expectedNumYears, actualNumYears);
    }

    @Test
    public void getAgeNullTest() {
        //Given
        human.setAge(null);
        int expectedNumYears = 0;
        //When
        int actualNumYears = human.getAge();
        //Then
        Assert.assertEquals(expectedNumYears, actualNumYears);
    }

    @Test
    public void setAgeTest() {
        LocalDate date = LocalDate.of(1000, 2, 23);
        int expectedAge = 1020;

        human.setAge(date);
        int actualAge = human.getAge();

        Assert.assertEquals(expectedAge, actualAge);
    }
    
    @Test
    public void getGenderTest() {
        //Given
        String expected = "male";
        //When
        String actual = human.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setGenderTest() {
        //Given
        String expected = "Male";
        //When
        human.setGender("Male");
        String actual = human.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getOccupationTest() {
        //Given
        String expected = "Molecular Biologist";
        //When
        String actual = human.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setOccupationTest() {
        //Given
        String expected = "Teacher";
        //When
        human.setOccupation("Teacher");
        String actual = human.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
