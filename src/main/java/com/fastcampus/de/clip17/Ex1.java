package com.fastcampus.de.clip17;

import com.fastcampus.de.clip7.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Seoul");
        list.add("Busan");
        list.add("Sokcho");
        list.add("Seoul");

        System.out.println(list);

        List<String> result = list.stream().limit(2).collect(Collectors.toList());

        System.out.println(result);
        System.out.println(list);

        List<String> resultList = list.stream().filter("Seoul"::equals).collect(Collectors.toList());
        Set<String> resultSet = list.stream().filter("Seoul"::equals).collect(Collectors.toSet());

        System.out.println(resultList);
        System.out.println(resultSet);

    }
}
