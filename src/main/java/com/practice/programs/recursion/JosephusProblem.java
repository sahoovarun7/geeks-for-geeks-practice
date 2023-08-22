package com.practice.programs.recursion;

public class JosephusProblem {

    public static void main(String[] args) {

        JosephusProblem josephusProblem = new JosephusProblem();
        int aliveGuy = josephusProblem.josephus(5,3);
        System.out.println("Alive guy : "+aliveGuy);
    }

    public int josephus(int n, int k)
    {
        if(n == 1)
            return 1;
        else
        return ((josephus(n-1,k) + k - 1 ) % n+1);
    }
  /*  public int josephus(int n, int k)
    {
        int[] arr = new int[n];
        return processJosephus(arr,0,n,n,k-1);
    }*/

    int processJosephus (int[] arr,int index,int personLeft, int n,int skippingIndex){

        if(personLeft == 1)
            return arr[index];

        int killIndex = (index + skippingIndex) % n;
        arr[killIndex] = 0;
        personLeft --;
        index = killIndex + 1;

        return processJosephus(arr,index,personLeft,n,skippingIndex);

    }
}
