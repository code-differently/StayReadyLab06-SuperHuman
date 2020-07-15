package Superpowers;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Superpowers.SuperHuman.Affiliation;

public class SuperHumanTest {

    String name="Joe";
    LocalDate dob=LocalDate.now();
    String gender="Male";
    String occupation="Office Worker";
    Affiliation affiliation=Affiliation.GOOD;
    String ability="Flying";
    String alias="Cloud Man";
    String power="Let's Go";
    String catchPhrase="To the Clouds";
    int id=1;
    SuperHuman joe;

    @Before
    public void setUp(){
        joe=new SuperHuman(name, gender, occupation, dob, id, alias, ability, affiliation, power, catchPhrase);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=joe.getName();
        String actualGender=joe.getGender();
        String actualOccupation=joe.getOccupation();
        LocalDate actualDob=joe.getDOB();
        int actualID=joe.getID();
        Affiliation actualAffiliation=joe.getAffiliation();
        String actualAbility=joe.getAbility();
        String actualAlias=joe.getAlias();
        String actualPower=joe.getPower();
        String actualCatch=joe.catchPhrase();

        // Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(gender, actualGender);
        Assert.assertEquals(occupation, actualOccupation);
        Assert.assertEquals(dob, actualDob);
        Assert.assertEquals(affiliation, actualAffiliation);
        Assert.assertEquals(ability, actualAbility);
        Assert.assertEquals(id, actualID);
        Assert.assertEquals(alias, actualAlias);
        Assert.assertEquals(power, actualPower);
        Assert.assertEquals(catchPhrase, actualCatch);


    }

    @Test
    public void getAliasTest(){
        // Given

        // When
        String actualAlias=joe.getAlias();

        // Then
        Assert.assertEquals(alias, actualAlias);


    }

    @Test
    public void setAliasTest(){
        // Given
        String alias="Camo";

        // When
        joe.setAlias(alias);
        String actualAlias=joe.getAlias();

        // Then
        Assert.assertEquals(alias, actualAlias);


    }

    @Test
    public void getAffiliationTest(){
        // Given

        // When
        Affiliation actualAffiliation=joe.getAffiliation();

        // Then
        Assert.assertEquals(affiliation, actualAffiliation);


    }

    @Test
    public void getAbilityTest(){
        // Given

        // When
        String actualAbility=joe.getAbility();

        // Then
        Assert.assertEquals(ability, actualAbility);


    }

    @Test
    public void setAbilityTest(){
        // Given
        String ability="Stealth";

        // When
        joe.setAbility(ability);
        String actualAbility=joe.getAbility();

        // Then
        Assert.assertEquals(ability, actualAbility);


    }

    @Test
    public void getPowerTest(){
        // Given

        // When
        String actualPower=joe.getPower();

        // Then
        Assert.assertEquals(power, actualPower);


    }

    @Test
    public void catchPhraseTest(){
        // Given

        // When
        String actualCatch=joe.catchPhrase();

        // Then
        Assert.assertEquals(catchPhrase, actualCatch);


    }

    @Test
    public void usePowerTest(){
        // Given
        String expected=catchPhrase+power;

        // When
        String actual=joe.usePower();

        // Then
        Assert.assertEquals(expected, actual);


    }
}