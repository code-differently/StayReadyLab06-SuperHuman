package Superpowers;


//import jdk.vm.ci.meta.Local;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import  java.time.LocalDate;

import java.time.LocalDate;

public class HumanTest {
    @Before
    @Test
    public void HumanTest(){

        Human JW = new Human();

        int expectedID = 0001;
        String expectedName = "Jeff Wright";
        LocalDate expectedDOB = LocalDate.of(1985,3,28);
        String expectedGender = "Male";
        String expectedOccupation = "Artist";


        JW.setName("Jeff Wright");
        JW.setDob(LocalDate.of(1985,3,28));
        JW.setGender("Male");
        JW.setOccupation("Artist");

        Assert.assertEquals(expectedID, JW.getId());
        Assert.assertEquals(expectedName, JW.getName());
        Assert.assertEquals(expectedDOB, JW.getDob());
        Assert.assertEquals(expectedGender, JW.getGender());
        Assert.assertEquals(expectedOccupation, JW.getOccupation());
    }
}
