package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    SuperHuman Gloku = new SuperHuman();

    @Before
    public void Test1(){

        Gloku.setName("Kakarot");
        Gloku.setGender("Male");
        Gloku.setDob(LocalDate.of(1998,04,04));
        Gloku.setOccupation("Student");
        Gloku.setAlias("Gloku");
        Gloku.setAffiliation(Affiliation.GOOD);
        Gloku.setAbility("Super Saiyan");
        Gloku.setCatchPhrase("KAMEHAMEHA");
        Gloku.setSound("HAAAAAAAAAAAAAAAAAA");

    }

    @Test
    public void Test2(){

        Human JC = new SuperHuman();

        JC.setName("Jermaine");
        JC.setDob(LocalDate.of(1985,01,28));
        JC.setGender("Male");
        JC.setOccupation("Rapper");
        ((SuperHuman)JC).setAlias("J. Cole");
        ((SuperHuman)JC).setAbility("Spit Fire");
        ((SuperHuman)JC).setAffiliation(Affiliation.GOOD);
        ((SuperHuman)JC).setCatchPhrase("Some times I brag like HOV");
        ((SuperHuman)JC).setSound("aaaaaaAAAAAaa");

        String expectedAlias = "J. Cole";
        String expextedAbility = "Spit Fire";
        Affiliation expectedAffiliation = Affiliation.GOOD;
        String expectedPower = "Some times I brag like HOV aaaaaaAAAAAaa";

        String actualAlias = ((SuperHuman)JC).getAlias();
        String actualAbility = ((SuperHuman)JC).getAbility();
        Affiliation actualAffiliation = ((SuperHuman)JC).getAffiliation();
        String actualPower = ((SuperHuman)JC).usePower();

        Assert.assertEquals(expectedAlias, actualAlias);
        Assert.assertEquals(expextedAbility, actualAbility);
        Assert.assertEquals(expectedAffiliation, actualAffiliation);
        Assert.assertEquals(expectedPower, actualPower);
    }


}
