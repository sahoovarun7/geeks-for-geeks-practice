package com.practice.programs.arrays;

/**
 * GFG DSA self-paced, topic-arrays
 */
public class MaximumCircularSubArraySum {

    public static void main(String[] args) {

       // int[] arr = {5,-2,3,4};
        int[] arr = {8,-8,9,-9,10,-11,12};
        int max = findMaximumCircularSum(arr);
        System.out.println("Max : "+max);
    }
    private static int findMaximumCircularSum(int arr[]){

        int maxLinear = arr[0];
        int minLinear = arr[0];
        int totalSum = arr[0];

        int max_so_far = arr[0];
        for(int i =1;i<arr.length;i++){
            maxLinear = Math.max(maxLinear,maxLinear+arr[i]);
            max_so_far = Math.max(max_so_far,maxLinear);
            minLinear = Math.min(minLinear,minLinear+arr[i]);
            totalSum += arr[i];
        }

        int maxCircularSum = Math.max(max_so_far,totalSum-minLinear);
        return maxCircularSum;
    }
}
