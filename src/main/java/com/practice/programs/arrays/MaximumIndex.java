package com.practice.programs.arrays;


public class MaximumIndex {

    static int maxIndexDiff(int A[], int N) {

        int maxIndex = 0;
        int i=0;
        for(int j=1;j<N;){
            if(A[j] >= A[i] && j > i){
                maxIndex = j-i > maxIndex ? j-i : maxIndex;
                i++; j = i+maxIndex;
            }else{
                i++; j++;
            }
        }
        return maxIndex;
    }


}
