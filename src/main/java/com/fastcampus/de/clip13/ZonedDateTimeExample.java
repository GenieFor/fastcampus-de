package com.fastcampus.de.clip13;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId);
        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
        System.out.println(ZonedDateTime.parse("2022-11-26T15:10:03.117971+09:00[Asia/Seoul]"));

        /* ZoneOffset은 고정시차를 적용하게해줌 */
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);

        ZoneOffset offset2 = ZoneOffset.of("+05:00");
        OffsetDateTime offset2DateTime = OffsetDateTime.of(localDateTime, offset2);
        System.out.println(offset2DateTime);
    }
}
