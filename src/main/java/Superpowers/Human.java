package Superpowers;

import java.time.LocalDate;
import java.time.Period;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human 
{
    private static int humanCount = 1;
    private int id = 0;
    private String name = "" ;
    private LocalDate dob = LocalDate.now(); //Can't create a constructor for LocalDate
    private String gender = "";
    private String occupation = "";

    public Human()
    {
        this.id = humanCount++;
    }

    public Human(String name,LocalDate dob,String gender, String occupation)
    {
        this.id = humanCount++;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.occupation = occupation;
    }

    public int getID()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setDOB(LocalDate dob)
    {
        this.dob = dob;
    }

    public LocalDate getDOB()
    {
        return dob;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public int getAge()
    {
        LocalDate today = LocalDate.now();
        Period diff = Period.between(dob, today);
        return diff.getYears();
    }
    @Override
    public String toString()
    {
        String output = "ID: "+this.getID()+"\n";
        output += "My name is "+this.getName()+"\n";
        output += "I am "+this.getGender()+" My Age is "+this.getAge()+"\n";
        output += "My birthday is "+this.dob.toString()+"\n";
        output += "My job is "+this.getOccupation()+"\n";


        return output;

    }
}
