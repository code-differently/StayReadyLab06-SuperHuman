package Superpowers;
import java.time.LocalDate;

import org.junit.*;


public class HumanTest { 
  Human human = new Human(); 
  Human human2 = new Human();
  LocalDate date = LocalDate.of(1998, 3, 12); 
  LocalDate date2 = LocalDate.of(1978, 12, 1); 

  @Test 

  public void ageTest(){
    human = new Human("billy", 22, date); 
    int expectedAge = 24; 
    human.setAge(24);
    int actualAge = human.getAge();

    Assert.assertEquals(expectedAge, actualAge);  
  }

  @Test 

  public void nameTest(){
    human = new Human("billy", 22, date); 
    String expected = "Bob"; 
    human.setName("Bob");
    String actual = human.getName();

    Assert.assertEquals(expected, actual);  
  }

  @Test 
  public void genderTest(){
    human = new Human("billy", 22, date); 
    String expected = "Male"; 
    human.setGender("Male");
    String actual = human.getGender();

    Assert.assertEquals(expected, actual);  
  }


  @Test 

  public void occupationTest(){
    human = new Human("billy", 22, date); 
    String expected = "Software"; 
    human.setOccupation("Software");
    String actual = human.getOccupation();

    Assert.assertEquals(expected, actual);  
  }

  @Test 

  public void addressTest(){
    human = new Human("billy", 22, date); 
    String expected = "101 code differently road"; 
    human.setAddress("101 code differently road");
    String actual = human.getAddress();

    Assert.assertEquals(expected, actual);  
  }

  @Test 

  public void dobTest(){
    human = new Human("billy", 22, date); 
    LocalDate expected = LocalDate.of(2001, 3, 2); 
    human.setDob(2001, 3, 2);
    LocalDate actual = human.getDob();

    Assert.assertEquals(expected, actual);  
  }


  @Test  
  
  public void idTest(){
    int test1 = human.getId(); 
    int test2 = human2.getId(); 

    Assert.assertFalse(test1 == test2);
  }

}
