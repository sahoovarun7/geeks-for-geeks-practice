package com.practice.programs.strings;

import java.util.HashSet;
import java.util.Set;

public class StringCounting {

    public static void main(String[] args) {
        StringCounting counting = new StringCounting();
        long count = counting.countStrings("abcdefghi");
        System.out.println("Count value : "+count);
    }

    public long countStrings(String s) {

        HashSet<String> dataset = new HashSet<>();
        findReverseString(s,dataset,0);
        return dataset.stream().count();

    }

    private void findReverseString(String str, HashSet<String> dataset,int start){

        if(start == str.length()){
            dataset.add(str);
            return;
        }
        dataset.add(str);
        for(int i= start ; i< str.length();i++){
          str = performReverse(str,i,str.length());
          findReverseString(str,dataset,start+1);
            performReverse(str,i,str.length());
        }
    }

    private String performReverse(String str, int i, int length) {
        String subString = str.substring(i,length);
        StringBuilder sb = new StringBuilder(subString);
        subString = sb.reverse().toString();
        str = str.substring(0,i) + subString;
        return str;
    }


}
