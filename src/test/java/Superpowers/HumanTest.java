package Superpowers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test 
    public void humanConstructorTest(){
        //Given 
        String expectedName = "Lisa";
        String expectedGender = "Female";
        String expectedOccupation = "Engineer";
        String date = "11/07/1998";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate expectedDate = LocalDate.parse(date, formatter);


        //When
        Human human = new Human("Lisa", "Female", "Engineer", "11/07/1998");
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
        Human human = new Human("Lisa", "Female", "Engineer", "15/08/2000");
        int expectedId = human.getId();
        //When
        Human human1 = new Human("Coby", "Male", "Doctor", "1/10/2008");
        int actualId = human1.getId();

        //Then
        Assert.assertNotEquals(expectedId, actualId);
    }

    @Test
    public void setNameTest(){
        //Given
        String expected = "Corie";

        //When
        Human human = new Human("Lisa", "Female", "Engineer", "15/08/2000");
        human.setName("Corie");
        String actual = human.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNameTest(){
        //Given
        String expected = "Lisa";
        //When
        Human human = new Human("Lisa", "Female", "Engineer", "15/08/2000");
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
        Human human = new Human("Coby", "Male", "Doctor", "1/10/2008");
        human.setDob("11/07/1998");
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
        Human human = new Human("Coby", "Male", "Doctor", "1/10/2008");
        LocalDate actual = human.getDob();
        //Then
        Assert.assertEquals(expectedDate, actual);
    }

    @Test
    public void setGenderTest(){
        //Given
        String expected = "Male";

        //When
        Human human = new Human("Coby", "Male", "Doctor", "1/10/2008");
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
        Human human = new Human("Coby", "Male", "Doctor", "1/10/2008");
        String actual = human.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupationTest(){
        //Given
        String expected = "Engineer";

        //When
        Human human = new Human("Coby", "Male", "Doctor", "1/10/2008");
        human.setOccupation("Engineer");
        String actual = human.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getOccupationTest(){
        //Given
        String expected = "Doctor";

        //When
        Human human = new Human("Coby", "Male", "Doctor", "1/10/2008");
        String actual = human.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
