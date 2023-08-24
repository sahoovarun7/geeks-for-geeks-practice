package com.practice.programs.searching;

/**
 * Find the last-occurrence in the sorted-array
 * with O(log n) time
 */
public class LastOccurrenceInSortedArray {


    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,20,30};
        int index = findLast(arr,20);
        System.out.println("index : "+index);
    }

    private static int findLast(int arr[],int element){

        int start = 0, end = arr.length-1;
        int searchIndex = -1;
        while(start <= end){
            int mid = (start + end) /2;
            if(arr[mid] < element){
                start = mid +1;
            }else if (arr[mid] > element){
                end = mid-1;
            }else{
                // This check is to find first occurrence, if mid is 0, means its the first element,
                //if the previous element is not equal to current-element then also its the first occurrence
                if(mid == arr.length-1 || arr[mid +1] != element){
                    return mid;
                }else{
                    start = mid +1;
                }
            }

        }
        return searchIndex;
    }
}
