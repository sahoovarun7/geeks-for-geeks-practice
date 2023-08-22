package com.practice.programs.recursion;

import java.util.*;

/**
 * Power Set in Lexicographic order
 *
 * Input : abc
 * Output : a ab abc ac b bc c
 *
 * GFG link : https://www.geeksforgeeks.org/powet-set-lexicographic-order/
 *
 */

public class powerSetLexicographical {

    public static void main(String[] args) {

        List<String> list =  powerSet("abc");
        System.out.println(list);
    }


    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> powerSetList = new ArrayList<>();
        generateAllSubset(powerSetList,s,0,"");
         Collections.sort(powerSetList, String.CASE_INSENSITIVE_ORDER);
        return powerSetList;

    }

    static void  generateAllSubset(ArrayList<String> powerSetList, String inputString,int index,String currentValue){
        if(index == inputString.length()){
            powerSetList.add(currentValue);
            return;
        }
        generateAllSubset(powerSetList,inputString,index+1,currentValue);
        generateAllSubset(powerSetList,inputString,index+1,currentValue + inputString.charAt(index));
    }
}
