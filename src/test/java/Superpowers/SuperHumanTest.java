package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    @Test
    public void constructorTest(){
        //Given
        Integer id = 47;
        String name = "Giovane";
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");

        //When
        String result = name + " " + id;

        //Then
        Assert.assertEquals(result, superHuman.toString());



    }

    @Test
    public void setAliasTest(){
        //Given
        String alias = "Mega";
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        //When
        superHuman.setAlias(alias);

        //Then
        Assert.assertEquals(alias, superHuman.getAlias());
    }



    @Test
    public void setAbilityTest(){
        //Given
        String ability = "SuperStrength";
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        //When
        superHuman.setAbility(ability);

        //Then
        Assert.assertEquals(ability, superHuman.getAbility());
    }

    @Test
    public void setAffiliationTest(){
        //Given
        Affiliation affiliation = Affiliation.GOOD;
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        //When
        superHuman.setAffiliation(affiliation);

        //Then
        Assert.assertEquals(affiliation, superHuman.getAffiliation());
    }

    @Test
    public void setPhraseTest(){
        //Given
        String phrase = "Let's Get Em'";
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        //When
        superHuman.setPhrase(phrase);

        //Then
        Assert.assertEquals(phrase, superHuman.catchPhrase());
    }

    @Test
    public void setPowerTest(){
        //Given
        String power = "Super Hearing";
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Super Hearing");
        //When
        superHuman.setPower(power);

        //Then
        Assert.assertEquals(power, superHuman.usePower());
    }
    @Test
    public void getNameTest(){
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        String expected = "Giovane";
        Assert.assertEquals(expected, superHuman.getName());
    }

    @Test
    public void getAliasTest(){
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        String expected =  "Mega";
        Assert.assertEquals(expected, superHuman.getAlias());
    }
    @Test
    public void getAbilityTest(){
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        String expected =  "SuperStrength";
        Assert.assertEquals(expected, superHuman.getAbility());
    }
    @Test
    public void getAffiliationTest(){
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        Affiliation expected =  Affiliation.GOOD;
        Assert.assertEquals(expected, superHuman.getAffiliation());
    }

    @Test
    public void catchPhraseTest(){
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "Power");
        String expected = "Let's Get Em'";
        Assert.assertEquals(expected, superHuman.catchPhrase());
    }
    @Test
    public void usePowerTest(){
        SuperHuman superHuman  = new SuperHuman(47, "Giovane",  LocalDate.of(2020, 1, 8), "male", "teacher", "Mega", "SuperStrength", Affiliation.GOOD, "Let's Get Em'", "It's punching time!");
        String expected = "It's punching time!";
        Assert.assertEquals(expected, superHuman.usePower());
    }





}
