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
}