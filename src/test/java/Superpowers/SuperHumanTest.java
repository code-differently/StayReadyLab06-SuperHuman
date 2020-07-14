package Superpowers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

public class SuperHumanTest 
{
    
    SuperHuman deku = new SuperHuman();
    @Before
    public void initialize()
    {
        deku.setName("Midoriya");
        deku.setGender("Male");
        deku.setDOB(LocalDate.of(1998, 07, 14));
        deku.setOccupation("Hero In Training");
        deku.setAlias("Deku");
        deku.setAffiliation(Affiliation.Good);
        deku.setAbility("One For All");
        deku.setPhrase("Go beyond PLUS ULTRA!!!");
        deku.setSound("SMAAAAAASSSHHHH!!!!");

    }

    @Test
    public void constructionTest()
    {
        Human clark = new SuperHuman();
        clark.setName("Clark");
        clark.setDOB(LocalDate.of(1997,05,17));
        clark.setGender("Male");
        clark.setOccupation("Journalist");

        //Setting SuperHuman variables
        ((SuperHuman)clark).setAlias("Superman");
        ((SuperHuman)clark).setAbility("Kryptonian");
        ((SuperHuman)clark).setAffiliation(Affiliation.Good);
        ((SuperHuman)clark).setPhrase("Up up and okay");
        ((SuperHuman)clark).setSound("Skadooooosh");

        String expectedAlias = "Superman";
        String expectedAbility = "Kryptonian";
        Affiliation expectedAffili= Affiliation.Good;
        String expectedPower = "Superman: Up up and okay, Skadooooosh";

        String actualAlias =  ((SuperHuman)clark).getAlias(); 
        String actualAbility =  ((SuperHuman)clark).getAbility();
        Affiliation actualAffiliation=  ((SuperHuman)clark).getAffiliation(); 
        String actualPower =  ((SuperHuman)clark).usePower();

        Assert.assertEquals(expectedAlias, actualAlias);
        Assert.assertEquals(expectedAbility, actualAbility);
        Assert.assertEquals(expectedAffili,actualAffiliation);
        Assert.assertEquals(expectedPower,actualPower);
    }

    @Test
    public void powerUseTest()
    {
        String expectedPower = "Deku: Go beyond PLUS ULTRA!!!, SMAAAAAASSSHHHH!!!!";

        String actualPower = deku.usePower();

        Assert.assertEquals(expectedPower, actualPower);
    }
}