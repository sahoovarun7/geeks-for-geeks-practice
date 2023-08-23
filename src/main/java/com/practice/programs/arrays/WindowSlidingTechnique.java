package com.practice.programs.arrays;

public class WindowSlidingTechnique {

    public static void main(String[] args) {

        int arr[] = {1,8,30,-5,20,7};
        int k =3;
        int max = maxSumAlgo(arr,k);
        System.out.println("Max sum is : "+max);
    }

    /**
     * Naive solution
     *
     * @param arr
     * @param k
     * @return
     */
    private static int maxSum(int[] arr,int k){

        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            int currentSum = 0;
            for(int j=i;j<i+k && j<arr.length;j++){
                currentSum += arr[j];
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }

    /**
     * By linear algorithm;
     * Add the next ele of (i+k) and Remove the previous ele (i-1) & iterate this from i=0 to n-k
     *
     */

    private static int maxSumAlgo(int arr[],int k){
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int maxSum =  sum;

        for(int i=1;i< (arr.length - k) ; i++){
             sum = (sum - arr[i-1]) + arr[i+k-1];
             maxSum = Math.max(sum,maxSum);
        }
        return  maxSum;
    }

}
