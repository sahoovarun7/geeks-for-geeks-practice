package com.practice.programs.arrays;

import java.util.ArrayList;
import java.util.List;

public class RopeCutting {

    public static void main(String[] args) {
        //int arr[] = {5,1,6,9,8,11,2,2,6,5};
        int arr[] = {5, 1, 1, 2, 3, 5};
        List<Integer> dataSet = new ArrayList<>();
        ropeCutting(arr,arr.length,dataSet);
    }

    static void ropeCutting(int arr[],int ropeLeft,List<Integer> dataSet){
        if(ropeLeft <= 1){
            return;
        }
        int smallest = findSmallest(arr);
        if(smallest == 0)
            return;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[i] = arr[i] - smallest;
                    if(arr[i] == 0){
                        count++;
                    }
            }
        }
        ropeLeft = ropeLeft - count;
        if(ropeLeft != 0)
            dataSet.add(ropeLeft);
        ropeCutting(arr,ropeLeft,dataSet);
    }

    private static int findSmallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] < small && arr[i] != 0)
                small = arr[i];
        }
        return small;
    }
}
