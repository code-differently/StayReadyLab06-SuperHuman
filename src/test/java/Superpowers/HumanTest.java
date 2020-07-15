package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void HumanNameTest(){
        //Given
        Human testhuman = new Human();
        testhuman.setName("keith");
        //When
        String expected = "keith";
        String actual = testhuman.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumanIDTest(){
        //Given
        Human testhuman = new Human();
        testhuman.setID(300);
        //When
        int expected = 300;
        int actual = testhuman.getID();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumanGenderTest(){
        //Given
        Human testhuman = new Human();
        testhuman.setGender("male");
        //When
        String expected = "male";
        String actual = testhuman.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumanOccupationTest(){
        //Given
        Human testhuman = new Human();
        testhuman.setOccupation("pizzaguy");
        //When
        String expected = "pizzaguy";
        String actual = testhuman.getOccupation();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
