package com.practice.programs.searching;

public class Counts1inSortedBinaryArray {

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,1};
        int op = count1(arr);
        System.out.println("Output : "+op);
    }

    public static int count1(int arr[]){

        int start = 0, end =arr.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == 0 ){
                start = mid+1;
            }else{
                if(mid == 0 || arr[mid-1] == 0)
                    return (arr.length-mid);
                else
                    end = mid-1;
            }
        }
        return 0;
    }
}
