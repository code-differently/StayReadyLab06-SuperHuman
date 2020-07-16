package Superpowers;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HumanTest {
        @Test
        public void constructorTest(){
            //Given
            Integer id = 47;
            String name = "Giovane";
            Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");

            //When
            String result = name + " " + id;

            //Then
            Assert.assertEquals(result, human.toString());



        }
        @Test
        public void setNameTest(){
            //Given
            String name = "Batman";
            Human human = new Human(47, "Batman", LocalDate.of(2020, 2, 7), "male", "lawyer");

            //When
            human.setName(name);

            //Then
            Assert.assertEquals("Batman", human.getName());
        }
    @Test
    public void setGenderTest(){
        //Given
        String gender = "Male";
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "Male", "lawyer");

        //When
        human.setGender(gender);

        //Then
        Assert.assertEquals(gender, human.getGender());
    }
    @Test
    public void setOccupationTest(){
        //Given
        String occupation = "teacher";
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "teacher");

        //When
        human.setOccupation(occupation);

        //Then
        Assert.assertEquals(occupation, human.getOccupation());
    }

    @Test
    public void setDobTest(){
        //Given
        LocalDate dob = LocalDate.of(2020,2,7);
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "teacher");

        //When
        human.setDob(dob);

        //Then
        Assert.assertEquals(dob, human.getDob());
    }
    @Test
    public void setIdTest(){
        //Given
        Integer id = 47;
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "teacher");

        //When
        human.setId(id);

        //Then
        Assert.assertEquals(id, human.getId());
    }
    @Test
    public void getIdTest(){
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");
        Integer expected = 47;
        Assert.assertEquals(expected, human.getId());
    }
    @Test
    public void getNameTest(){
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");
        String expected = "Giovane";
        Assert.assertEquals(expected, human.getName());
    }
    @Test
    public void getDOBTest(){
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");
        LocalDate expected = LocalDate.of(2020, 2, 7);
        Assert.assertEquals(expected, human.getDob());
    }
    @Test
    public void getGenderTest(){
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");
        String expected = "male";
        Assert.assertEquals(expected, human.getGender());
    }
    @Test
    public void getOccupationTest(){
        Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");
        String expected = "lawyer";
        Assert.assertEquals(expected, human.getOccupation());
    }



        @Test
        public void testCalculateAge_Success() {
            // Given
            LocalDate birthDate = LocalDate.of(1961, 5, 17);
            Human human = new Human(47, "Giovane", LocalDate.of(2020, 2, 7), "male", "lawyer");
            // When
            int actual = human.calculateAge(birthDate, LocalDate.of(2016, 7, 12));
            // assert
            Assert.assertEquals(55, actual);
        }






}
