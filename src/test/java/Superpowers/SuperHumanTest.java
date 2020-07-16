package Superpowers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import org.junit.Assert;

public class SuperHumanTest {

    @Test
    public void constructorTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        String actualName = superHuman.getName();
        String expectedName = "Kal-El";

        String actualGender = superHuman.getGender();
        String expectedGender = "Male";

        String actualOccupation = superHuman.getOccupation();
        String expectedOccupation = "Librarian";

        LocalDate actualDate = superHuman.getDob();
        String date = "4/06/1981";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate expectedDate = LocalDate.parse(date, formatter);

        String actualAlias = superHuman.getAlias();
        String expectedAlias = "SuperMan";

        Affiliation actualAffiliation = superHuman.getAffiliation();
        Affiliation expectedAffiliation = Affiliation.GOOD;

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedAlias, actualAlias);
        Assert.assertEquals(expectedAffiliation, actualAffiliation);
    }

    @Test
    public void setAliasTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        superHuman.setAlias("Batman");

        String actual = superHuman.getAlias();
        String expected = "Batman";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAliasTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        String actual = superHuman.getAlias();
        String expected = "SuperMan";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAffiliationsTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        superHuman.setAffiliation(Affiliation.BAD);

        Affiliation actual = superHuman.getAffiliation();
        Affiliation expected = Affiliation.BAD;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAffiliationTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        Affiliation actual = superHuman.getAffiliation();
        Affiliation expected = Affiliation.GOOD;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAbilityTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        superHuman.setAbility("Mind Control");

        String actual = superHuman.getAbility();
        String expected = "Mind Control";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAbilityTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        String actual = superHuman.getAbility();
        String expected = "";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCatchPhraseTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        superHuman.setCatchPhrase("SuperMan is here to save the day!");

        String actual = superHuman.catchPhrase();
        String expected = "SuperMan is here to save the day!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catchPhraseTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        String actual = superHuman.catchPhrase();
        String expected = "";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPowerSoundEffectTest(){
        SuperHuman superHuman = new SuperHuman("Kal-El", "Male", "Librarian", "4/06/1981", "SuperMan", Affiliation.Good);

        superHuman.setCatchPhrase("SuperMan is here to save the day!");
        superHuman.setPowerSoundEffect("Up Up and Away");

        String actual = superHuman.usePower();
        String expected = "SuperMan is here to save the day! Up Up and Away";

        Assert.assertEquals(expected, actual);
    }
}