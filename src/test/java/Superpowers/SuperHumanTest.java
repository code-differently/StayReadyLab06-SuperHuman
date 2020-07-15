package Superpowers;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class SuperHumanTest {
    SuperHuman superHuman;

    @Before
    public void initialize() {
        superHuman = new SuperHuman(65, "Gwen Stacy", LocalDate.of(1999, 6, 23), "woman", "saving the world", "Spider-Gwen", "agility", "I'm from another dimension. I mean, another–another dimension.", "Thwip!", Affiliation.GOOD);
    }

    @Test
    public void getAliasTest() {
        //given
        String expected = "Spider-Gwen";
        //when
        String actual = superHuman.getAlias();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAliasTest() {
        //given
        String expected = "Ghost-Spider";
        //when
        superHuman.setAlias("Ghost-Spider");
        String actual = superHuman.getAlias();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAffiliationTest() {
        //given
        String expectedAffiliation = "Hero";
        //when
        Affiliation affiliation = superHuman.getAffiliation();
        String actualAffiliation = affiliation.getWhichSide();
        //then
        Assert.assertEquals(expectedAffiliation, actualAffiliation);
    }

    @Test
    public void setAffiliationTest() {
        //given
        String expectedAffiliation = "Villain";
        //when
        superHuman.setAffiliation(Affiliation.BAD);
        Affiliation affiliation = superHuman.getAffiliation();
        String actualAffiliation = affiliation.getWhichSide();
        //then
        Assert.assertEquals(expectedAffiliation, actualAffiliation);
    }


    @Test
    public void getAbilityTest(){
        //Given
        String expected = "agility";
        //When
        String actual = superHuman.getAbility();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAbilityTest(){
        //Given
        String expected = "spider strength";
        //When
        superHuman.setAbility("spider strength");
        String actual = superHuman.getAbility();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCatchPhraseTest(){
        //Given
        String expected = "I'm from another dimension. I mean, another–another dimension.";
        //When
        String actual = superHuman.getCatchPhrase();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setCatchPhraseTest(){
        //Given
        String expected = "I'm Gw– anda";
        //When
        superHuman.setCatchPhrase("I'm Gw– anda");
        String actual = superHuman.getCatchPhrase();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSoundEffectTest(){
        //Given
        String expected = "Thwip!";
        //When
        String actual = superHuman.getSoundEffect();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSoundEffectTest(){
        //Given
        String expected = "Wham!";
        //When
        superHuman.setSoundEffect("Wham!");
        String actual = superHuman.getSoundEffect();
        //Then
        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void usePowerTest(){
        //Given
        String expected = "I'm from another dimension. I mean, another–another dimension. Thwip!";
        //When
        superHuman.setCatchPhrase("I'm from another dimension. I mean, another–another dimension.");
        superHuman.setSoundEffect("Thwip!");
        String actual = superHuman.usePower();
        //Then
        Assert.assertEquals(expected,actual);
    }
}