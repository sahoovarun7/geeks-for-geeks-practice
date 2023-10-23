package com.practice.programs.linkedlist;

import com.practice.programs.java8.CommonUtil;

public class ReverseDoublyLinkedList {

    public static void main(String[] args) {

        Node head = new Node(10);
        Node f1 = new Node(20);
        Node f2 = new Node(30);

        head.next = f1;
        f1.next = f2;
        f1.prev = head;
        f2.prev = f1;

        head = reverseDLL(head);
        CommonUtil.printLinkedList(head);
    }

    private static Node reverseDLL(Node head){

        Node curr = head;
        Node prev =null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }


}
