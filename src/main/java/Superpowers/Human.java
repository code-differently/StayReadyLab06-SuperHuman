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

    private int id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String occupation;

    public Human(int id, String name, LocalDate dob, String gender, String occupation){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob(){
        return dob;
    }

    public String getGender(){
        return  gender;
    }

    public String getOccupation(){
        return  occupation;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period diff = Period.between(dob,now);
        return diff.getYears();
    }
}
