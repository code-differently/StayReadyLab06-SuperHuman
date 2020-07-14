package Superpowers;

import java.time.LocalDate;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private static int id = 1;
    private String name;
    private LocalDate dob;
    private String gender;
    private String occupation;

    public Human() {
        this.id = id;
        this.name = "";
        this.dob = LocalDate.now();
        this.gender = "Unknown";
        this.occupation = "Unemployed";
        id++;
    }

    public Human(String name, LocalDate dob, String gender, String occupation) {
        this();
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getAge() {
        return null;
    }
}
