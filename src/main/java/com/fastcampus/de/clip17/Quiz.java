package com.fastcampus.de.clip17;

import java.util.Arrays;
import java.util.List;

public class Quiz {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        long count = names.stream()
                        .filter(name -> name.startsWith("이"))
                        .count();

        System.out.println(count);
    }
}
