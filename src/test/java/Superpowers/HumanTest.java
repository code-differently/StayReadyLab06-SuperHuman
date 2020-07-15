package Superpowers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;

import org.junit.Test;

public class HumanTest {
    @Test
     public void humanConstructorTest(){
        Human hum=new SuperHuman("joe", 1114, "nonbinary","bum",LocalDate.of(2007, 07, 29));
        assertEquals("joe", hum.getName());
        assertEquals(1114, hum.getID());
        assertEquals("nonbinary", hum.getGender());
        assertEquals("bum", hum.getOccupation());
        assertEquals(LocalDate.of(2007, 07, 29), hum.getDOB());
        hum.setDOB(LocalDate.of(2007, 1, 13));
        assertNotEquals(LocalDate.of(2007, 07, 29), hum.getDOB());
    }
    public void superHumanConstructorTest(){
        SuperHuman sup=new SuperHuman("Wonder Woman", "strong", "For Justice","wham!");
        assertEquals("Wonder Woman", sup.getAlias());
        assertEquals("strong", sup.getAbility());
        assertEquals("For Justice", sup.getPhrase());
        assertEquals("wham!", sup.getEffect());
    }
}
