package Superpowers;

import java.time.LocalDate;
import org.junit.Test;
import org.junit.Assert;

public class HumanTest {

    @Test
    public void constructorTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);
        //When
        String expectedString = expectedId + " " + expectedName + " " + expectedDob + " " + expectedGender + " " + expectedOccupation;
        //Then
        Assert.assertTrue(expectedString.equals(human.toString()));
    }

    @Test
    public void getIdTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);
        //When
        int actualId = human.getId();
        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void getNameTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);
        //When
        String actualName = human.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getLocalDateTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);
        //When
        LocalDate actualDob = human.getDob();
        //Then
        Assert.assertEquals(expectedDob, actualDob);
    }

    @Test
    public void getGenderTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);
        //When
        String actualGender = human.getGender();
        //Then
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void getOccupationTest() {
        //Given
        int expectedId = 12345;
        String expectedName = "Black Panther";
        LocalDate expectedDob = LocalDate.of(2015, 12, 31);
        String expectedGender = "Male";
        String expectedOccupation = "Saving the World!";
        Human human = new Human(expectedId, expectedName, expectedDob, expectedGender, expectedOccupation);
        //When
        String actualOccupation = human.getOccupation();
        //Then
        Assert.assertEquals(expectedOccupation, actualOccupation);
    }

}