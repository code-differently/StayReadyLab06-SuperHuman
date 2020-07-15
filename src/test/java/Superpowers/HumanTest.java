package Superpowers;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {

@Test
    public void getIdTest()
    {
        //given 
        Human human = new Human();
        //When 
        Integer actual = human.getID();
        Integer expected = 1;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAgeTest()
    {
        //given
        Human human = new Human();
        //When
        Integer expected = 20;
        Integer actual = human.getAge();
        //Then 
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getDobTest()
    {
        //Given 
        Human human = new Human();
        //When
        LocalDate actual = human.getDob();
        LocalDate expected = LocalDate.of(2000, 1,1);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest()
    {
        //given 
        Human human = new Human();
        
        //When 
        String actual = human.getName();
        String expected = "human";
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getGender()
    {
        //given 
        Human human = new Human();
        
        //When 
        String actual = human.getGender();
        String expected = "Female";
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getOccupationTest()
    {
        //given 
        Human human = new Human();
        
        //When 
        String actual = human.getOccupation();
        String expected = "some job";
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test 
    public void setNameTest()
    {
        //Given 
        Human human = new Human();
        human.setName("Shelly");
        //When
        String expected = "Shelly";
        String actual = human.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setGenderTest()
    {
        //Given 
        Human human = new Human();
        human.setGender("Male");
        //When
        String expected = "Male";
        String actual = human.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test 
    public void setOccupation()
    {
        //Given 
        Human human = new Human();
        human.setOccupation("Developer");
        //When 
        String expected = "Developer";
        String actual = human.getOccupation();
        Assert.assertEquals(expected, actual);
    }
    @Test 
    public void setDobTest()
    {
        //Given 
        Human human = new Human();
        LocalDate birDate = LocalDate.of(1997, 5, 5);
        //When
         human.setDob(birDate);
         LocalDate expected = birDate;
         LocalDate actual = human.getDob();
         //Then
         Assert.assertEquals(expected, actual);
    }


}
