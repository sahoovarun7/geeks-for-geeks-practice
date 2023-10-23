package com.practice.programs.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a String s,
 * In one operation we can delete any occurences
 * of "geek" as a substring in the String. Find the number of delete operations you have to perform to make the String Empty.
 *
 *
 * Input:
 * s = "geek"
 * Output:
 * 2
 * Explanation:
 * gegeekek
 * We can first delete the bold characters
 * which form "geek", and then delete the
 * remaning string "geek" again from the string.
 * So, we will need 2 operations
 */
public class Runner {

    public static void main(String[] args) {

       /* Integer first = 1;
        Integer second = 2;
        Integer third = 3;

        List<Integer> mylist = new ArrayList<>();
        mylist.add(first);
        mylist.add(second);
        mylist.add(third);

        Stream myStream = mylist.stream();
        int count = 0;
        myStream.map(each -> Math.addExact((Integer)each,2)).collect(Collectors.toList());*/
        int op = makeStringEmpty("gegeekek");
        System.out.println(op);
    }



    static int makeStringEmpty(String s) {

        if(s.length() == 0)
            return -1;

        int operation_count = -1;
        int pattern_counter = 0;
        String pattern = "geek";

        for(int i = 0 ; i<s.length();){

            if(s.charAt(i) == pattern.charAt(pattern_counter)){
                i++;
                pattern_counter++;
            }else{
                int count = makeStringEmpty(s.substring(i));
                if(count != -1){
                    operation_count = operation_count + 1;
                    s = s.substring(0,i) + s.substring(i+4);
                }
                else{
                    return -1;
                }
            }

            }

            if(pattern_counter == pattern.length()){
                operation_count ++ ;
                pattern_counter = 0;
            }
        return operation_count == -1 ? -1: operation_count + 1;
        }

    }
