package Superpowers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.Date;


public class HumanTest {
    @Test
    public void constructorTest() {
        //Given
        String expectedName = "Makhya";
        LocalDate expectedDob = LocalDate.of(2002, 04, 05);
        String expectedGender = "Female";
        String expectedOccupation = "Software Developer";
        int expectedAge = 18;

        // When
        Human makhya = new Human(expectedName, expectedDob, expectedGender, expectedOccupation, expectedAge);
        // Then
        Assert.assertEquals(makhya.getName(), expectedName);
        Assert.assertEquals(makhya.getDob(), expectedDob);
        Assert.assertEquals(makhya.getGender(), expectedGender);
        Assert.assertEquals(makhya.getOccupation(), expectedOccupation);
        Assert.assertEquals(makhya.getAge(), expectedAge);
    }
}