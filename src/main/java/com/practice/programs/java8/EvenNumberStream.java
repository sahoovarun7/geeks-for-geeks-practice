package com.practice.programs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberStream {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<20;i++){
            numbers.add(i);
        }
        List<Integer> evenNum = findEvenNumbers(numbers);
        evenNum.stream().forEach(each -> System.out.print(each+" "));

    }

    private static List<Integer> findEvenNumbers(List<Integer> numbers){
        return numbers.stream().filter(each -> each %2 ==0).collect(Collectors.toList());
    }
}
