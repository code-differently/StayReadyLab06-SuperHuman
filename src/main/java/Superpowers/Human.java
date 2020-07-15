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
    // Declaring variables, count keeps track of Human instances
    private static int count = 0;
    private int id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String occupation;

    // Overloading human constructor
    public Human() {
        // Assigns the id the current number of instances
        this.id = count;
        this.name = "NoNameGiven";
        this.dob = LocalDate.now();
        this.gender = "Unknown";
        this.occupation = "Unemployed";
        count++;
    }

    public Human(String name, LocalDate dob, String gender, String occupation) {
        this();
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
    }

    // Getters and setters
    public int getId() {
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

    public static int getCount() {
        return count;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        LocalDate dob = this.getDob();

        return Period.between(dob, now).getYears();
    }

    public String toString() {
        return "ID: " + getId() + "\tName: " + getName() + "\tAge: " + getAge();
    }
}