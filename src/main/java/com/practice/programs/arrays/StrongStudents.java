package com.practice.programs.arrays;

import java.util.Arrays;

/**
 * Strong students GFG
 */
public class StrongStudents {

    public static void main(String[] args) {

        int arr[] = {5, 8, 40, 11, 15};
        int diffSum = diffSum(arr.length,2,arr);
        System.out.println("Diff : "+diffSum);
    }

    public static int diffSum(int n,int m,int arr[])
    {
        Arrays.sort(arr);
        int minSum = 0;
        for(int i=0;i<m;i++){
            minSum += arr[i];
        }

        int maxSum = 0;
        for(int i=n-1;i>= (n-m);i--){
            maxSum += arr[i];
        }
        return maxSum - minSum;
    }
}
