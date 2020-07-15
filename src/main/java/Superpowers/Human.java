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
    private LocalDate dob;
    private String name; 
    private String gender; 
    private String occupation;

    Human()
    {
        this.id = 1;
        this.dob  = LocalDate.of(2000, 1, 1);
        this.name = "human";
        this.gender = "Female";
        this.occupation = "some job";
    }
    Human(int id, LocalDate dob, String name, String gender,String occupation)
    {
        this.id = id;
        this.dob = dob;
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
    }

    public int getID()
    {
        return this.id;
    }

    public int getAge()
    {
        LocalDate Year = LocalDate.now();
        int thisYear = Year.getYear();
        int birthYear = this.dob.getYear();
        return thisYear - birthYear;
    }

    public LocalDate getDob()
    {
        return this.dob;
    }
    public String getName()
    {
        return this.name;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getOccupation()
    {
        return this.occupation;
    }
    public void setName(String n)
    {
        this.name= n;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }
    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }
   
    
   
    
    
}
