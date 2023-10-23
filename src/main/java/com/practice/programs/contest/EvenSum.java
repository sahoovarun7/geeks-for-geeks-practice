package com.practice.programs.contest;

import com.practice.programs.java8.CommonUtil;

public class EvenSum {

    public static void main(String[] args) {
        int arr[] = {418291871,915409441,394854293,886194033,299133650,274308560,422753765,288406295,558743371,837695500};
        int ans = findMin(arr,arr.length);
        System.out.println(ans);
    }

    static int findMin(int A[], int n)
    {
        int sum =0;
        int oddCount = 0;
        int evenCount = 0;
        int minEven = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += A[i];
            if(A[i]%2 == 0){
                evenCount++;
                minEven = Math.min(countEven(A[i]),minEven);
            }
            else
                oddCount++;
        }
        if(sum % 2 == 0)
            return 0;
        if(oddCount%2 != 0 && evenCount == 0)
            return -1;
        else
            return minEven;
    }
    static int countEven(int minEven){

        int operation = 0;
        while(minEven %2 == 0){
            minEven = minEven/2;
            operation++;
        }
        return operation;
    }
}
