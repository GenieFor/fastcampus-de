package com.fastcampus.de.clip13;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] args) {
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        /* 방법1 */
        System.out.println(Duration.between(initialTime, finalTime).getSeconds());

        /* 방법 2 */
        System.out.println(ChronoUnit.SECONDS.between(initialTime, finalTime));
    }
}
