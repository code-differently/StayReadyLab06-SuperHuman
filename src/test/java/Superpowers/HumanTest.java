package Superpowers;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class HumanTest {

    Human human;

    @Before
    public void setup(){
        this.human = new Human();
    }
    
    @Test
    public void getIdTest() {
        //Given
        int expected = 0;
        //When
        int actual = human.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given
        String expected = "";
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
    public void getAgeTest() {
        //Given
        LocalDate expected = LocalDate.now();
        //When
        LocalDate actual = human.getAge();
        //Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void getGenderTest() {
        //Given
        String expected = "";
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
        String expected = "";
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
