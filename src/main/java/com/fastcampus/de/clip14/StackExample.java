package com.fastcampus.de.clip14;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.contains(5));
        System.out.println(stack.contains(7));

        // stack이 뒤에서부터 하나씩 줄어들면서 i 가 증가함에 따라 중간에서 만남
        for (int i=0; i<stack.size(); i++)
        {
            stack.pop();
        }

        // 위에 문제 해결하는 for문 방식
//        int lastSizeOfStack = stack.size();
//        for (int i=0; i<lastSizeOfStack; i++)
//        {
//            stack.pop();
//        }

        System.out.println(stack);
    }
}
