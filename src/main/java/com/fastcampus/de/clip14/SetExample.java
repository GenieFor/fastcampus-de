package com.fastcampus.de.clip14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("New Yorks");
        stringSet.add("Las Vegas");
        stringSet.add("Seoul");
        System.out.println(stringSet);
        System.out.println(stringSet.contains("LA"));

        List<String> removeTarget = new ArrayList<>();
        removeTarget.add("LA");
        removeTarget.add("Las Vegas");

        stringSet.removeAll(removeTarget);
        System.out.println(stringSet);
        System.out.println(stringSet.contains("LA"));

        stringSet.clear();
        System.out.println(stringSet);
    }
}
