package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {
    @Test
    public void constructorTest() {
        //Given
        Affiliation expectedAffiliation = Affiliation.GOOD;
        String expectedAlias = "Superwoman";
        String expectedAbility = "Invisibility";
        String expectedName = "Makhya";
        LocalDate expectedDob = LocalDate.of(2002, 04, 05);
        String expectedGender = "Female";
        String expectedOccupation = "Software Developer";
        String expectedCatchPhrase = "Yeah Yeah Yeah We Paid ";
        String expectedUsePower = "Yeah Yeah Yeah We Paid Swoosh";
        String expectedSoundEffect = "Swoosh";
        int expectedAge = 18;
        //When
        SuperHuman superman = new SuperHuman(expectedName, expectedDob, expectedGender, expectedOccupation, expectedAge,
                expectedAlias, expectedAbility, expectedAffiliation, expectedCatchPhrase, expectedSoundEffect);
        //Then
        Assert.assertEquals(superman.getAlias(), expectedAlias);
        Assert.assertEquals(superman.getAbility(), expectedAbility);
        Assert.assertEquals(superman.getAffiliation(), expectedAffiliation);
        Assert.assertEquals(superman.getUsePower(), expectedUsePower);
        Assert.assertEquals(superman.getCatchPhrase(), expectedCatchPhrase);
        Assert.assertEquals(superman.getSoundEffect(), expectedSoundEffect);
    }
}
