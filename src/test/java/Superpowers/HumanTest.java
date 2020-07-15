package Superpowers;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HumanTest {
    Human humanObj;

    @Test
    public void constructorDefaultTest() {
        int expectedId= Human.getCount();
        String expectedName = "NoNameGiven";
        LocalDate expectedDate = LocalDate.now();
        String expectedGender = "Unknown";
        String expectedOccupation = "Unemployed";
        humanObj = new Human();


        Assert.assertEquals(expectedId, humanObj.getId());
        Assert.assertEquals(expectedName, humanObj.getName());
        Assert.assertEquals(expectedDate, humanObj.getDob());
        Assert.assertEquals(expectedGender, humanObj.getGender());
        Assert.assertEquals(expectedOccupation, humanObj.getOccupation());


    }

    @Test
    public void constructorArgsTest() {
        int expectedId= Human.getCount();
        String expectedName = "Giannis";
        LocalDate expectedDate = LocalDate.now();
        String expectedGender = "Male";
        String expectedOccupation = "Hooper";
        humanObj = new Human(expectedName, expectedDate, expectedGender, expectedOccupation);

        Assert.assertEquals(expectedId, humanObj.getId());
        Assert.assertEquals(expectedName, humanObj.getName());
        Assert.assertEquals(expectedDate, humanObj.getDob());
        Assert.assertEquals(expectedGender, humanObj.getGender());
        Assert.assertEquals(expectedOccupation, humanObj.getOccupation());


    }

    @Test
    public void getIdTest() {
        humanObj = new Human();

        int expectedId= Human.getCount();
        Human humanObj2 = new Human();
        int actualId = humanObj2.getId();


        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getNameTest() {
        humanObj = new Human();

        String expected = "NoNameGiven";
        String actual = humanObj.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        humanObj = new Human();

        String expected = "Kobe";
        humanObj.setName(expected);
        String actual = humanObj.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDobTest() {
        humanObj = new Human();

        LocalDate expected = LocalDate.now();
        LocalDate actual = humanObj.getDob();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DobTest() {
        humanObj = new Human();

        LocalDate expected = LocalDate.of(1995, 10, 1);
        humanObj.setDob(expected);
        LocalDate actual = humanObj.getDob();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDobTest() {
        humanObj = new Human();

        LocalDate expected = LocalDate.of(1995, 10, 1);
        humanObj.setDob(expected);
        LocalDate actual = humanObj.getDob();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getGenderTest() {
        humanObj = new Human();

        String expected = "Unknown";
        String actual = humanObj.getGender();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGenderTest() {
        humanObj = new Human();

        String expected = "Man";
        humanObj.setGender(expected);
        String actual = humanObj.getGender();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOccupationTest() {
        humanObj = new Human();

        String expected = "Unemployed";
        String actual = humanObj.getOccupation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupationTest() {
        humanObj = new Human();

        String expected = "Programmer";
        humanObj.setOccupation(expected);
        String actual = humanObj.getOccupation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCount() {
        int instancesOfHuman = Human.getCount();
        int createMore = 5;
        for (int i = 0; i < createMore; i++) {
            new Human();
        }

        int expectedInstancesOfHuman = instancesOfHuman + createMore;
        int actual = Human.getCount();

        Assert.assertEquals(expectedInstancesOfHuman, actual);
    }

    @Test
    public void getAge() {
        humanObj = new Human();

        LocalDate dob = LocalDate.of(1995, 1, 1);
        humanObj.setDob(dob);
        int expected = 25;
        int actual = humanObj.getAge();

        Assert.assertEquals(expected, actual);
    }




}
