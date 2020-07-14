package Superpowers;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SuperHumanTest {
    SuperHuman superHuman;

    @Before
    public void initialize() {
        superHuman = new SuperHuman();
    }

    @Test
    public void getAliasTest() {
        //given
        String expected = "";
        //when
        String actual = superHuman.getAlias();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAliasTest() {
        //given
        String expected = "Spider-Man";
        //when
        superHuman.setAlias("Spider-Man");
        String actual = superHuman.getAlias();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAbilityTest(){
        //Given
        String expected = "";
        //When
        String actual = superHuman.getAbility();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAbilityTest(){
        //Given
        String expected = "Flying";
        //When
        superHuman.setAbility("Flying");
        String actual = superHuman.getAbility();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCatchPhraseTest(){
        //Given
        String expected = "";
        //When
        String actual = superHuman.getCatchPhrase();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setCatchPhraseTest(){
        //Given
        String expected = "I am great";
        //When
        superHuman.setCatchPhrase("I am great");
        String actual = superHuman.getCatchPhrase();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSoundEffectTest(){
        //Given
        String expected = "";
        //When
        String actual = superHuman.getSoundEffect();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSoundEffectTest(){
        //Given
        String expected = "pew";
        //When
        superHuman.setSoundEffect("pew");
        String actual = superHuman.getSoundEffect();
        //Then
        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void usePowerTest(){
        //Given
        String expected = "Up up and away swoosh";
        //When
        superHuman.setCatchPhrase("Up up and away");
        superHuman.setSoundEffect("swoosh");
        String actual = superHuman.usePower();
        //Then
        Assert.assertEquals(expected,actual);
    }

}