package com.practice.programs.linkedlist;

public class Node {

    int data;
    Node next;

    Node prev;

    public Node(int data){
        this.data = data;
        next = null;
    }

    public int getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

}
