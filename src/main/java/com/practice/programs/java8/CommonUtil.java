package com.practice.programs.java8;

import java.util.ArrayList;
import java.util.List;

public class CommonUtil {


    public static List<Integer> generateFirstN(int n){
        List<Integer> num = new ArrayList<>();
        for(int i=1;i<=n;i++){
            num.add(i);
        }
        return num;
    }

    public static void printNums(List<Integer> nums){
        nums.stream().forEach(each->System.out.print(each+" "));
    }
}
