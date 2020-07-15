package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperhumanTest {

    Superhuman testSuperhuman;
    String name;
    LocalDate birthday;
    String gender;
    String occupation;
    String expectedAlias;
    String expectedAbility;
    String expectedP;
    String expectedFx;
    String actualAlias;
    String actualAbility;
    String actualP;
    String actualFx;


    @Before
    public void setUp(){

        name = "John Doe";
        birthday = LocalDate.now().withYear(2019);
        gender = "fm";
        occupation = "None";
        expectedAbility = "el";
        expectedAlias = "batman";
        testSuperhuman = new Superhuman(name, birthday, gender, occupation, expectedAlias,expectedAbility);

    }

    @Test
    public void constructerTest() {

        actualAlias = testSuperhuman.getAlias();
        actualAbility = testSuperhuman.getAbility();

        Assert.assertEquals(expectedAlias, actualAlias);
        Assert.assertEquals(expectedAbility, actualAbility);

    }

    @Test
    public void setAliasTest() {

        expectedAlias = "bruce";
        testSuperhuman.setAlias(expectedAlias);
        actualAlias = testSuperhuman.getAlias();


        Assert.assertEquals(expectedAlias, actualAlias);

    }

    @Test
    public void setAbilityTest() {

        expectedAbility = "fly";
        testSuperhuman.setAbility(expectedAbility);
        actualAbility = testSuperhuman.getAbility();


        Assert.assertEquals(expectedAbility, actualAbility);

    }

    @Test
    public void setAffTest() {

        Superhuman.affiliation expectedAff = Superhuman.affiliation.bad;
        testSuperhuman.setAff(expectedAff);
        Superhuman.affiliation actualAff = testSuperhuman.getAff();


        Assert.assertEquals(expectedAff, actualAff);

    }


    @Test
    public void setPhraseTest() {


        expectedP = "yooo im free";
        testSuperhuman.setPhrase(expectedP);
        actualP = testSuperhuman.catchPhrase();


        Assert.assertEquals(expectedP, actualP);

    }

    @Test
    public void setFxTest() {


        expectedP = "yooo im free";
        expectedFx = "yooo im free, weeeeee";
        testSuperhuman.setPhrase(expectedP);
        testSuperhuman.setSoundFx("weeeeee");
        actualFx = testSuperhuman.usePower();


        Assert.assertEquals(expectedFx, actualFx);

    }
}
