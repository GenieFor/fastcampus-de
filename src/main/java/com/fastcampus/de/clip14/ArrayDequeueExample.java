package com.fastcampus.de.clip14;

import java.util.ArrayDeque;

public class ArrayDequeueExample {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offer(10);
        arrayDeque.offerLast(11);
        arrayDeque.offerFirst(5);
        System.out.println(arrayDeque);

        // pop, poll 둘 다 큐의 앞쪽에 데이터 추출
        arrayDeque.pop();
        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
    }
}
