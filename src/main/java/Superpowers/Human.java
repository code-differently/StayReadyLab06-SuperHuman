package Superpowers;

import java.time.LocalDate;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private String name;
    private int id;
    private String gender;
    private String occupation;
    private LocalDate dob;

    public Human(String name,String gender, String occupation, LocalDate dob,int id){
        this.name=name;
        this.gender=gender;
        this.occupation=occupation;
        this.dob=dob;
        this.id=id;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

    public String getOccupation(){
        return this.occupation;
    }

    public int getAge(){
        LocalDate now=LocalDate.now();
        return now.getYear()-this.dob.getYear();
    }

    public LocalDate getDOB(){
        return this.dob;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public void setDOB(LocalDate date){
        this.dob=date;
    }

    public void setOccupation(String occupation){
        this.occupation=occupation;
    }
}