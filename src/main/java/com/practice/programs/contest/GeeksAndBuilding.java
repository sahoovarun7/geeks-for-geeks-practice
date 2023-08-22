package com.practice.programs.contest;

/**
 *
 * You are given an array heights of n elements whose ith element denotes the height of the ith building. Geek likes to jump from one building to another. He only jumps to the next taller building and stops when he reaches the tallest building.
 * The energy required for this journey is XOR of all the heights of the buildings on which Geek jumps until he stops. Geek can start his journey from any building. Find the maximum energy required before he starts.
 *
 *
 * Input:
 * n = 5
 * heights[] = {3, 1, 4, 5, 6}
 * Output: 7
 * Explanation:
 * If he starts from building 1,
 * required energy = 3 ^ 4 ^ 5 ^ 6 = 4.
 * If he starts from building 2,
 * required energy = 1 ^ 4 ^ 5 ^ 6 = 6.
 * If he starts from building 3,
 * required energy = 4 ^ 5 ^ 6 = 7.
 * If he starts from building 4,
 * required energy = 5 ^ 6 = 3.
 * If he starts from building 5,
 * required energy = 6
 *
 *
 *
 */
public class GeeksAndBuilding {

    public static void main(String[] args) {
        int[] heights = {5,1,6,3,5,2,7,3,9};
       // int[] heights = {3,1,4,5,6};
        long maxEnergy = maximum_energy(5,heights);
        System.out.print("max index : "+maxEnergy);
    }

    public static long maximum_energy(int n, int[] heights) {

        int maxIndex = findMaxIndex(heights);
        int maxEnergy = heights[maxIndex];
        for(int i=0; i<=maxIndex;i++){
            for(int j=i;j<=maxIndex;j++){
                if(heights[j] < heights[j+1]){
                    maxEnergy = Math.max(maxEnergy,maxEnergy^heights[j]);
                }
            }
        }
        return maxEnergy;
    }

    private static int findMaxIndex(int[] heights){
        int maxIndex = 0;

        for(int i=0;i<heights.length;i++){
            if(heights[i] > heights[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }


}
