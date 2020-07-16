package Superpowers;

import java.lang.System;
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
    private LocalDate birthday;
    private String gender;
    private String ocp;
    public Human() {
        this.id = System.identityHashCode(new Human());
        this.name = "";
        this.birthday = LocalDate.now();
        this.gender = "";
        this.ocp = "";
    }
    public Human(String name, int age, Date birthday, String gender, String occupation){
        this.name = name;
        this.birthday = LocalDate.now();
        this.gender = gender;
        this.ocp = occupation;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = LocalDate.now();
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getOccupation() {
        return ocp;
    }
    public void setOccupation(String occupation) {
        this.ocp = occupation;
    }
}

