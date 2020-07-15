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
    protected String name;
    private int id;
    private LocalDate dob;
    private String gender;
    private String occupation;
    static LocalDate currentDate;


    public Human(String name, int id, String gender, String occupation){
        this.name = name;
        this.id = id;
        this.dob = LocalDate.now();
        this.gender = gender;
        this.occupation = occupation;
    }

    public Human(){
        this.name = "";
        this.id = 0;
        this.dob = LocalDate.now();
        this.gender = "male";
        this.occupation = "";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(int ID){
        this.id = ID;
    }

    public void setDOB(LocalDate date){
        this.dob = date;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public LocalDate getDOB(){
        return dob;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public Period getAge() {
        return Period.between(dob, currentDate);
    }
}
