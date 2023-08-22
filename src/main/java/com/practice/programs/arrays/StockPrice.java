package com.practice.programs.arrays;

public class StockPrice {

    public static void main(String[] args) {
        int stock[] = {1,5,3,8,12};
       int profit = maxProfit(stock);
       System.out.println("Profit : "+profit);
    }

    /**
     * Focus when the price is high, then subtract with the previous value.
     * NOTE : do not consider the DIP, only the peak.
     * @param arr
     */
    static int maxProfit(int arr[]){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }


}
