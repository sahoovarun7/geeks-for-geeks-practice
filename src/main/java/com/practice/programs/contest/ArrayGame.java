package com.practice.programs.contest;

/**
 * You are playing an array game in which you are given two arrays arr and brr, each of size n. Each array is a permutation of n positive integers.
 *
 * In one operation, you can perform either of the following two steps:
 *
 * Rotate the array arr anti-clockwise.
 * Remove the first element of both the arrays if they are the same.
 * Find the minimum number of operations required to make both the arrays empty
 *
 *
 *
 * Input:
 * n = 3
 * arr[] = {1, 2, 3}
 * brr[] = {2, 1, 3}
 * Output:
 * 5
 * Explanation:
 * operation 1: Rotate arr anti-clockwise.
 * It becomes {2, 3, 1}.
 * operation 2: Remove first element {2} from
 * both the arrays. arr = {3, 1} and brr = {1, 3}.
 * operation 3: Rotate arr anti-clockwise. arr = {1, 3}.
 * operation 4: Remove {1} from both the arrays.
 * operation 5: Remove {3} from both the arrays.
 *
 *
 *
 */
public class ArrayGame {

    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int brr[] = {2,1,3};
        int opertaion = min_operations(arr.length,arr,brr);
        System.out.print("opertaion : "+opertaion);
    }


    public static int min_operations(int n, int[] arr, int[] brr) {

        int operation = performOperation(arr,brr,n,0,0);
        return  operation;
    }


    public static int performOperation(int arr[],int[] brr,int n,int startIndex,int opertaion){

        if(startIndex == n){
            return opertaion;
        }

        if(arr[startIndex] == brr[startIndex]){
            opertaion +=1;
            startIndex +=1;
            return performOperation(arr,brr,n,startIndex,opertaion);
        }else{
            arr = rotateArr(arr,startIndex);
            opertaion +=1;
            return performOperation(arr,brr,n,startIndex,opertaion);
        }
    }

    public static int[] rotateArr(int[] arr,int startIndex){
        int startValue = arr[startIndex];
        for(int i=startIndex;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] =startValue;
        return arr;
    }



}
