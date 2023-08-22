package com.practice.programs.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Print Pattern
 *
 * Print a sequence of numbers starting with N where A[0] = N,
 * without using loop, in which  A[i+1] = A[i] - 5,
 * until A[i] > 0. After that A[i+1] = A[i] + 5  repeat it until A[i] = N.
 *
 *
 */
public class PrintPattern {

    public static void main(String[] args) {
       List<Integer> dataset =  new ArrayList<>();
        patternFinder(10,dataset);
        dataset.forEach(each -> System.out.print(each+" "));
    }

    static int print(List<Integer> dataset,int n){
        while(n > 0){
            dataset.add(n);
            n = n-5;
        }
        dataset.add(n);
        return n;
    }

    static void printTillN(List<Integer> dataset,int updatedN,int n){
        while(updatedN ==  n ){
            dataset.add(n);
            n = n+5;
        }
        dataset.add(n);
    }



    private static void patternFinder(int n,List<Integer> dataset) {


        if(n < 0){
            dataset.add(n);
            return;
        }
        dataset.add(n);
        patternFinder(n-5,dataset);
        dataset.add(n);
    }
}
