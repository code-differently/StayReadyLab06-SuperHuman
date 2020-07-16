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
    private LocalDate dateOfBirth;
    private String gender;
    private String occupation;

    public Human(String name, int id, LocalDate dateOfBirth, String gender, String occupation){
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.occupation = occupation;
    }

    public Human (int id){
        this.id = id;
    }

    public Human(){

    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getOccupation(){
        return occupation;
    }
     @Override
    public String toString(){
        return name +" "+ id + " " +dateOfBirth+ " "+ gender+ " "+ occupation;
    }
}
