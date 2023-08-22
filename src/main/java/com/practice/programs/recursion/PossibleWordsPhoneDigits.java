package com.practice.programs.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Possible Words From Phone Digits
 *
 * Given a keypad as shown in the diagram,
 * and an N digit number which is represented by array a[ ],
 * the task is to list all words which are possible by pressing these numbers.
 *
 * Input: N = 3, a[] = {2, 3, 4}
 *
 * Output:
 * adg adh adi aeg aeh aei afg afh afi
 * bdg bdh bdi beg beh bei bfg bfh bfi
 * cdg cdh cdi ceg ceh cei cfg cfh cfi
 *
 *  Explanation: When we press 2,3,4 then
 * adg, adh, adi, ... cfi are the list of
 * possible words.
 *
 *
 */
public class PossibleWordsPhoneDigits {

    public static void main(String[] args) {

        int N = 4;
        int a[]={6,4,5,5};
        List<String> resultList = possibleWords(a,N);
        Collections.sort(resultList,String.CASE_INSENSITIVE_ORDER);
        resultList.forEach(each->System.out.print(each+" "));
    }

    static ArrayList<String> possibleWords(int a[], int N)
    {
        ArrayList<String> allWords = findAllWords(a,N);
        return allWords;
    }

    private static ArrayList<String> findAllWords(int a[], int N) {

        ArrayList<String> resultList = new ArrayList<>();
        List<String> words = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            String set = "";
            if(a[i] == 2){
                set = "abc";
            }else if(a[i] == 3)
                set = "def";
            else if(a[i] == 4)
                set = "ghi";
            else if(a[i] == 5)
                set = "jkl";
            else if(a[i] == 6)
                set = "mno";
            else if(a[i] == 7)
                set = "pqrs";
            else if(a[i] == 8)
                set = "tuv";
            else if(a[i] == 9)
                set = "wxyz";
            words.add(set);
        }

        String set1 = words.get(0);
        String set2 = words.get(1);
        String set3 = words.get(2);
        for(int i=0;i<set1.length();i++){
            for(int j=0;j<set2.length();j++){
                for(int k=0;k<set3.length();k++){
                     String finalStr = "";
                     finalStr = finalStr.concat(String.valueOf(set1.charAt(i))).concat(String.valueOf(set2.charAt(j))).concat(String.valueOf(set3.charAt(k)));
                    resultList.add(finalStr);
                }
            }
        }
        return  resultList;
    }

}
