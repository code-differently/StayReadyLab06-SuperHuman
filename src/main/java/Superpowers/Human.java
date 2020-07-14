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
    private LocalDate dateOfBirth;
    private int age;
    private String gender;
    private String occupation;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String address;

    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human() {
        this.name = "John";
        this.age = 25;
        this.gender = "Male";
        this.occupation = "Construction";
        this.address = "1150 Mulberry Ave";
        this.dateOfBirth = LocalDate.of(2000,3,15);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        String person = "Name: "+this.getName()+" Age: "+this.getAge()+" Gender: "+this.getGender()+"\n"+
                "Occupation: "+this.getOccupation()+" Address: "+this.getAddress();
        return person;
    }

    public static void main(String[] args) {
      //  Human paul = new Human("paul",32,"male","cook");
       // System.out.println(paul);
    }
}
