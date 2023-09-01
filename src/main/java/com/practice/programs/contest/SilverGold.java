package com.practice.programs.contest;

public class SilverGold {

    public static void main(String[] args) {

        String str = "11001100";
        boolean flag = false;
        for(int i =0;i<str.length();i++){

            flag = flag ^ Boolean.parseBoolean(String.valueOf(str.charAt(i)));
        }
    }
}
