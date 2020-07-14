package Superpowers;

import java.time.LocalDate;

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
    public Human() {
        id = 0;
        name = "";
        dob = LocalDate.now();
        gender = "";
        occupation = "";
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
    
    public LocalDate getAge() {
        return dob;
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

    // @Override
    // public String toString() {
    //     return id + " " + name + " " + dob + " " + gender + " " + occupation;
    // }
}

