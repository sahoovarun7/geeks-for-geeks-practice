package com.practice.programs.arrays;

import java.util.Arrays;

/**
 * Remove duplicates from a sorted array.
 * GFG link : https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
 *
 * Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array
 * and return the new size of the array.
 *
 * Examples:
 *
 * Input: arr[] = {2, 2, 2, 2, 2}
 * Output: size = 1
 *
 * Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
 * Output: size = 5
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        //int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int arr[] = {10, 20, 20, 30, 30, 30};
        int size = distinctArr(arr);
        System.out.println("Size is : "+size);
        Arrays.stream(arr).forEach(each -> System.out.print(each+" "));

    }

    static int distinctArr(int arr[]){

        int res= 1;
        for(int i=1;i<arr.length;i++){
            if(arr[res -1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }


}
