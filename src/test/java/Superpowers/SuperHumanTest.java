package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SuperHumanTest {

    @Test
    public void getHeroName() {
        String expected = "Cupcake";
        String actual = bad_thang.getAlias();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeroName() {
        String expected = "Kupcake";
        bad_thang.setAlias("Kupcake");
        String actual = bad_thang.getAlias();

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
        SuperHuman.Affiliation expected = SuperHuman.Affiliation.NEUTRAL;
        SuperHuman.Affiliation actual = bad_thang.getAffiliations();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAffiliations() {
        SuperHuman.Affiliation expected = SuperHuman.Affiliation.GOOD;
        bad_thang.setAffiliations(SuperHuman.Affiliation.GOOD);
        SuperHuman.Affiliation actual = bad_thang.getAffiliations();

        Assert.assertEquals(expected, actual);
    }
}