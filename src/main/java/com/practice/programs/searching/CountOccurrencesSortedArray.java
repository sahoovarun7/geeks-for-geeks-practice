package com.practice.programs.searching;

public class CountOccurrencesSortedArray {

    public static void main(String[] args) {

        CountOccurrencesSortedArray obj = new CountOccurrencesSortedArray();
        int arr[]={10,10,10,10,30,40,50};
        int output = obj.countOccurence(arr,10);
        System.out.println("Final output  "+output);
    }

    //TODO : optimised approach is to find the first & last occurrence of the element ,
    //then subtract each.

    public int countOccurence(int arr[],int key){
        return binarySearch(arr,0,arr.length-1,key,-1);
    }

    private int binarySearch(int arr[],int first,int last,int key,int count){

        if(first > last){
            return count;
        }

        if(arr[first] == arr[last] && arr[first] == key && last == arr.length -1)
            return arr.length-1;

        int mid = (first + last) / 2;
        if(arr[mid] == key){
            count++;
        }
        if(arr[mid] == key && arr[mid+1] == key){
             return binarySearch(arr,first,mid-1,key,count) + binarySearch(arr,mid+1,last,key,count);
        }else if(arr[mid] > key){
           return binarySearch(arr,first,mid-1,key,count);
        }else {
           return binarySearch(arr,mid+1,last,key,count);
        }
    }

}
