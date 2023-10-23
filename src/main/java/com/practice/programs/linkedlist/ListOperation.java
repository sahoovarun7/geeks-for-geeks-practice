package com.practice.programs.linkedlist;

import com.practice.programs.java8.CommonUtil;

public class ListOperation {

    public static void main(String[] args) {
        //Runner method.
        Node head = new Node(10);
        Node f1 = new Node(20);
        Node f2 = new Node(30);

        head.next = f1;
        f1.next = f2;
        //beginInsertRunner(head);
        //endInsertRunner(head);
        insertAtPosRunner(head);

    }

    private static void beginInsertRunner(Node head) {
        CommonUtil.printLinkedList(head);

        head = insertAtBegin(head,5);
        head = insertAtBegin(head,4);
        head = insertAtBegin(head,3);
        CommonUtil.printLinkedList(head);
    }

    private static void endInsertRunner(Node head) {
        CommonUtil.printLinkedList(head);

         insertAtEnd(head,5);
         insertAtEnd(head,4);
         insertAtEnd(head,3);
        CommonUtil.printLinkedList(head);
    }

    private static void insertAtPosRunner(Node head) {
        CommonUtil.printLinkedList(head);

        head = insertAtPos(head,11,2);
        head =insertAtPos(head,21,4);
        head =insertAtPos(head,22,5);
        CommonUtil.printLinkedList(head);
    }

    private static Node insertAtBegin(Node head, int data) {

        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    private static void insertAtEnd(Node head, int data) {

        Node temp = new Node(data);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
    }

    private static Node insertAtPos(Node head, int data,int pos) {

        int counter = 1;
        Node node = new Node(data);
        if(pos == 1){
            node.next = head;
            return node;
        }
        Node curr = head;
        while(counter < pos){
            if(counter == pos - 1){
               node.next = curr.next;
               curr.next = node;
               break;
            }
            curr = curr.next;
            counter++;
        }
        return head;
    }
}
