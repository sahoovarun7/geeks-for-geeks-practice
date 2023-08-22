package com.practice.programs.stack;

import java.util.Stack;

/**
 * Reverse a stack using recursion
 *
 * You are given a stack St. You have to reverse the stack using recursion.
 *
 * Input:
 * St = {3,2,1,7,6}
 * Output:
 * {6,7,1,2,3}
 *
 */
public class ReverseAStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //8 6 8 9 3 1 3 9 6 8
        stack.add(8);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        stack.add(3);
        stack.add(1);
        stack.add(3);
        stack.add(9);
        stack.add(6);
        stack.add(8);
        reverseProcess(stack);
    }

    static void reverseProcess(Stack<Integer> s){
        if(s.size() == 0)
            return;
        Integer value = s.pop();
        System.out.print(value+" ");
        reverseProcess(s);
    }


}
