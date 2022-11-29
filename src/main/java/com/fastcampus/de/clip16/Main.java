package com.fastcampus.de.clip16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Korea", "Japan", "China", "France", "England"));

//        Stream<String> stream = stringList.stream();
//        stream.map(Main::logic)
//                .forEach(System.out::println);

//        Stream<String> stream2 = stringList.stream();
//        stream2.map(Main::logic)
//                .forEach(System.out::println);

        /*
            람다식의 안좋은 예시 코드
            항상 람다를 사용하는게 좋은 것은 아니라는 예시 중 한가지
        */
        Stream<String> errorStream = stringList.stream();
        errorStream.map(Main::logic).map((str) ->
                        new ArrayList<>(Arrays.asList(str)).stream()
                                .map(String::toLowerCase).map((nextStr) -> {
                                    System.out.println("inner lambda");
                                    if ("korea".equals(nextStr)) {
                                        throw new RuntimeException("error");
                                    }
                                    return nextStr;
                                }).findFirst())
                .collect(Collectors.toList());
    }

    public static String logic(String param)
    {
        System.out.println(param);
        System.out.println("logic");
        return param.toUpperCase();
    }

}
