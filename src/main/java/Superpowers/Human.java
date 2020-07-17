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
    public Human(String name, int id, String gender, String occupation, LocalDate don){
        this.name=name;
        this.id=id;

    }
}
