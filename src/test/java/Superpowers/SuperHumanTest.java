package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHumanTest {

    SuperHuman bad_thang = new SuperHuman();
    @Test
    public void getHeroName() {
        String expected = "Cupcake";
        String actual = bad_thang.getHeroName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeroName() {
        String expected = "Kupcake";
        bad_thang.setHeroName("Kupcake");
        String actual = bad_thang.getHeroName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPower() {
        String expected = "Quirk: Frost Shots";
        String actual = bad_thang.getPower();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPower() {
        String expected = "BYAKUGAN";
        bad_thang.setPower("BYAKUGAN");
        String actual = bad_thang.getPower();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAffiliations() {
        SuperHuman.Affiliations expected = SuperHuman.Affiliations.NEUTRAL;
        SuperHuman.Affiliations actual = bad_thang.getAffiliations();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAffiliations() {
        SuperHuman.Affiliations expected = SuperHuman.Affiliations.GOOD;
        bad_thang.setAffiliations(SuperHuman.Affiliations.GOOD);
        SuperHuman.Affiliations actual = bad_thang.getAffiliations();

        Assert.assertEquals(expected, actual);
    }
}