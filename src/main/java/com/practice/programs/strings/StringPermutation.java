package com.practice.programs.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {

        ArrayList<String> dataset = new ArrayList<>();
        String str = "ABSG";
        StringPermutation obj = new StringPermutation();
        obj.permute(str,0,str.length(),dataset);
        Collections.sort(dataset, String.CASE_INSENSITIVE_ORDER);
        dataset.forEach(each -> System.out.print(each.toString()+" "));
    }

    void permute(String s, int l, int r, List<String> permuteList){
        if(l == r-1){
            permuteList.add(s);
            return;
        }
        for(int i=l;i<r;i++){
            s = swapString(s,l,i);
            permute(s,l+1,r,permuteList);
            s = swapString(s,i,l);
        }
    }

    private String swapString(String s, int l, int r) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l];
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }
}
