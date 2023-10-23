package com.practice.programs.linkedlist;

import com.practice.programs.java8.CommonUtil;

public class ReverseALinkedList {


    public static void main(String[] args) {
        Node head = new Node(10);
        Node f1 = new Node(20);
        Node f2 = new Node(30);

        head.next = f1;
        f1.next = f2;

        head = reverLinkedList(head);
        CommonUtil.printLinkedList(head);
    }

    static Node reverLinkedList(Node head){
        if(head == null || head.next == null)
            return head;
        Node prev = new Node(head.data);
        Node curr = head.next;
        while(curr != null){
            Node temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }

    Node reverseLinkedListRev(Node head){

        if(head.next == null){
            return new Node(head.data);
        }
        Node prev = head;
        head = reverseLinkedListRev(head.next);
        Node curr = head;
        curr.next =prev;
        return curr;
    }
}
