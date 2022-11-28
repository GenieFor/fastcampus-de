package com.fastcampus.de.clip13;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2022, 7, 10);
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));

        /* 방법1 */
        int five = Period.between(initialDate, finalDate).getDays();
        System.out.println(five);

        /* 방법2 */
        System.out.println(ChronoUnit.DAYS.between(initialDate, finalDate));
    }
}
