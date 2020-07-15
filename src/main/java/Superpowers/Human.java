package Superpowers;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
  static AtomicInteger nextId = new AtomicInteger();
  int id;  
  private String name; 
  private String occupation;
  private String address;
  private int age; 
  private String gender; 
  private LocalDate dob; 

  //constructor 
  public Human(){
    id = nextId.incrementAndGet();
    this.name = "Default"; 
    this.age = 0; 
    this.occupation = null; 
    this.address = "Unknown"; 
    this.gender = "Questioning"; 
    this.dob = null;

  }

  //constructor to set name and age and dob
  public Human(String name, int age, LocalDate birthDay){
    id = nextId.incrementAndGet(); 
    this.name = name; 
    this.age = age; 
    this.occupation = null; 
    this.address = "Unknown"; 
    this.gender = "Questioning"; 
    this.dob =  birthDay;
  }

  public void setName(String name){
    this.name = name; 
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age; 
  }

  public int getAge(){
    return this.age;
  }

  public void setOccupation(String occ){
    this.occupation = occ; 
  }

  public String getOccupation(){
    return this.occupation;
  }

  public void setAddress(String address){
    this.address = address; 
  }

  public String getAddress(){
    return this.address;
  }

  public void setGender(String gender){
    this.gender = gender;
  }

  public String getGender(){
    return this.gender; 
  }

  public void setDob(int year, int month, int day){
    this.dob = LocalDate.of(year, month, day);
  }

  public LocalDate getDob(){
    return this.dob;
  }

  public int getId(){
    return id; 
  }

  

}
