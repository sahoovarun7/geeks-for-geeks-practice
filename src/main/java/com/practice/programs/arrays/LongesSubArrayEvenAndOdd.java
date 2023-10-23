package com.practice.programs.arrays;

public class LongesSubArrayEvenAndOdd {

    public static void main(String[] args) {
        int arr[] = {74,80,8,13,37,49,20,6};
        int op = maxEvenOddAlt(arr,8);
        System.out.println(op);
    }

    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int res=1,curr=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res=Math.max(res,curr);
            }else{
                curr=1;
            }
        }
        return res;
    }

    private static boolean isEven(int num){
        return num % 2 == 0 ? true : false;
    }

    public static int maxEvenOddAlt(int arr[], int n)
    {
        int max_till_now = 1;
        int ans = 1;
        for(int i=0;i<n-1;i++){
            if((isEven(arr[i]) && isEven(arr[i+1])) ||
                    (!isEven(arr[i]) && !isEven(arr[i+1]))){
                max_till_now = 1;
            }else{
                max_till_now += 1;
                ans = Math.max(ans,max_till_now);
            }
        }
        return ans;
    }


}
