package com.practice.programs.contest;

/**
 *
 * Given an array arr[ ] consisting of n integers, find the maximum Geek Value of the array to unleash its true potential.
 *
 * Geek value is defined as (arri - arrj) × arrk, where 1 ≤ i < j < k ≤ n.
 *
 *
 * Input :
 * n = 3
 * arr = {4,2,3}
 * Output:
 * 6
 * Explanation:
 * We choose i=1,j=2,k=3 indices {one based indexing}
 * Geek value of array is (arr[i]-arr[j])*arr[k] = (4-2)*3 = 6.
 *
 *
 *
 * Input :
 * n = 5
 * arr = {10,1,4,2,7}
 * Output:
 * 63
 * Explanation:
 * Take indices i=1,j=2 and k=5 {one based indexing}
 * Geek value = (arr[1]−arr[2])×arr[5] = 63.
 *
 *
 *
 */
public class ArrayPotential {


    public static void main(String[] args) {
        int arr[] = {6,7,3,2};
        long maxVal = maxValue(arr.length,arr);
        System.out.println("Final Val = "+maxVal);

    }
    public static long maxValue(int n, int arr[]){

        int maxVal = arr[0];
        int maxDiff = arr[0] - arr[1];
        int lastVisit = 0;

        for(int i=0;i<arr.length-1;i++){

            if(maxVal - arr[i] > maxDiff){

                maxDiff = maxVal - arr[i];
                lastVisit = i;
            }


            if(arr[i] > maxVal){
                maxVal = arr[i];
                lastVisit = i;
            }
        }

        int k = arr[lastVisit+1];
        for(int i=lastVisit+1;i<n;i++){
            k = Math.max(arr[i],k);
        }
        return maxDiff*k;
    }


}
