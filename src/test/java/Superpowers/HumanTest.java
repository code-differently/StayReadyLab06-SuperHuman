package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;


public class HumanTest {

    Human testHuman;
    int expectedId;
    String expectedName;
    LocalDate expectedBirthday;
    String expectedGender;
    String expectedOccupation;
    String actualName;
    LocalDate actualBirthday;
    String actualGender;
    String actualOccupation;
    int actualId;
    @Before
    public void setUp(){

        expectedName = "John Doe";
        expectedBirthday = LocalDate.now().withYear(2019);
        expectedGender = "fm";
        expectedOccupation = "None";
        testHuman = new Human(expectedName, expectedBirthday, expectedGender, expectedOccupation);
        expectedId = this.testHuman.getId();
    }

    @Test
    public void constructerTest(){

        actualName = testHuman.getName();
        actualBirthday = testHuman.getBirthday();
        actualGender = testHuman.getGender();
        actualOccupation = testHuman.getOccupation();
        actualId = testHuman.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthday, actualBirthday);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedId, actualId);


    }

    @Test
    public void setNameTest() {

        expectedName = "tom";

        testHuman.setName(expectedName);
        actualName = testHuman.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setGenderTest() {

        expectedGender = "fm";

        testHuman.setGender(expectedGender);
        actualName = testHuman.getGender();

        Assert.assertEquals(expectedGender, actualName);

    }

    @Test
    public void setOccupationTest() {

        expectedOccupation = "None";

        testHuman.setOccupation(expectedOccupation);
        actualOccupation = testHuman.getOccupation();

        Assert.assertEquals(expectedOccupation, actualOccupation);

    }

    @Test
    public void getAgeTest() {

        actualId = testHuman.getId();

        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void getIdTest() {

        int expectedAge = 1;

        int actuslAge = testHuman.getAge();

        Assert.assertEquals(expectedAge, actuslAge);

    }



}
