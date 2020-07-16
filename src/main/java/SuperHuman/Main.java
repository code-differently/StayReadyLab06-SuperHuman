package SuperHuman;

import java.time.LocalDate;

//import org.junit.Assert;
// import org.junit.Test;

import Superpowers.Human;

public class Main {

 public void main(String args[]) {

       int id = 001;
       String name = "Peter Parker";
       LocalDate dateOfBirth = LocalDate.now(); // today's date
       String gender = "Male";
       String occupation = "Photographer";
       Human h = new Human(name, id, dateOfBirth, gender, occupation);

       String alias = "Spiderman";
       Affiliation.affiliation aff = Affiliation.affiliation.GOOD;
       String ability = "Web Powers";
       String power = "Pew, pew!";
       String phrase = "Just your Friendly Neighborhood Spiderman";
       SuperHuman sh = new SuperHuman(alias, aff, ability, power, phrase);

    }

 }