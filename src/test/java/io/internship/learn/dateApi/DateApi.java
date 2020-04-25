package io.internship.learn.dateApi;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateApi {


    @Test
    public void testDateApi() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // get a date using of() or parse
        System.out.println(LocalDate.of(2020, 02, 14));
        // get tomo
        LocalDate tomo = LocalDate.now().plusDays(1);
        System.out.println(tomo);
        DayOfWeek day = LocalDate.of(2020, 02, 14).getDayOfWeek();
        System.out.println(day);

        // Leap year

        boolean isLeap = LocalDate.now().isLeapYear();
        System.out.println(isLeap);

        // is before || is after

        boolean isBefore = LocalDate.now().isBefore(LocalDate.of(2020, 02, 14));
        boolean isAfter = LocalDate.now().isAfter(LocalDate.of(2020, 02, 14));
        System.out.println(isBefore);
        System.out.println(isAfter);
    }


    @Test
    public void testLocalTime() {
        int localTime = LocalTime.now().getHour();
        System.out.println(localTime);

        // is Before || is After
        boolean isBefore = LocalTime.now().isBefore(LocalTime.of(11, 23));
    }


    @Test
    public void localDateTime() {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

    }


    @Test
    public void testFormat() {
        LocalDate localDate = LocalDate.now();
        localDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
        System.out.println(localDate);
    }
}
