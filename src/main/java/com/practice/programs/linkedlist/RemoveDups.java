package com.practice.programs.linkedlist;

import com.practice.programs.java8.CommonUtil;

public class RemoveDups {

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(20);
        Node node4 = new Node(30);
        Node node5 = new Node(30);
        Node node6 = new Node(30);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node head = removeDups(node1);
        CommonUtil.printLinkedList(head);

    }

    static private Node removeDups(Node head){
        if(head == null || head.next == null)
            return head;

        Node curr = head.next;
        Node prev = head;

        while(curr!= null){
            if(prev.data != curr.data){
                prev = prev.next;
                int data = prev.data;
                prev.data = curr.data;
                curr.data = data;
            }
            curr = curr.next;
        }
        prev.next = null;
        return head;
    }
}
