package Superpowers;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperHumanTest {

    String name="Bob";
    LocalDate dob=LocalDate.now();
    String gender="Male";
    String occupation="Worker";
    Affiliation affiliation=Affiliation.GOOD;
    String ability="Air bending";
    String alias="Air man";
    String power="Air go!";
    String catchPhrase="Air is firstname!";
    int id=1;
    SuperHuman bob;

    @Before
    public void setUp(){
        bob=new SuperHuman(name, gender, occupation, dob, id, alias, ability, affiliation, power, catchPhrase);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=bob.getName();
        String actualGender=bob.getGender();
        String actualOccupation=bob.getOccupation();
        LocalDate actualDob=bob.getDOB();
        int actualID=bob.getID();
        Affiliation actualAffiliation=bob.getAffiliation();
        String actualAbility=bob.getAbility();
        String actualAlias=bob.getAlias();
        String actualPower=bob.getPower();
        String actualCatch=bob.catchPhrase();

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
        String actualAlias=bob.getAlias();

        // Then
        Assert.assertEquals(alias, actualAlias);


    }

    @Test
    public void setAliasTest(){
        // Given
        String alias="Changed";

        // When
        bob.setAlias(alias);
        String actualAlias=bob.getAlias();

        // Then
        Assert.assertEquals(alias, actualAlias);


    }

    @Test
    public void getAffiliationTest(){
        // Given

        // When
        Affiliation actualAffiliation=bob.getAffiliation();

        // Then
        Assert.assertEquals(affiliation, actualAffiliation);


    }

    @Test
    public void getAbilityTest(){
        // Given

        // When
        String actualAbility=bob.getAbility();

        // Then
        Assert.assertEquals(ability, actualAbility);


    }

    @Test
    public void setAbilityTest(){
        // Given
        String ability="Flying";

        // When
        bob.setAbility(ability);
        String actualAbility=bob.getAbility();

        // Then
        Assert.assertEquals(ability, actualAbility);


    }

    @Test
    public void getPowerTest(){
        // Given

        // When
        String actualPower=bob.getPower();

        // Then
        Assert.assertEquals(power, actualPower);


    }

    @Test
    public void catchPhraseTest(){
        // Given

        // When
        String actualCatch=bob.catchPhrase();

        // Then
        Assert.assertEquals(catchPhrase, actualCatch);


    }

    @Test
    public void usePowerTest(){
        // Given
        String expected=catchPhrase+power;

        // When
        String actual=bob.usePower();

        // Then
        Assert.assertEquals(expected, actual);


    }


    
}