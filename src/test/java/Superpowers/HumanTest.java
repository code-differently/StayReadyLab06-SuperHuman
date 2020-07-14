package Superpowers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test 
    public void humanConstructorTest(){
        //Given 
        String expectedName = "Bob";
        String expectedGender = "Male";
        String expectedOccupation = "Office work";
        String date = "15/08/2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate expectedDate = LocalDate.parse(date, formatter);


        //When
        Human human = new Human("Bob", "Male", "Office work", "15/08/2016");
        String actualName = human.getName();
        String actualGender = human.getGender();
        String actualOccupation = human.getOccupation();
        LocalDate actualDate = human.getDob();


        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedDate, actualDate);
    }
    @Test 
    public void getIdTest(){
        //Given 
        Human human = new Human("Bob", "Male", "Office work", "15/08/2000");
        int expectedId = human.getId();
        //When
        Human human1 = new Human("Lil", "Female", "Ranger", "1/10/1995");
        int actualId = human1.getId();

        //Then
        Assert.assertNotEquals(expectedId, actualId);
    }
    @Test
    public void setNameTest(){
        //Given
        String expected = "Tim";

        //When
        Human human = new Human("Bob", "Male", "Office work", "15/08/2000");
        human.setName("Tim");
        String actual = human.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNameTest(){
        //Given
        String expected = "Bob";
        //When
        Human human = new Human("Bob", "Male", "Office work", "15/08/2000");
        String actual = human.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setDobTest(){
        //Given
        String date = "15/08/2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate expectedDate = LocalDate.parse(date, formatter);
        //When
        Human human = new Human("Lil", "Female", "Ranger", "1/10/1995");
        human.setDob("15/08/2016");
        LocalDate actual = human.getDob();
        //Then
        Assert.assertEquals(expectedDate, actual);
    }
    @Test
    public void getDobTest(){
        //Given
        String date = "1/10/1995";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate expectedDate = LocalDate.parse(date, formatter);
        //When
        Human human = new Human("Lil", "Female", "Ranger", "1/10/1995");
        LocalDate actual = human.getDob();
        //Then
        Assert.assertEquals(expectedDate, actual);
    }
    @Test
    public void setGenderTest(){
        //Given
        String expected = "Male";

        //When
        Human human = new Human("Lil", "Female", "Ranger", "1/10/1995");
        human.setGender("Male");
        String actual = human.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getGenderTest(){
        //Given
        String expected = "Female";

        //When
        Human human = new Human("Lil", "Female", "Ranger", "1/10/1995");
        String actual = human.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setOccupationTest(){
        //Given
        String expected = "Office work";

        //When
        Human human = new Human("Lil", "Female", "Ranger", "1/10/1995");
        human.setOccupation("Office work");
        String actual = human.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getOccupationTest(){
        //Given
        String expected = "Ranger";

        //When
        Human human = new Human("Lil", "Female", "Ranger", "1/10/1995");
        String actual = human.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }


}
