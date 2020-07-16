package Superpowers;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;


public class HumanTest {
    @Test
    public void constructorTest(){
        Human human = new Human("Sally", 1, LocalDate.now(), "Male", "Photographer");

        String expectedName = "Peter Parker";
        int expectedId = 1;
        LocalDate expectedDateOfBirth = LocalDate.now();
        String expectedGender = "Male";
        String expectedOccupation = "Photographer";

        String actualName = human.getName();
        int actualId = human.getId();
        LocalDate actualDateOfBirth = human.getDateOfBirth();
        String actualGender = human.getGender();
        String actualOccupation = human.getOccupation();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedDateOfBirth, actualDateOfBirth);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

    @Test
    public void getIdTest(){
        Human human = new Human(null, 2, null, null, null);

        int expectedId = 2;

        int actualId = human.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setNameTest(){
        Human human = new Human(2);

        String expectedName = "Val";
        human.setName(expectedName);

        String actualName = human.getName();

        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void getNameTest(){
        Human human = new Human("Eve", 4, null, null, null);

        String expectedName = "Eve";

        String actualName = human.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setDatOfBirthTest(){
        Human human = new Human(null, 5, LocalDate.now(), null, null);

        LocalDate expectedDateOfBirth = LocalDate.now();
        human.setDateOfBirth(expectedDateOfBirth);

        LocalDate actualDateOString = human.getDateOfBirth();

        Assert.assertEquals(expectedDateOfBirth, actualDateOString);
    }

    @Test
    public void getDateOfBirthTest(){
        Human human = new Human(null, 6, LocalDate.now(), null, null);

        LocalDate expectedDateOfBirth = LocalDate.now();

        LocalDate actualDateOfBirth = human.getDateOfBirth();

        Assert.assertEquals(expectedDateOfBirth, actualDateOfBirth);
    }

    @Test
    public void setGenderTest(){
        Human human = new Human(null, 7, null, null, null);

        String expectedGender = "Female";
        human.setGender(expectedGender);

        String actualGender = human.getGender();

        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void getGenderTest(){
        Human human = new Human("Angel", 8, null, "Switching to female", null);

        String expectedGender = "Switching to female";

        String actualgender = human.getGender();

        Assert.assertEquals(expectedGender, actualgender);
    }

    @Test
    public void setOccupationTest(){
        Human human = new Human(null, 9, null, null, null);

        String expectedOccupation = "Bank Teller";
        human.setOccupation(expectedOccupation);

        String actualOccupation = human.getOccupation();

        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

    @Test
    public void getOccupationTest(){
        Human human = new Human(null, 10, null, null, "CEO");

        String expectedOccupation = "CEO";

        String actualOccupation = human.getOccupation();

        Assert.assertEquals(expectedOccupation, actualOccupation);
    }
}
