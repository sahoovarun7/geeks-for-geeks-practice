package com.practice.programs.linkedlist;

public class SearchInLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node f1 = new Node(20);
        Node f2 = new Node(30);

        head.next = f1;
        f1.next = f2;

        Node curr = head;
        int pos = searchLL(curr,10,1);
        System.out.println("Pos : "+pos);
    }

    private static int searchLL(Node curr,int data,int counter){
        if(curr == null )
            return -1;
        if(curr.data == data)
            return counter;

        counter ++;
        curr = curr.next;
       return searchLL(curr,data,counter);
    }
}
