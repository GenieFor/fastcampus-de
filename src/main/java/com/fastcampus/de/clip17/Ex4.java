package com.fastcampus.de.clip17;

import java.util.Arrays;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = numArr.stream()
//                        .reduce(0, Integer::sum);
                        .reduce(0, Ex4::sum);

        System.out.println(result);
    }

    public static int sum(int a, int b)
    {
        System.out.println("a = " + a + ", b = " + b);
        return a + b;
    }
}
