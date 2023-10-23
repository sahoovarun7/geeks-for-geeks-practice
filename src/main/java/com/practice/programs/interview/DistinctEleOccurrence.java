package com.practice.programs.interview;

import java.util.HashSet;
import java.util.Set;

public class DistinctEleOccurrence {

    public static void main(String[] args) {

        //String inputName = "My name is granar";
        //String inputName = "My name is egt";
        String inputName = "a a a a a a a";
        int op = count(inputName,"a");
        System.out.println(op);

    }

    private static int count(String input1,String input2){

        int ans = -1;
        int max_till_now = -1;
        char match = input2.charAt(0);
        Set<Character> hs = new HashSet<>();
        char[] ch = input1.toCharArray();

        for(int i=0;i<ch.length;){
            if(ch[i] == match){
                hs.add(match);
                while(i < ch.length){
                    if(ch[i] == match){
                        ans = Math.max(ans,max_till_now);
                        max_till_now = 0;
                    }
                    if(ch[i] != ' '){
                        boolean isUnique = hs.add(ch[i]);
                        if(isUnique){
                            max_till_now += 1;
                        }
                    }
                    i++;
                }
            }
            if(i == ch.length)
                break;
            i++;
        }
        return ans == 0 ? -1 : ans;
    }

}
