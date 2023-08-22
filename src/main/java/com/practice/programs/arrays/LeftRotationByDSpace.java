package com.practice.programs.arrays;

import java.util.Arrays;

/**
 *
 * Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
 *
 * Examples:
 *
 * Input:
 * arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
 * Output: 3 4 5 6 7 1 2
 *
 * Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
 * Output: 5 6 7 1 2 3 4
 *
 *
 */
public class LeftRotationByDSpace {

    public static void main(String[] args) {

        /*int arr[] = {10,5,30,15};
        leftRotateByD(arr,arr.length,3);
        Arrays.stream(arr).forEach(each -> System.out.print(each+" "));*/

        int arr[] = {1,2,3,4,5,6,7};
        /*leftRotateByD(arr,arr.length,2);
        Arrays.stream(arr).forEach(each -> System.out.print(each+" "));*/

        LeftRotationByDSpace obj = new LeftRotationByDSpace();
        obj.rotate(arr,3);
    }

    static void leftRotateByD(int arr[],int n,int d){

        int count = 0,position = 0;
        int prevValue = arr[0];

        while(count != n){

            position = positionFinder(position,d,n);
            int temp = arr[position];
            arr[position] = prevValue;
            prevValue = temp;
            count++;
        }

    }

    public void rotate(int[] nums, int k) {

       int newArr[] = new int[nums.length];
       for(int i =0 ;i < nums.length ; i++){
           int position = i-k >= 0 ? i-k : nums.length + (i - k);
           newArr[position] = nums[i];
       }
       nums = newArr;
        Arrays.stream(nums).forEach(each -> System.out.print(each+" "));
    }

    static int positionFinder(int position,int d,int n){

        return position-d >= 0 ? position-d : n + (position - d);
    }
}
