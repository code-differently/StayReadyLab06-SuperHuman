package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHumanTest {
    SuperHuman shObj;

    @Test
    public void constructorDefaultTest() {
        shObj = new SuperHuman();

        String expectedAlias = "No alias";
        String expectedAff = Affiliation.GOOD.toString();
        String expectedAbility = "Ability not unlocked";
        String expectedCatchPhrase = "What to say";

        Assert.assertEquals(expectedAlias, shObj.getAlias());
        Assert.assertEquals(expectedAff, shObj.getAffiliation());
        Assert.assertEquals(expectedAbility, shObj.getAbility());
        Assert.assertEquals(expectedCatchPhrase, shObj.catchPhrase());

    }

    @Test
    public void constructorArgsTest() {

        String expectedAlias = "Doctor Strange";
        Affiliation expectedAff = Affiliation.GOOD;
        String expectedAffString = expectedAff.toString();
        String expectedAbility = "Magic";
        String expectedCatchPhrase = "I am the sorcerer supreme";
        shObj = new SuperHuman(expectedAlias, expectedAff, expectedAbility, expectedCatchPhrase);

        Assert.assertEquals(expectedAlias, shObj.getAlias());
        Assert.assertEquals(expectedAffString, shObj.getAffiliation());
        Assert.assertEquals(expectedAbility, shObj.getAbility());
        Assert.assertEquals(expectedCatchPhrase, shObj.catchPhrase());

    }

    @Test
    public void catchPhraseTest() {
        shObj = new SuperHuman();

        String expected = "What to say";
        String actual = shObj.catchPhrase();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCatchPhraseTest() {
        shObj = new SuperHuman();

        String expected = "Hulk smash";
        shObj.setCatchPhrase(expected);
        String actual = shObj.catchPhrase();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAliasTest() {
        shObj = new SuperHuman();

        String expected = "No alias";
        String actual = shObj.getAlias();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAliasTest() {
        shObj = new SuperHuman();

        String expected = "Magneto";
        shObj.setAlias(expected);
        String actual = shObj.getAlias();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAffiliationTest() {
        shObj = new SuperHuman();

        String expected = "GOOD";
        String actual = shObj.getAffiliation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAffiliationTest() {
        shObj = new SuperHuman();

        Affiliation expectedAff = Affiliation.BAD;
        String expectedAffString = expectedAff.toString();
        shObj.setAffiliation(expectedAff);
        String actual = shObj.getAffiliation();

        Assert.assertEquals(expectedAffString, actual);
    }

    @Test
    public void getAbilityTest() {
        shObj = new SuperHuman();

        String expected = "Ability not unlocked";
        String actual = shObj.getAbility();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAbilityTest() {
        shObj = new SuperHuman();

        String expected = "Web";
        shObj.setAbility(expected);
        String actual = shObj.getAbility();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void usePowerTest() {
        shObj = new SuperHuman();

        String expected = shObj.catchPhrase() + " " + SuperHuman.POWER_NOISE;
        shObj.setAbility(expected);
        String actual = shObj.getAbility();

        Assert.assertEquals(expected, actual);
    }
}
