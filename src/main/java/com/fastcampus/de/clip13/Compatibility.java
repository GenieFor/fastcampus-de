package com.fastcampus.de.clip13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Compatibility {

    public static void main(String[] args) {
        /* Date 사용 */
        System.out.println(LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()));

        /* Calendar 사용 */
        System.out.println(LocalDateTime.ofInstant(Calendar.getInstance().toInstant(), ZoneId.systemDefault()));

        System.out.println(Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)));
    }
}
