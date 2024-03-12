package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;
import java.time.*;

public class YearTest {
    @Test
    void create() {

        Year year1 = Year.now();
        Year year2 = Year.of(1980);
        Year year3 = Year.parse("2020");

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        System.out.println("------");

        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(1980, Month.JUNE);
        YearMonth yearMonth3 = YearMonth.parse("2020-09");

        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);
        System.out.println("------");
    }

    @Test
    void name() {
        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year.atMonth(Month.JUNE).atDay(19);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    @Test
    void get() {

        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();


    }
}
