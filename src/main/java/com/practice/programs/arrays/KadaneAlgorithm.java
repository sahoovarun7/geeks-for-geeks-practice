package com.practice.programs.arrays;

import java.util.List;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-9};
        int[] nrr = {-6,-7,-2,-4,-5};
        int op = max(arr);
        System.out.println(op);
    }

    private static int max(int[] arr){

        int max_till_now = arr[0];
        int max = arr[0] ;
        for(int i = 1; i< arr.length;i++){
            max_till_now = Math.max(max_till_now + arr[i],arr[i]);
            max = Math.max(max_till_now,max);
        }
        return max;
    }
}
