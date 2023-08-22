package com.practice.programs.potd;

/**
 *
 *
 * Given a matrix of order nxm,
 * composed of only 0's and 1's, find the number of 1's
 * in the matrix that are surrounded by an even number (>0) of 0's.
 * The surrounding of a cell in the matrix is defined as the elements above,
 * below, on left, on right as well as the 4 diagonal elements around the
 * cell of the matrix. Hence, the surrounding of any matrix elements is composed
 * of 8 elements. Find the number of such 1's.
 *
 *
 */
public class SurroundThe1 {

    public static void main(String[] args) {

        int matrix[][] = { {1,0,1,0,1,1,1,0,0,1,0,1,0},
                {1,0,0,1,0,0,1,1,1,1,1,1,0},
                {1,0,0,0,1,1,0,1,1,0,1,0,1},
                {0,1,0,1,1,0,1,0,1,1,0,1,0},
                {0,1,0,1,1,1,0,1,0,0,0,0,1},
                {0,0,0,1,1,0,1,0,1,1,0,0,0},
                {0,0,1,1,0,0,0,0,0,1,0,1,1},
                {1,0,1,0,1,1,0,0,1,0,1,0,1},
                {0,1,1,0,0,1,1,1,0,0,0,1,1},
                {1,1,1,1,1,0,0,0,1,1,0,0,1},
                {1,1,0,1,0,0,1,1,0,1,0,1,0},
                {1,1,1,1,0,1,1,1,0,0,1,1,0}};

        int finalCount = Count(matrix);
        System.out.println("count is : "+finalCount);
    }

    public static int  Count(int[][] matrix)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int counter = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 1){
                    if(isSurroundedByEven0(i,j,matrix,n,m))
                        counter++;
                }
            }
        }
        return counter;
    }

    private static boolean isSurroundedByEven0(int row,int column,int[][] matrix,int n,int m){
        int count = 0;
        if(row-1 >= 0 && column -1 >= 0){
            int val = matrix[row-1][column-1];
            count = val == 0 ? count+1 : count;
        }
        if(row-1 >= 0){
            int val = matrix[row-1][column];
            count = val == 0 ? count+1 : count;
        }
        if(row - 1 >= 0 && column+1 <= m-1){
            int val = matrix[row-1][column+1];
            count = val == 0 ? count+1 : count;
        }
        if(column-1 >= 0){
            int val = matrix[row][column-1];
            count = val == 0 ? count+1 : count;
        }
        if(column+1 <= m-1){
            int val = matrix[row][column+1];
            count = val == 0 ? count+1 : count;
        }
        if (row + 1 <= n-1 && column - 1 >= 0) {
            int val = matrix[row+1][column-1];
            count = val == 0 ? count+1 : count;
        }
        if(row + 1 <= n-1){
            int val = matrix[row+1][column];
            count = val == 0 ? count+1 : count;
        }
        if(row+1 <= n-1 && column+1 <= m-1){
            int val = matrix[row+1][column+1];
            count = val == 0 ? count+1 : count;
        }

        return count != 0 && count %2 == 0 ? true : false;
    }
}
