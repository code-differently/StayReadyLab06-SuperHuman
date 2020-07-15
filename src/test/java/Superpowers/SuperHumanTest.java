package Superpowers;
import org.junit.*;

public class SuperHumanTest {
  SuperHuman sup = new SuperHuman(); 
  SuperHuman sup1 = new SuperHuman("MegaMind", "mindf***ery", HeroStatus.VIGILANTE);

  @Test 
  public void abilityTest(){
    String expected = "mind control";
    sup.setAbility("mind control");
    
    String actual = sup.getAbility(); 

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void aliasTest(){
    String expected = "MegaMind";
    sup.setAlias("MegaMind");
    
    String actual = sup.getAlias(); 

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void affiliationTest(){
    HeroStatus expected = HeroStatus.VILLIAN;
    sup.changeAffiliation(HeroStatus.VILLIAN);
    
    HeroStatus actual = sup.getAffiliation(); 

    Assert.assertEquals(expected, actual);
  }



  
}