package com.practice.programs.arrays;


public class WeightedSumQueries {

    public static void main(String[] args) {

        int[] arr = {2,3,5,4,6,1};

        int[] ps = new int[arr.length];
        ps[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i] = ps[i-1] + arr[i]*(i+1);
        }
        int query1 = getWSum(2,3,ps,arr);
        System.out.println("Ans = "+query1);
    }

    static int getWSum(int l,int r, int[] ps, int arr[]){

        if(l == 0)
            return ps[r];
        else
            return ps[r] - ps[l-1];

    }

}
