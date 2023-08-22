package com.practice.programs.arrays;

public class WindowSlidingTechnique {

    public static void main(String[] args) {

        int arr[] = {1,8,30,-5,20,7};
        int k =3;
        int max = maxSum(arr,k);
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


}
