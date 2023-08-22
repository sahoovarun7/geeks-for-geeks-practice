package com.practice.programs.recursion;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sum of subset count.
 *
 * For a given subset,
 * find the all the subset whose sum is equal to the given input of 'sum'
 *
 * i/p : {10,5,2,3,6}
 * sum = 8,
 *
 * o/p : 2
 *
 */
public class SubsetSum {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(5);
        input.add(2);
        input.add(3);
        input.add(6);

        /*List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(3);*/

        int sum = 8;

        int count = subsetCount(input,sum,"",0);
        System.out.println("Total count of the subset is :  "+count);
    }

    static int subsetCount(List<Integer> input,int sum,String subsetBuilder,
                           int height){

        if(height == input.size()){
            double currentSum = calculateSum(subsetBuilder);
            if(currentSum == sum)
               return 1;
            else
                return 0;
        }

        return
        subsetCount(input,sum,subsetBuilder,height+1) +
        subsetCount(input,sum,subsetBuilder + input.get(height) + ",",height+1);

    }

    private static double calculateSum(String subsetBuilder) {

        double sum = 0;

        if(subsetBuilder.isBlank())
            return sum;

        String[] eachInt = subsetBuilder.split(",");

        for(String eachValue : eachInt)
            sum += Double.parseDouble(eachValue);
        return sum;
    }


}
