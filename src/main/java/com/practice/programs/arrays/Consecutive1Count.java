package com.practice.programs.arrays;

public class Consecutive1Count {

    public static void main(String[] args) {

        /*boolean arr[] = {false,true,true,false,true,true,true,false};
        int maxValue = countConsecutive(binaryStr);
        System.out.println("Maximum value is : "+maxValue);*/

        int maxValue = maxConsecutiveOnes(927);

        System.out.println("Maximum consecutive 1s : "+maxValue);

    }

    public static int maxConsecutiveOnes(int N) {

        String binaryString = findBinary(N);
        return countConsecutive(binaryString);
    }

    static String findBinary(int num){

        if(num == 1)
            return "1";
        if(num == 0)
            return "0";

        int digit = num % 2;
        return findBinary(num/2)+ digit;
    }

    static int countConsecutive(String binaryStr){

        int max = 0, consecutiveCount = 0;
        for(int i =0; i <binaryStr.length();i++){
            if(binaryStr.charAt(i) == '0'){
                consecutiveCount=0;
            }else{
                consecutiveCount++;
                max = Math.max(max,consecutiveCount);
            }
        }
       return max;
    }
}
