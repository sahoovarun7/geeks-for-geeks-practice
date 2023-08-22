package com.practice.programs.arrays;

public class MinimumConsecutiveFlips {

    public static void main(String[] args) {

        boolean[] arr = {true,true,false,false,false,true,true};
        minFlip(arr);
    }

    private static void minFlip(boolean[] arr){
        boolean firstChar = arr[0];
        int startIndex = -1;
        int endIndex = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == !firstChar && startIndex == -1){
                startIndex = i;
            }else{
                endIndex = i;
                if(startIndex != -1){
                    System.out.print("From "+startIndex+" to "+endIndex);
                }
                startIndex = -1;
            }
        }
    }
}
