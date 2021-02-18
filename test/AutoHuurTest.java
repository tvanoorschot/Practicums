package test;


import com.autohuur.Auto;
import com.autohuur.AutoHuur;
import com.autohuur.Klant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {

    @Test
    public void negatievePrijs() {
        Auto a1 = new Auto("aaaa", -20);
        assertEquals(20, a1.getPrijsPerDag());
    }

    @Test
    public void naamIsLeeg() {
        Klant k = new Klant("");
        assertEquals("er is geen huurder bekend", k.toString());
    }

    @Test
    public void autoIsLeeg() {
        Auto a1 = new Auto("", 20);
        assertEquals("er is geen auto bekend", a1.toString());
    }

}
