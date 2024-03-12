package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create() {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(10,10,10);
        LocalTime localTime3 = LocalTime.parse("08:08");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void change() {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(10);
        LocalTime localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void modify() {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(10);
        LocalTime localTime3 = localTime1.plusHours(5).plusMinutes(10).minusSeconds(3);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void get() {

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1.getHour());
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getSecond());
        System.out.println(localTime1.getNano());

    }
}
