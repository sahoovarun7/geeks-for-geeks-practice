package com.practice.programs.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {

    public static void main(String[] args) {
        int arr[] = {14,10,4,6,5,2};
        //printLeaders(arr,arr.length);
        List<Integer> resultList = leaders(arr,arr.length);
        resultList.forEach(each -> System.out.print(each+" "));
    }

    static void printLeaders(int arr[], int n){
        int leader = arr[n-1];
        System.out.print(leader+" ");
        for(int i=n-2; i>=0 ; i--){
            if(arr[i] > leader){
                leader = arr[i];
                System.out.print(leader+" ");
            }
        }
    }

    static ArrayList<Integer> leaders(int arr[],int n){
        ArrayList<Integer> resultList = new ArrayList<>();
        leaders(arr,n-1,arr[n-1],resultList);
        return resultList;
    }

    static void leaders(int arr[],int n,int max,ArrayList<Integer> resultList){
        if(n== -1)
            return;
        if(arr[n] >= max){
            max = arr[n];
            leaders(arr,n-1,max,resultList);
            resultList.add(arr[n]);
        }else{
            leaders(arr,n-1,max,resultList);
        }
    }
}
