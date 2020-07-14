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
    public void getLocalDateTest() {
        //Given
        LocalDate expected = LocalDate.now();
        //When
        LocalDate actual = human.getLocalDate();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLocalDateTest() {
        //Given
        LocalDate newDate = LocalDate.of(2015, 3, 4);
        LocalDate expected = newDate;
        //When
        human.setLocalDate(newDate);
        LocalDate actual = human.getLocalDate();

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
