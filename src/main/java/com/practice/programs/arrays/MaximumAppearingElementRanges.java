package com.practice.programs.arrays;

/**
 * GFG arrays topic, video no. 31
 *
 */
public class MaximumAppearingElementRanges {

    public static void main(String[] args) {
        int[] left = {1,2,5,15};
        int[] right = {5,8,7,18};
        int maxIndex = maxAppearing(left,right);
        System.out.println("max index  : "+maxIndex);
    }

    private static int maxAppearing(int[] left,int[] right){
            int freq[] = new int[100];

            for(int i=0;i<left.length;i++){
                freq[left[i]]++;
                freq[right[i]+1]--;
            }
            int maxElement = -1;
            int maxSum =0;
            int currentSum = 0;
            for(int i=0;i<freq.length;i++){
                currentSum += freq[i];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    maxElement = i;
                }
            }
            return  maxElement;
    }


}
