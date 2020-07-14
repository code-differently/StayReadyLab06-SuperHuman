package Superpowers;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanTest {
    Human human;
    @Before 
    public void initialize() {
        human = new Human(1234, "Bob", LocalDate.now(), "Male", "Software Eng.");
     }
    
    @Test
    public void getIdTest() {
        Assert.assertEquals(1234, human.getId());
    }

    @Test 
    public void getAgeTest() {
        Assert.assertEquals((Integer) 0, human.getAge());

    }

    @Test 
    public void getDobTest() {
        Assert.assertEquals(LocalDate.now(), human.getDob());
    }

    @Test
    public void getGenderTest() {
        Assert.assertEquals("Male", human.getGender());
    }

    @Test
    public void getOccupationTest() {
        Assert.assertEquals("Software Eng.", human.getOccupation());
    }
}

