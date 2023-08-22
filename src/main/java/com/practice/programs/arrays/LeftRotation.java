package com.practice.programs.arrays;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        leftRotate(arr,arr.length);
       // Arrays.stream(arr).forEach(each->System.out.print(each+" "));

        System.out.println(2%5);
    }

    static void leftRotate(int arr[],int n){
        int temp= arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
}
