package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    SuperHuman spdrmn;

    @Before
    public void setup(){
        spdrmn = new SuperHuman(1,"Peter Parker", LocalDate.of(1962,8,15),
                "male", "photographer", "Spider-Man", Affiliation.GOOD,
                "Spidey-Sense", "Friendly Neighborhood Spider-Man", "THWIP!");
    }

    @Test
    public void constructorTest(){
        // Given : check @Before

        // When
        int expectedId = 1;
        String expectedName = "Peter Parker";
        LocalDate expectedDob = LocalDate.of(1962,8,15);
        String expectedGender = "male";
        String expectedJob = "photographer";
        String expectedAlias = "Spider-Man";
        Affiliation expectedAff = Affiliation.GOOD;
        String expectedAbility  = "Spidey-Sense";
        String expectedCatchPhrase = "Friendly Neighborhood Spider-Man";
        String expectedSound = "THWIP!";


        int actualId = spdrmn.getId();
        String actualName = spdrmn.getName();
        LocalDate actualDob = spdrmn.getDob();
        String actualGender = spdrmn.getGender();
        String actualJob = spdrmn.getOccupation();
        String actualAlias = spdrmn.getAlias();
        Affiliation actualAff = spdrmn.getAff();
        String actualAbility = spdrmn.getAbility();
        String actualCatchPhrase = spdrmn.catchPhrase();
        String actualSound = spdrmn.getSoundEffect();

        // Then
        Assert.assertEquals( expectedId, actualId );
        Assert.assertEquals( expectedName, actualName );
        Assert.assertEquals( expectedDob, actualDob );
        Assert.assertEquals( expectedGender, actualGender );
        Assert.assertEquals( expectedJob, actualJob );
        Assert.assertEquals( expectedAlias, actualAlias );
        Assert.assertEquals( expectedAff, actualAff );
        Assert.assertEquals( expectedAbility, actualAbility );
        Assert.assertEquals( expectedCatchPhrase, actualCatchPhrase );
        Assert.assertEquals( expectedSound, actualSound );

    }

    @Test
    public void getAliasTest(){
        // Given : check @Before

        // When
        String expected = "Spider-Man";
        String actual = spdrmn.getAlias();

        // Then
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void getAffTest(){
        // Given : check @Before

        // When
        Affiliation expected = Affiliation.GOOD;
        Affiliation actual = spdrmn.getAff();

        // Then
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void getAbilityTest(){
        // Given : check @Before

        // When
        String expected = "Spidey-Sense";
        String actual = spdrmn.getAbility();

        // Then
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void catchPhrase(){
        // Given : check @Before

        // When
        String expected = "Friendly Neighborhood Spider-Man";
        String actual = spdrmn.catchPhrase();

        // Then
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void usePowerTest(){
        // Given : check @Before

        // When
        String expected = "Friendly Neighborhood Spider-Man, THWIP!";
        String actual = spdrmn.usePower();

        // Then
        Assert.assertEquals( expected, actual );
    }
}
