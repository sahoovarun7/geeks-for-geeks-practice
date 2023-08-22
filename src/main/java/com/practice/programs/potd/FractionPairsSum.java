package com.practice.programs.potd;

import java.util.HashMap;

/**
 * GFG links : https://practice.geeksforgeeks.org/problems/fraction-pairs-with-sum-1/1
 *
 * Given a list of N fractions,
 * represented as two lists numerator and denominator,
 * the task is to determine the count of pairs of fractions whose sum equals 1.
 *
 * Input:
 * N = 4
 * numerator = [1, 2, 2, 8]
 * denominator = [2, 4, 6, 12]
 *
 * Output:
 * 2
 *
 */
public class FractionPairsSum {

    public static void main(String[] args) {

        int numerator[] = {1,2,2,8};
        int denominator[] = {2,4,6,12};
        int ans = countFractions(4,numerator,denominator);
        System.out.println("Final answer : "+ans);
    }

    public static int countFractions(int n, int[] numerator, int[] denominator) {

        int answer = 0;
        HashMap<Integer,HashMap<Integer,Integer>> pairMap = new HashMap<>();
        for(int i=0;i<n;i++){
            int currentNum = numerator[i], denomNum = denominator[i];
            int g = gcd(currentNum,denomNum);
            currentNum = currentNum / g;
            denomNum = denomNum/g;

            int complimentary_num = denomNum - currentNum;
            int complimentary_den = denomNum;
            if(pairMap.containsKey(complimentary_num)
                    && pairMap.get(complimentary_num).containsKey(complimentary_den)){
                answer += pairMap.get(complimentary_num).get(complimentary_den);
            }

            if(pairMap.containsKey(currentNum)){
                HashMap<Integer,Integer> hm = pairMap.get(currentNum);
                hm.put(denomNum,hm.getOrDefault(denomNum,0)+1);
            }else{
                HashMap<Integer,Integer> hm = new HashMap<>();
                hm.put(denomNum,1);
                pairMap.put(currentNum,hm);
            }

        }
        return answer;
    }

    private static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }


}


