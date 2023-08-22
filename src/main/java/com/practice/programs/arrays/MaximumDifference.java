package com.practice.programs.arrays;

/**
 * Finding maximum difference such that j > i and A[j] > A[i]
 */
public class MaximumDifference {

    public static void main(String[] args) {
        int arr[]= {2,3,10,6,4,8,1};
        int maxDiffValue = maxDiff(arr);
        System.out.println("Max diff : "+maxDiffValue);
    }

    static int maxDiff(int arr[]){
        int minValue = arr[0];
        int result = arr[1] - arr[0];
        for(int i=1;i<arr.length;i++){

            result = Math.max(result,arr[i] - minValue);
            minValue = Math.min(minValue,arr[i]);
        }
        return result;
    }


}
