package com.practice.programs.potd;

import java.util.HashMap;

public class LongestKUniqueSubString {

    public static void main(String[] args) {

        String s= "joizyglhbetjlvglzvvktxqsslufceppzpgogrifbeyuiblmgcqtkhhbimxigczvbtvrtsperlhunsyywgnttbwjgunjwjtqzqvrdumddtzaffcmjlakmfappoqqkvmfnevaabqxtzslodalgvtwvbsknohmjcumrrqktskvidbizexkprdonsjkbcoeplcafdalmvfaswnjkiqcwowhykczbdkankmkrrwsmcomaubfelnljztemcbmmoptndjodpqnikglvraezkvfxcphvgdgkouirhidbdtesjogrilbxhgtqprexyxptbqdxnwsuddzoiuumlbbgmhuzbgaslssvtexzlipsqfrfvxbkxmazocqvtaguvxmoqvhkfklucswkizrpatpakmuswqdsmxtnuujewtwtrnofowrgmxegwkxokotqhfodaegkmopjpdvpxzjrunwfqeldjhajnjzaargszgxakniopptsoakustvpbtocrovfceofpbeddqeidyvosbwbspesilldkdvocbfrbzthbgsnzaabjfbeanwoicritttjvkromyiodiazfgzktgkeqjmojamqrdusaibheiivnvmokacqudrcairqtisixcjxjsdubgusrcpleludvkjiabbeukbeadqruccuhwcrgosagtuyjfhnaniapxkrqdbmdsbxrzriyszsoguditxxpvdopzktljyrdzxunnybfzfqoezhizbustnwlpqypfqtgxapvwrcybnsjfrsdhyafsdglucczqtoazaycxybnlratmdqphtdwqsddhkrhvbgsytp";
        int k=10;
        int maxValue = longestkSubstr(s,k);
        System.out.println("Max value : "+maxValue);
    }


    /**
     * dry-run aabacbebebe
     *
     * @param s
     * @param k
     * @return
     */
    public static int longestkSubstr(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i =0;
        int j = 0;
        int distinctChar = 0;
        int ans = 0;
        while(j<=s.length()-1){

            if(hm.get(s.charAt(j)) == null){
                distinctChar++;
                hm.put(s.charAt(j),1);
            }else{
                int count = hm.get(s.charAt(j));
                count +=1;
                hm.put(s.charAt(j),count);
            }
            if(distinctChar >= k){
                ans = Math.max(ans,(j-i)+1);
            }
                while(distinctChar >k){
                    if(hm.get(s.charAt(i)) == 1){
                        distinctChar --;
                    }
                    int count = hm.get(s.charAt(i));
                    hm.put(s.charAt(i),count-1);
                    i++;
                }
            j++;
        }
        return ans;
    }



}
