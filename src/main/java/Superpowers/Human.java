package Superpowers;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

import static java.time.Period.between;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private final Integer id;
    private String name;
    private String gender;
    private String occupation;
    private LocalDate dateOfBirth;

    public Human(){
        this.id = 0;
        this.name = "";
        //this.age = 0;
        this.gender = "";
        this.occupation = "";
        this.dateOfBirth = LocalDate.of(0001,01,01);
    }

    public Human(Integer id, String name, String gender, String occupation, LocalDate dateOfBirth){
        this.id = id;
        this.name = name;
        //this.age = age;
        this.gender = gender;
        this. occupation = occupation;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }


    public void setName(String name){
      this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Integer calculateAge(LocalDate dateOfBirth){
        //LocalDate birthday = LocalDate.of(1998,05,26); // specify year, month, day
        LocalDate now = LocalDate.now(); // gets the current date
        Period difference = Period.between(dateOfBirth,now); //difference between the current date and birthday
        Integer age = difference.getYears();
        return age;
    }

    @Override
    public String toString(){
        return name + " "  + gender + " " + occupation + " " + dateOfBirth;
    }

    @Override
    public boolean equals(Object obj){
        return this.toString().equals(obj.toString());
    }
}
