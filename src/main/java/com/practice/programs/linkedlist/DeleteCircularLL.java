package com.practice.programs.linkedlist;

import com.practice.programs.java8.CommonUtil;

public class DeleteCircularLL {

    public static void main(String[] args) {

        Node head = new Node(10);
        Node f1 = new Node(20);
        Node f2 = new Node(30);

        head.next = f1;
        f1.next = f2;
        f2.next = head;

        head = deleteHead(head);
        head = deleteHead(head);
        head = deleteHead(head);
        CommonUtil.printCLinkedList(head);

    }

    private static Node deleteHead(Node head){
        if(head == null || head.next == head)
            return null;

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
