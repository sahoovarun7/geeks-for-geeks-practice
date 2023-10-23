package com.practice.programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMap {

    public static void main(String[] args) {

        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        List<Object> result = flattenArray(array);
        result.stream().forEach(each -> System.out.print(" "+each));
    }

    static List<Object> flattenArray(Object[] array){

        List<Object> result = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i] instanceof  Object[]){
                List<Object> nestedFlattened =  flattenArray((Object[]) array[i]);
                result.addAll(nestedFlattened);
            }else{
                result.add(array[i]);
            }
        }
        return result;
    }
}
