package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SuperHumanTest {
    SuperHuman superhuman;

    @Before
    public void initialize() {
        superhuman = new SuperHuman("Hulk", Affiliation.GOOD, "Strong",  "Dont make me angry", "Bam");
    }


    @Test
    public void aliasTest() {
        Assert.assertEquals("Hulk", superhuman.getAlias());
    }

    @Test
    public void abilityTest() {
        Assert.assertEquals("Strong", superhuman.getAbility());
    }


    @Test
    public void catchPhraseTest() {
        Assert.assertEquals("Dont make me angry", superhuman.getCatchPhrase());

    }

    @Test
    public void usePowerTest() {
        Assert.assertEquals("Dont make me angry Bam", superhuman.usePower());
    }

    public static void main(String[] args) {
        Human Bob = new Human();
        Human Susan = new Human();
        Human Larry = new Human();
        SuperHuman TomatoMan = new SuperHuman();
        SuperHuman FemArcher = new SuperHuman();
        SuperHuman LarryBoy = new SuperHuman();
        Bob.getId();
        Larry.setGender("Male");
        Susan.setOccupation("Bounty Hunter");
        TomatoMan.setOccupation("Grocer");
        LarryBoy.setOccupation("Fighting the forces of evil.");
        FemArcher.getId();
    }
}