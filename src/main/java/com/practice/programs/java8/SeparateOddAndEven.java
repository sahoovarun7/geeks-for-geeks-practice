package com.practice.programs.java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddAndEven {

    public static void main(String[] args) {

       List<Integer> nums =  CommonUtil.getDummyArrays();
        separateListByPartitioning(nums);
    }

    void separateEvenAndOdd(List<Integer> nums){

        List<Integer> evenNums =  nums.stream().filter(each -> each % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNums =  nums.stream().filter(each -> each % 2 != 0).collect(Collectors.toList());

        System.out.println("printing total nums");
        nums.stream().forEach(each->System.out.print(each+" "));
        System.out.println("printing even nums");
        evenNums.stream().forEach(each->System.out.print(each+" "));
        System.out.println("printing odd nums");
        oddNums.stream().forEach(each->System.out.print(each+" "));


    }
    static void separateListByPartitioning(List<Integer> nums){
        Map<Boolean,List<Integer>> map =
                nums.stream().collect(Collectors.partitioningBy(each -> each % 2 == 0));
        Set<Map.Entry<Boolean,List<Integer>>> entrySet = map.entrySet();
        for(Map.Entry<Boolean,List<Integer>> each : entrySet){

            if(each.getKey()){
                System.out.println("Even nums ");
            }else{
                System.out.println("Odd nums ");
            }
            List<Integer> ans = each.getValue();
            ans.stream().forEach(num -> System.out.print(num+ " "));
            System.out.println();
        }
    }

}
