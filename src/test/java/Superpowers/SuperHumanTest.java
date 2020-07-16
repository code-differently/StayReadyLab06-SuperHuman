package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class SuperHumanTest {
        String alias = "Nay";
        String ability = "Shape shifting";
        String catchPhrase = "Love is the new Money";
        String usePower = "Neigh";
        Integer id = 25;
        String name = "Naomi";
        LocalDate dob = LocalDate.of(1997, 01, 11); //date of birth
        String gender = "Female";
        String occupation = "CEO";
        Affiliation affiliation = Affiliation.NEUTRAL;

        SuperHuman superhuman;

        @Before
        public void setUp() {
            superhuman = new SuperHuman(id, name, dob, gender, occupation, alias, ability, catchPhrase, usePower, affiliation);

        }

        @Test
        public void getAliasTest() {
            //Given
            String expected = "Nay";

            //When

            //Then
            String actual = superhuman.getAlias();
            Assert.assertEquals(expected, actual);

        }

        @Test
        public void getAbilityTest() {
            //Given
            String expected = "Shape shifting";

            //When

            //Then
            String actual = superhuman.getAbility();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getCatchPhraseTest() {
            //Given
            String expected = "Love is the new Money";

            //When

            //Then
            String actual = superhuman.getCatchPhrase();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getUsePowerTest() {
            //Given
            String expected = "Neigh";
            //When

            //Then
            String actual = superhuman.getUsePower();
            Assert.assertEquals(expected, actual);
        }
    }