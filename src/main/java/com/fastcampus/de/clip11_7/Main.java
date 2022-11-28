package com.fastcampus.de.clip11_7;

public class Main {

    static String LOCAL_STATIC = "local static 예시";

    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1, 2, 3);
        bird.printBreed();
        bird.abstractMethod();

        System.out.println(LOCAL_STATIC);
        System.out.println(Bird.STATIC_VARIABLE);

    }
}
