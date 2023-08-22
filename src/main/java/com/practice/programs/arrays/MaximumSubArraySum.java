package com.practice.programs.arrays;

/**
 * Kadane's Algorithm.
 */
public class MaximumSubArraySum {

    public static void main(String[] args) {

      //  int arr[] = {2,3,-8,7,-1,2,3};
        int arr[] ={1,2,3,-2,5};
        long max = maxSum(arr);
        System.out.println("Max sum : "+max);
    }

    static long maxSum(int arr[]){

        long max = arr[0];
        long result = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(max + arr[i],arr[i]);
            result = Math.max(result,max);
        }
        return result;
    }
}
