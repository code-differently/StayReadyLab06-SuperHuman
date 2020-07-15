package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHumanTest {
    
    @Test
    public void getAiliasTest()
    {
         //Given 
         Superhuman superhuman = new Superhuman();
         //When 
         String actual = superhuman.getalias();
         String expected = "My alias";
         //Then 
         Assert.assertEquals(expected, actual);
    }
    @Test
    public void setAliasTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        String ali = "The Crimson Chin";
        superhuman.setalias(ali);
        //When 
        String expected = ali;
        String actual = superhuman.getalias();
        //Then 
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void setAbilityTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        String abi = "Super human Strength";
        superhuman.setability(abi);
        //When 
        String actual = superhuman.getability();
        String expected = abi;
        //Then 
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getAbilityTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        //When 
        String actual = superhuman.getability();
        String expected = "My ability";
        //Then 
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getAffiliationTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        //When 
        Afilliation actual = superhuman.getafiliation();
        Afilliation expected = Afilliation.Good;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setAffiliationTest()
    {
        //Given
        Superhuman superhuman = new Superhuman();
        Afilliation afill = Afilliation.Bad;
        //When 
        superhuman.setafiliation(afill);
        Afilliation actual = superhuman.getafiliation();
        Afilliation expected = afill;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void catchPhraseTest()
    {
        //Given 
        Superhuman superhuman =new Superhuman();
        //When 
        String actual = superhuman.catchPhrase();
        String expected = "catch Phrase";
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setCatchPhraseTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        String cp = "Take That!";
        superhuman.setCatchPhrase(cp);
        //When 
        String actual = superhuman.catchPhrase();
        String expected = cp;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void usePowerTest()
    {
        //Given 
        Superhuman superhuman =new Superhuman();
        //When 
        String actual = superhuman.usePower();
        String expected = superhuman.catchPhrase() + "power";
        //Then 
        Assert.assertEquals(expected.trim(), actual.trim());
    }
    @Test
    public void setPowersTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        String pow = "Crush!";
        superhuman.setPowers(pow);
        //When 
        String actual = superhuman.getPowers();
        String expected = pow;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getPowerTest()
    {
        //Given 
        Superhuman superhuman = new Superhuman();
        //When 
        String actual = superhuman.getPowers();
        String expected = "power";
        //Then 
        Assert.assertEquals(expected, actual);
    }
}