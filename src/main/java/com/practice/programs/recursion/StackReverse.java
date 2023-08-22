package com.practice.programs.recursion;

public class StackReverse {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        printStack(input,0);
    }

    static void printStack(int[] input,int index){

        if(index == input.length)
            return;
        printStack(input,index+1);
        System.out.print(input[index]+" ");
    }
}
