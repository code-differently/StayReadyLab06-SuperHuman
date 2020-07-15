package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    SuperHuman bad_thang = new SuperHuman("Cupcake", 100, "Female",
            "Cook", LocalDate.of(2000,3,15), "Frost Kween",
            "Frost Shot", SuperHuman.Affiliation.NEUTRAL,
            "Your dessert served cold!", "Froooosh!");

    @Test
    public void getHeroAlias() {
        String expected = "Frost Kween";
        String actual = bad_thang.getAlias();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeroName() {
        bad_thang.setAlias("Kupcake");
        String actual = bad_thang.getAlias();
        String expected = "Kupcake";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPower() {
        String expected = "Frost Shot";
        String actual = bad_thang.getPower();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPower() {
        bad_thang.setPower("BYAKUGAN");
        String actual = bad_thang.getPower();
        String expected = "BYAKUGAN";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAffiliations() {
        SuperHuman.Affiliation expected = SuperHuman.Affiliation.NEUTRAL;
        SuperHuman.Affiliation actual = bad_thang.getAffiliations();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAffiliations() {
        ;
        SuperHuman.Affiliation expected = SuperHuman.Affiliation.GOOD;
        bad_thang.setAffiliations(SuperHuman.Affiliation.GOOD);
        SuperHuman.Affiliation actual = bad_thang.getAffiliations();

        Assert.assertEquals(expected, actual);
    }
}