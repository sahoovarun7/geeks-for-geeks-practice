package com.practice.programs.contest;

import java.util.HashMap;
import java.util.Map;

public class UniqueFlavours {

    public static void main(String[] args) {
        int[] candies = {1,2,2,3,4,3};
        int k =3;
        int ans = maximizeFlavors(candies,k);
        System.out.println("Max flavours : "+ans);
    }

    static int maximizeFlavors(int candies[],int k) {

        if(candies.length == k){
            return 0;
        }

        Map<Integer,Integer> hm = new HashMap<>();
        int totalCount = 0;
        int ans = 0;

        for(int i=0;i<candies.length ; i++){

            if(hm.containsKey(candies[i])){
                hm.put(candies[i],hm.get(candies[i])+1);
            }else{
                hm.put(candies[i],1);
                totalCount++;
            }

        }

        System.out.println("Total count : "+totalCount);

        int start = 0;
        int end = 0;
        int counter = 0;

        while(end < candies.length && counter < k){
            int c = hm.get(candies[end]);
            hm.put(candies[end],c-1);
            if(hm.get(candies[end]) == 0){
                totalCount --;
            }
            end++;
            counter++;
        }
        ans = Math.max(totalCount, ans);
        while(end < candies.length){
            int c = hm.get(candies[start]) ;
            hm.put(candies[start],c+1);
            if(hm.get(candies[start]) == 1)
                totalCount ++;
            c = hm.get(candies[end]) ;
            hm.put(candies[end],c-1);
            if(hm.get(candies[end]) == 0)
                totalCount --;

            ans = Math.max(ans,totalCount);
            start++;
            end ++;
        }
        return ans;
    }
}
