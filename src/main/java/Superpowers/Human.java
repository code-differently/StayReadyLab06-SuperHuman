package Superpowers;

import java.time.LocalDate;
import java.time.*;
//import java.time.temporal.Temporal;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private Integer id;
    private String name;
    private String gender;
    private String occupation;
    private LocalDate dob;


    public Human(Integer id, String name, LocalDate dob, String gender, String occupation){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getId(){
        return id;
    }

    public String toString(){
        return name + " " + id;
    }
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}
