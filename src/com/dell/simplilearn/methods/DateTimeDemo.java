package com.dell.simplilearn.methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {

        System.out.println("local date ----------------------------------------------");

        LocalDate todayLocal = LocalDate.now();
        System.out.println("local date = " + todayLocal);
        LocalDate todayWithZoneId = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("local date zoned = " + todayWithZoneId);

        System.out.println("local date Time-----------------------------------------");

        LocalDateTime todayLocalDateTime = LocalDateTime.now();
        System.out.println("local date = " + todayLocalDateTime);
        LocalDateTime todayLocalDateTimeWithZoneId = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("local date zoned = " + todayLocalDateTimeWithZoneId);

        System.out.println("local date Period----------------------------------------");

        LocalDate localDate1 = LocalDate.of(2016, 6, 16);
        System.out.println("local date = " + localDate1);

        LocalDate localDate2 = LocalDate.of(2017, 10, 15);
        System.out.println("local date 1 = " + localDate2);

        Period period = Period.between(localDate1, localDate2);
        System.out.println("16-June-2016 to 15-September-2017 : Years ("
                + period.getYears() + ")"
                + ", Months (" + period.getMonths() + ")"
                + ", Days (" + period.getDays() + ")");


        System.out.println("local date Formatter----------------------------------------");

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:24:mm:ss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MMM/YYYY");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String formatter1 = dateTimeFormatter1.format(zonedDateTime);
        String formatter2 = dateTimeFormatter2.format(zonedDateTime);
        String formatter3 = dateTimeFormatter3.format(zonedDateTime);

        System.out.println("fomatter1 = " + formatter1);
        System.out.println("fomatter2 = " + formatter2);
        System.out.println("fomatter3 = " + formatter3);

    }


}
