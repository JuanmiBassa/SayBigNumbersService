package net.EsLiceu.numbers;

import net.esliceu.numbers.Numbers;
import net.esliceu.numbers.NumbersCat;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersCatTest {

    Numbers numbers;

    @Before
    public void setUp() throws Exception {
        numbers = new NumbersCat();
    }

    @Test
    public void donat_0() {
        assertEquals("Zero", numbers.say(0));
    }

    @Test
    public void donat_1() {
        assertEquals("Un", numbers.say(1));
    }

    @Test
    public void donat_menys3() {
        assertEquals("Donat -3 ens torna Menys Tres", "Menys tres", numbers.say(-3));
    }

    @Test
    public void donat_20() {
        assertEquals("Vint", numbers.say(20));
        assertEquals("Vint-i-dos", numbers.say(22));
    }

    @Test
    public void decenas() {
        assertEquals("Trenta", numbers.say(30));
        assertEquals("Quaranta", numbers.say(40));
        assertEquals("Cinquanta", numbers.say(50));
        assertEquals("Seixanta", numbers.say(60));
        assertEquals("Setanta", numbers.say(70));
        assertEquals("Vuitanta", numbers.say(80));
        assertEquals("Noranta", numbers.say(90));
    }


    @Test
    public void donat_100() {
        assertEquals("Cent", numbers.say(100));
    }

    @Test
    public void donat_centenars() {
        assertEquals("Cent cinc", numbers.say(105));
        assertEquals("Cent vint-i-cinc", numbers.say(125));
        assertEquals("Cent noranta-nou", numbers.say(199));
        assertEquals("Dos-cents", numbers.say(200));
        assertEquals("Dos-cents cinquanta-sis", numbers.say(256));
        assertEquals("Quatre-cents vint-i-dos", numbers.say(422));
        assertEquals("Sis-cents seixanta-sis", numbers.say(666));
        assertEquals("Nou-cents noranta-nou", numbers.say(999));
    }

    @Test
    public void donat_1000() {
        assertEquals("Mil", numbers.say(1000));
    }

    @Test
    public void donat_milers() {
        assertEquals("Mil vint-i-cinc", numbers.say(1025));
        assertEquals("Vint-i-un mil vint-i-cinc", numbers.say(21025));
        assertEquals("Vuit-cents cinquanta-un mil set-cents vint-i-cinc", numbers.say(851725));
        assertEquals("Nou-cents noranta-nou mil nou-cents noranta-nou", numbers.say(999999));
    }

    @Test
    public void donat_851725() {
        assertEquals("Vuit-cents cinquanta-un mil set-cents vint-i-cinc", numbers.say(851725));
    }
}

