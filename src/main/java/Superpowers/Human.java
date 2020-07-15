package Superpowers;

import java.time.LocalDate;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human 
{
    private String name;
    private int age;
    private LocalDate DOB;
    private String gender;
    private String occupation;
    private final int id;

    public Human(String name,int id,String gender,String occupation, LocalDate DOB)
    {
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.DOB=DOB;
        this.occupation=occupation;
    }

    public Human()
    {
        this.id = 1234;
    }

    public void catchPhrase()
    {
        System.out.println("Human");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public LocalDate getDOB()
    {
        return DOB;
    }

    public void setDOB(LocalDate date)
    {
        this.DOB = date;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }

    public int getId()
    {
        return id;
    }
}
