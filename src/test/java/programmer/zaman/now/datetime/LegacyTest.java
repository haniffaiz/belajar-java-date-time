package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LegacyTest {

    @Test
    void fromLegacy() {

        Date date = new Date();
        System.out.println(date);

        Instant instant = date.toInstant();
        System.out.println(instant);

    }

    @Test
    void toLegacy() {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        Date date = Date.from(zonedDateTime.toInstant());

        Calendar calendar = GregorianCalendar.from(zonedDateTime);

    }
}

