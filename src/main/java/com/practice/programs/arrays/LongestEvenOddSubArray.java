package com.practice.programs.arrays;

/**
 * Longest even odd sub-array
 */
public class LongestEvenOddSubArray {

    public static void main(String[] args) {

       // int arr[] = {10,12,14,7,8};
        int arr[] = {7,10,13,14};
        int maxVal = longestEvenOdd(arr);

        System.out.println("Maximum value : "+maxVal);
    }

    static int longestEvenOdd(int arr[]){

        int result = 1;
        int currentMax = 1;
        for(int i=1;i<arr.length;i++){
            if(isEven(arr[i]) && !isEven(arr[i-1])){
                currentMax = currentMax + 1;
            } else if (!isEven(arr[i]) && isEven(arr[i-1])) {
                currentMax = currentMax + 1;
            }else{
                currentMax = 1;
            }
            result = Math.max(result,currentMax);
        }
        return result;
    }

    static boolean isEven(int num){

        return num%2 == 0 ? true : false;
    }
}
