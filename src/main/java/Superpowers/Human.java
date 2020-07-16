package Superpowers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    
    public Human(String name, String gender, String occupation, String date){
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        
        //Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        this.dob = LocalDate.parse(date, formatter);
        //Date
        //this.id = uniqueId.getAndIncrement();
    }
    
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDob(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        this.dob = LocalDate.parse(date, formatter);
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getOccupation(){
        return this.occupation;
    }
}
}
