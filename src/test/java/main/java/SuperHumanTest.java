package main.java ; 

import org.junit.Assert;
import org.junit.Test;
public class SuperHumanTest {
    
    @Test
    public void constructorTest(){
        String expectedAlias = "Spiderman";
        String expectedPower ="Pew,pew!";
        Affiliation.affiliation expectedAffiliation=Affiliation.affiliation.GOOD;
        String expectedAbility="Web Powers";
        String expectedPhrase="Just your Friendly Neighborhood Spiderman";


        SuperHuman sh= new SuperHuman(expectedAlias,expectedAffiliation,expectedPower,expectedPhrase,expectedAbility );

        //setters
        sh.setAlias(expectedAlias);
        sh.setPhrase(expectedPhrase);
        sh.setPower(expectedPower);
        sh.setAffiliation(expectedAffiliation);
        sh.setAbility(expectedAbility);

        //expected
        String expectedString2=expectedAlias;
        String expectedString1=expectedPhrase;
        String expectedString4=expectedPower;
        String expectedString5=expectedAbility;
        Affiliation.affiliation expectedString3=expectedAffiliation;

        //String expectedString = expectedPhrase+" "+expectedAlias + " " + expectedPower + " " + expectedAffiliation+" "+expectedAbility;
        // catchPhrase() +" "+ alias + " " +power+ " "+ affiliation+ " "+ ability;
        //return phrase+" "+ alias + " " +power+ " "+ affiliation+ " "+ ability;

        //actual
        String actualString2=sh.getAlias();
        String actualString1=sh.getCatchPhrase();
        String actualString4=sh.getPower();
        String actualString5=sh.getAbility();
        Affiliation.affiliation actualString3=sh.getAffiliation();

        //testers
        Assert.assertEquals(expectedString1,actualString1);
        Assert.assertEquals(expectedString2,actualString2);
        Assert.assertEquals(expectedString3,actualString3);
        Assert.assertEquals(expectedString4,actualString4);
        Assert.assertEquals(expectedString5,actualString5);
    }
    

    @Test 
    public void aliasTest(){
    SuperHuman sh= new SuperHuman();//arguments ); 

    String expectedAlias="Spiderman"; 

    String actualAlias=sh.getAlias();

    Assert.assertTrue(expectedAlias.equals(actualAlias));
}

    
    @Test 
    public void affiliationTest(){
    SuperHuman sh= new SuperHuman(); 

    Affiliation expectedAff= Affiliation.GOOD; 

    Affiliation actualAff= sh. getAffiliaton(); 
    Assert.assertTrue(expectedAff.equals(actualAff));
    }



    @Test 
    public void abilityTest(){
    SuperHuman sh=new SuperHuman();
    String expectedAbility= "Web Powers"; 
    String actualAbility= sh.getAbility(); 
    Assert.assertTrue(expectedAbility.equals(actualAbility)); 
    }

    @Test
    public void catchPhraseTest(){
    SuperHuman sh=new SuperHuman();
    String expectedPhrase= "Just your Friendly Neighborhood Spiderman"; 
    String actualPhrase=sh.getCatchPhrase(); 

    Assert.assertTrue(expectedPhrase.equals(actualPhrase));




    }
    


}