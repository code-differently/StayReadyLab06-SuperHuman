package Superpowers;


import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanTest 
{
    /*Test to test getters and setters*/
    @Test
    public void constructorTest()
    {
        Human john = new Human();
        
        int expectedID = 1;
        String expectedName = "John";
        LocalDate expectedDate = LocalDate.of(1997, 05, 17);
        String expectedGender = "Male";
        String expectedOccu = "Marketing";

        john.setName("John");
        john.setDOB(LocalDate.of(1997,05,17));
        john.setGender("Male");
        john.setOccupation("Marketing");

        Assert.assertEquals(expectedID,john.getID());
        Assert.assertEquals(expectedName,john.getName());
        Assert.assertEquals(expectedDate,john.getDOB());
        Assert.assertEquals(expectedGender,john.getGender());
        Assert.assertEquals(expectedOccu,john.getOccupation());

        
    }

    Human human = new Human();
    @Before
    public void intialize()
    {
        human.setName("Kristina");
        human.setGender("Female");
        human.setDOB(LocalDate.of(1999, 07, 10));
        human.setOccupation("Communication");
    }

    @Test
    public void getAgeTest()
    {
        int expectedAge = 21;
        int actualAge = human.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }
}
