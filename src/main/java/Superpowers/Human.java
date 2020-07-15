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

    public Human(){

    }
    public Human(String name,int id,String gender,String occupation, LocalDate dob){
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.dob=dob;
        this.occupation=occupation;
    }
    public Human(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getID(){
        return id;
    }
    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public LocalDate getDOB(){
        return dob;
    }

    public void setDOB(LocalDate date){
        this.dob = date;
    }
    
    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    public String toString() {
        String output="";
            output+= name +" ID: "+ id +" Gender: "+ gender +" Job: "+ occupation + " DOB: "+dob;
        return output;
    }
}
