

import org.testng.annotations.Test;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.Assert.assertEquals;



public class MainTest {

    @Test

    public void testDate(){
        String dateTimeString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateTimeString);

        int anno = dateTime.getYear();
        assertEquals(2023, anno);

        String nomeMese = dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertEquals("marzo", nomeMese);

        int giorno = dateTime.getDayOfMonth();
        assertEquals(1,giorno);

        String nomeGiornoSettimana = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertEquals("mercoledì", nomeGiornoSettimana);

    }

}