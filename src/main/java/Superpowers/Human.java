package Superpowers;

import java.time.LocalDate;
import java.time.Period;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private int id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String occupation;

    public Human(int id, String name, LocalDate dob, String gender, String occupation) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(dob == null) {
            //you were not born at all
            return 0;
        }
        //you usually just say, I'm 12 or I'm 34 so that's why I am just getting the years
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void setAge(LocalDate age) {
        this.dob = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }    

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }  

     @Override
     public String toString() {
         return "id: " + id + " name: " + name + " age: " + getAge() + " gender: " + gender + " occupation: " + occupation;
     }
}

