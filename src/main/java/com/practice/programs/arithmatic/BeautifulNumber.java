package com.practice.programs.arithmatic;

import java.util.ArrayList;
import java.util.List;

public class BeautifulNumber {

    public static void main(String[] args) {

        BeautifulNumber obj = new BeautifulNumber();
        ArrayList<Integer> dataset = new ArrayList<>();
        boolean isAns = obj.beautifulNumber(19,19,dataset);
        System.out.println("Answer : "+isAns);
    }
    public boolean beautifulNumber(int n, int sum, List<Integer> dataset) {

        sum = findSquareAndSum(sum);
        if(dataset.contains(sum))
            return false;
        if(sum == 1)
            return true;
        else{
            dataset.add(sum);
            return beautifulNumber(n,sum,dataset);
        }

    }

    private int findSquareAndSum(int n) {

        int sum = 0;
        while(n!= 0){
            int digit = n%10;
            sum += Math.pow(digit,2);
            n = n/10;
        }
        return sum;

    }


}
