package com.practice.programs.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWith1 {

    public static void main(String[] args) {
        List<Integer> nums = CommonUtil.generateFirstN(5000000);
        long startTime = System.currentTimeMillis();
        findStartWith1(nums);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.print("Total time : "+timeTaken);
        //CommonUtil.printNums(findStartWith1(nums));
    }

    private static List<Integer> findStartWith1(List<Integer> nums){


        Stream<String> strNums = nums.parallelStream().map(each -> each + "");
        Stream<String> filtered_result = strNums.filter(each -> each.startsWith("1"));
        List<Integer> result = filtered_result.map(each -> Integer.parseInt(each)).collect(Collectors.toList());
        return result;
    }
}
