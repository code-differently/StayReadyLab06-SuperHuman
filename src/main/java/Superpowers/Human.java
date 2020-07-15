package Superpowers;

import java.time.LocalDate;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for:
 * name, age, gender, occupation, and address. Also create methods for
 * retreiving and outputing this data to screen. Then create a SuperHuman class
 * and UNIT TEST that subclasses the first with fields for good or bad, hero
 * name, super ability. As before, create methods for retrieving field data and
 * printing to screen.
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

    public Human(){
        name = "";
        id = 0;
        gender = "";
        dob= null;
        occupation ="";
    }

    public int getId() {
        return id;
    }

    public Integer getAge(){
        return LocalDate.now().getYear() - dob.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate d){
        this.dob = d;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gen){
        gender = gen;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occ){
        occupation = occ;
    }



}