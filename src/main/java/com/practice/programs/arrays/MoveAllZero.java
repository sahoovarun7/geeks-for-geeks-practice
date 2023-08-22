package com.practice.programs.arrays;

/**
 * Move all zeroes to the end.
 * GFG link : https://www.geeksforgeeks.org/move-zeroes-end-array/
 *
 * Given an array of random numbers,
 * Push all the zero’s of a given array to the end of the array.
 * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 * it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 * The order of all other elements should be same.
 * Expected time complexity is O(n) and extra space is O(1).
 *
 */
public class MoveAllZero {

    public static void main(String[] args) {

        //int arr[] = {8,5,0,10,0,20};
       // int arr[] = {0,0,0,0,0};
       // int arr[] = {8,5,0,10,0,0};
        int arr[] = {0,0,0,10,0};
        moveAllZeroes(arr);
    }

    /**
     * This method will move all the zeroes to the end of the array
     * @param arr
     */
    static void moveAllZeroes(int[] arr){

        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            if(arr[low] == 0 && arr[high] != 0){
                arr[low] = arr[high];
                arr[high] = 0;
                high--;
                low++;
            }else if(arr[low] == 0 && arr[high] == 0){
                high--;
            }else{
                low++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
