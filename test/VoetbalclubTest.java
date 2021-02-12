package test;
import com.company.Voetbalclub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {

    @Test
    public void VoetbalclubLeegTest() {
        Voetbalclub a = new Voetbalclub("");
        assertEquals("FC", a.getNaam());
    }

    @Test
    public void PuntenAantalVerkeerd() {
        Voetbalclub a = new Voetbalclub("FC");
        a.verwerkResultaat('b');
        a.verwerkResultaat('a');
        a.verwerkResultaat('j');
        a.verwerkResultaat('k');
        assertEquals(0, a.aantalGespeeld());
        assertEquals(0, a.aantalPunten());
    }

    @Test
    public void ToStringtest () {
        Voetbalclub a = new Voetbalclub("FC");
        a.verwerkResultaat('w');
        a.verwerkResultaat('g');
        a.verwerkResultaat('v');
        assertEquals("FC 3 1 1 1 4", a.toString());
    }

    @Test
    public void LoopTest () {
        Voetbalclub a = new Voetbalclub("FC");
        for (int i = 0; i < 20; i++) {
            a.verwerkResultaat('w');
            a.verwerkResultaat('g');
            a.verwerkResultaat('v');
        }
        assertEquals(80, a.aantalPunten());
        assertEquals(60, a.aantalGespeeld());

    }
}
