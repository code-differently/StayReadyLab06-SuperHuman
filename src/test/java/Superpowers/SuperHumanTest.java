package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHumanTest {
    @Test
    public void SuperHumanAliasTest(){
        //Given
        SuperHuman sam = new SuperHuman();
        //When
        sam.setAlias("greenSam");
        sam.setAbility("superJump");
        String expected = "greenSam";
        String actual = sam.getAlias();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SuperHumanAbilityTest(){
        //Given
        SuperHuman sam = new SuperHuman();
        //When
        sam.setAbility("superJump");
        String expected = "superJump";
        String actual = sam.getAbility();
        //Then
        Assert.assertEquals(expected, actual);
    }
}