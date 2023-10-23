package com.practice.programs.java8;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> sample = CommonUtil.getDummyListString();
        List<String> unique = removeDups(sample);
        unique.stream().forEach(each -> System.out.println(each));
    }

    static List<String> removeDups(List<String> inputs){
       return inputs.stream().distinct().collect(Collectors.toList());
    }
}
