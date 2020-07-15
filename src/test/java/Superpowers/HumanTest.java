package Superpowers;

import java.time.LocalDate;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;



public class HumanTest {

    String name="Joe";
    LocalDate dob=LocalDate.now();
    String gender="Male";
    String occupation="Office Worker";
    int id=1;
    Human joe;

    @Before
    public void setUp(){
        joe=new Human(name, gender, occupation, dob, id);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=joe.getName();
        String actualGender=joe.getGender();
        String actualOccupation=joe.getOccupation();
        LocalDate actualDob=joe.getDOB();
        int actualID=joe.getID();

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
        String actualName=joe.getName();

        // Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void getGenderTest(){
        // Given

        // When
        String actualGender=joe.getGender();

        // Then
        Assert.assertEquals(gender, actualGender);
    }

    @Test
    public void getDOBTest(){
        // Given

        // When
        LocalDate actualDob=joe.getDOB();

        // Then
        Assert.assertEquals(dob, actualDob);
    }

    @Test
    public void getOccupationTest(){
        // Given

        // When
        String actualOccupation=joe.getOccupation();

        // Then
        Assert.assertEquals(occupation, actualOccupation);


    }

    @Test
    public void setOccupationTest(){
        // Given
        String occupation="Chef";

        // When
        joe.setOccupation(occupation);
        String actualOccupation=joe.getOccupation();

        // Then
        Assert.assertEquals(occupation, actualOccupation);


    }

    @Test
    public void setDOBTest(){
        // Given
        LocalDate now=LocalDate.now();

        // When
        joe.setDOB(now);
        LocalDate actualDob=joe.getDOB();

        // Then
        Assert.assertEquals(dob, actualDob);
    }

    @Test
    public void setGenderTest(){
        // Given
        String gender="Female";

        // When
        joe.setGender(gender);
        String actualGender=joe.getGender();

        // Then
        Assert.assertEquals(gender, actualGender);
    }

    @Test
    public void setNameTest(){
        // Given
        String name="Joe";

        // When
        joe.setName(name);
        String actualName=joe.getName();

        // Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void getAgeTest(){
        // Given
        int expected=0;
        // When
        int actual=joe.getAge();

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
        int actualID=joe.getID();

        // Then
        Assert.assertEquals(id, actualID);


    }
}