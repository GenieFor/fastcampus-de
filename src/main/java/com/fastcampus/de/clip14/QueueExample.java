package com.fastcampus.de.clip14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());

        queue.offer(2);
        queue.offer(4);
        queue.offer(6);

        int lastSizeOfQueue = queue.size();
        for (int i=0; i<lastSizeOfQueue; i++)
        {
            queue.poll();
        }

        System.out.println(queue.isEmpty());
        System.out.println(queue);
    }
}
