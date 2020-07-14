package Superpowers;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanTest {

    String name="Bob";
    LocalDate dob=LocalDate.now();
    String gender="Male";
    String occupation="Worker";
    int id=1;
    Human bob;

    @Before
    public void setUp(){
        bob=new Human(name, gender, occupation, dob, id);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=bob.getName();
        String actualGender=bob.getGender();
        String actualOccupation=bob.getOccupation();
        LocalDate actualDob=bob.getDOB();
        int actualID=bob.getID();

        // Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(gender, actualGender);
        Assert.assertEquals(occupation, actualOccupation);
        Assert.assertEquals(dob, actualDob);
        Assert.assertEquals(id, actualID);


    }

    @Test
    public void getNameTest(){
        // Given

        // When
        String actualName=bob.getName();

        // Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void getGenderTest(){
        // Given

        // When
        String actualGender=bob.getGender();

        // Then
        Assert.assertEquals(gender, actualGender);
    }

    @Test
    public void getDOBTest(){
        // Given

        // When
        LocalDate actualDob=bob.getDOB();

        // Then
        Assert.assertEquals(dob, actualDob);
    }

    @Test
    public void getOccupationTest(){
        // Given

        // When
        String actualOccupation=bob.getOccupation();

        // Then
        Assert.assertEquals(occupation, actualOccupation);


    }

    @Test
    public void setOccupationTest(){
        // Given
        String occupation="Chef";

        // When
        bob.setOccupation(occupation);
        String actualOccupation=bob.getOccupation();

        // Then
        Assert.assertEquals(occupation, actualOccupation);


    }

    @Test
    public void setDOBTest(){
        // Given
        LocalDate now=LocalDate.now();

        // When
        bob.setDOB(now);
        LocalDate actualDob=bob.getDOB();

        // Then
        Assert.assertEquals(dob, actualDob);
    }

    @Test
    public void setGenderTest(){
        // Given
        String gender="Female";

        // When
        bob.setGender(gender);
        String actualGender=bob.getGender();

        // Then
        Assert.assertEquals(gender, actualGender);
    }

    @Test
    public void setNameTest(){
        // Given
        String name="Joe";

        // When
        bob.setName(name);
        String actualName=bob.getName();

        // Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void getAgeTest(){
        // Given
        int expected=0;
        // When
        int actual=bob.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest2(){
        // Given
        LocalDate dob=LocalDate.now();
        LocalDate past=dob.minusYears(11);
        int expected=11;
        // When
        Human test=new Human(name, gender, occupation, past, 2);
        int actual=test.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest(){
        // Given

        // When
        int actualID=bob.getID();

        // Then
        Assert.assertEquals(id, actualID);


    }
}
