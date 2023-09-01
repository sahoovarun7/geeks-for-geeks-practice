package com.practice.programs.potd;

import java.util.ArrayList;

/**
 *
 * Given a 2D grid of n*m of characters and a word,
 * find all occurrences of given word in grid. A word can be matched
 * in all 8 directions at any point. Word is said to be found in a
 * direction if all characters match in this direction (not in zig-zag form).
 * The 8 directions are, horizontally left, horizontally right, vertically up,
 * vertically down, and 4 diagonal directions.
 *
 * Note: The returning list should be lexicographically smallest.
 * If the word can be found in multiple directions starting from the same
 * coordinates, the list should contain the coordinates only once.
 *
 *
 * Input:
 * grid = {{a,b,c},{d,r,f},{g,h,i}},
 * word = "abc"
 * Output:
 * {{0,0}}
 * Explanation:
 * From (0,0) we can find "abc" in horizontally right direction
 *
 *
 * Input:
 * grid = {{a,b,a,b},{a,b,e,b},{e,b,e,b}}
 * word = "abe"
 * Output:
 * {{0,0},{0,2},{1,0}}
 * Explanation:
 * From (0,0) we can find "abe" in right-down diagonal.
 * From (0,2) we can find "abe" in left-down diagonal.
 * From (1,0) we can find "abe" in horizontally right direction.
 *
 *
 */
public class StringInGrid {

    public static void main(String[] args) {

        //char[] [] grid = {{'a','b','a','b'},{'a','b','e','b'},{'e','b','e','b'}};
        char[] [] grid = getCharInput();
        String word = "dee";
        int[][] result = searchWord(grid,word);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] searchWord(char[][] grid, String word)
    {

        StringInGrid obj = new StringInGrid();
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                obj.containsWord(word,i,j,grid,result);
            }
        }
        int[][] resultArr = new int[result.size()][2];
        for (int i=0;i< result.size();i++) {
            String[] split = result.get(i).split(" ");
            resultArr[i][0] = Integer.parseInt(split[0]);
            resultArr[i][1] = Integer.parseInt(split[1]);
        }
        return resultArr;
    }

    private void containsWord(String word, int row, int column, char[][] grid,
                                        ArrayList<String> result) {
        int k = word.length()-1;
        int rowSize = grid.length;
        int columnSize = grid[0].length;

        if(isValid(row-k,column-k,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row-i][column-i]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row-k,column,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row-i][column]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row-k,column+k,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row-i][column+i]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row,column-k,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row][column-i]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row,column+k,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row][column+i]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row+k,column-k,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row+i][column-i]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row+k,column,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row+i][column]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }
        if(isValid(row+k,column+k,rowSize,columnSize)){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<=k;i++){
                str.append(grid[row+i][column+i]);
            }
            String currWord = str.toString();
            isValidWord(result,word,currWord,row,column);
        }


    }

    private void isValidWord(ArrayList<String> result, String word, String currWord,int row,int column) {
        if(currWord.equals(word) && !result.contains(column+" "+row) && !result.contains(row+" "+column)){
            result.add(row+" "+column);
        }
    }

    private boolean isValid(int row,int column,int rowSize,int columnSize){
        if(row >=0 && row <rowSize && column >= 0 && column <columnSize)
            return true;
        else return false;
    }

    private static char[][] getCharInput(){

        String input = "cadbcccabec\ndeaddadeaea\nceeeaddadaa\nddeeecbcbeb\ncaedaddcbcc\ndddceddeadb\nbecbbdebeaa\nedceedddebb\nacceeaabaab\ncbbcbacecab";

        String[] rows = input.split("\n");

        char[][] charArray = new char[10][11];
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                charArray[i][j] = rows[i].charAt(j);
            }
        }
        return charArray;

    }
}
