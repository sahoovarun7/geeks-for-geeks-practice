package com.practice.programs.arrays;

import java.util.Arrays;

/**
 *Given an array of N non-negative integers arr[], representing an elvation map where width of
 * each bar is 1, compute how much water is able to trap after rain.
 *
 */
public class TrappingRainWater {

    public static void main(String[] args) {
      //  int arr[] = {3,1,5,2,4};
        int arr[] = {3,0,2,0,4};
        int waterCollected = getWater(arr);
        System.out.println("Water collected : "+waterCollected);
    }

    /**
     * Compute lMax array to capture the local-maxima at each point from left.
     * Compute rMax array to capture the local-maxima at each point from right.
     *
     * now at each index, the waterTapped can be min(lmax,rmax) - arr[i] ,
     * this value has to accumulated till n is reached.
     * @param arr
     */
    static int getWater(int[] arr){

        int lmax[] = new int[arr.length];
        lmax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
                lmax[i] = Math.max(arr[i],lmax[i-1]);
        }

        int rmax[] = new int[arr.length];
        rmax[arr.length-1] = arr[arr.length-1];
        for(int j = arr.length-2;j>=0;j--){
            rmax[j] = Math.max(arr[j],rmax[j+1]);
        }

        int waterCollection = 0;
        for(int i=1;i<arr.length-1;i++){

            waterCollection += Math.min(lmax[i],rmax[i]) - arr[i];
        }
        return waterCollection;

    }
}
