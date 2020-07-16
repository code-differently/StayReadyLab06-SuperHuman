package Superpowers;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.Name;
import java.time.LocalDate;


public class HumanTest {

    Integer id = 25;
    String name = "Naomi";
    LocalDate dob = LocalDate.of(1997, 01, 11); //date of birth
    String gender = "Female";
    String occupation = "CEO";

    Human human;

    @Before
    public void setUp() {
        human = new Human(id, name, dob, gender, occupation);

    }

    @Test
    public void getIdTest() {
        //Given
        Integer expected = 25;
        //When

        //Then
        Integer actual = human.getId(expected);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNameTest() {
        //Given
        String expected = "Naomi";
        //When

        //Then
        String actual = human.getName();
        Assert.assertEquals(expected, actual);
    }
     @Test
    public void getDobTest() {
        //Given
        LocalDate expected = dob;
        //When

        //Then
        LocalDate actual = human.getDob();
        Assert.assertEquals(expected, actual);
    }
        @Test
        public void getGenderTest(){
            //Given
            String expected = "Female";
            //When

            //Then
            String actual = human.getGender();
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void getOccupationTest(){
            //Given
            String expected = "CEO";
            //When

            //Then
            String actual = human.getOccupation();
            Assert.assertEquals(expected, actual);

        }
}

