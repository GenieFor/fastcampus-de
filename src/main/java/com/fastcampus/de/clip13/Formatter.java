package com.fastcampus.de.clip13;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatter {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.APRIL, 25, 6, 30);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));

        // [NOTE] FULL이랑 LONG 사용한 경우 zonId 관련 에러 났음
//        System.out.println(
//            localDateTime
//                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
//                .withLocale(Locale.KOREA)
//        ));
        System.out.println(
            localDateTime
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.KOREA)
        ));
        System.out.println(
            localDateTime
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(Locale.KOREA)
        ));

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy//MM//dd HH::mm::ss")));
    }
}
