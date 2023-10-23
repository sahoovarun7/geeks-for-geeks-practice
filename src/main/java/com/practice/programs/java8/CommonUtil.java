package com.practice.programs.java8;

import com.practice.programs.linkedlist.Node;
import com.practice.programs.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class CommonUtil {


    public static List<Integer> generateFirstN(int n){
        List<Integer> num = new ArrayList<>();
        for(int i=1;i<=n;i++){
            num.add(i);
        }
        return num;
    }

    public static void printNums(List<Integer> nums){
        nums.stream().forEach(each->System.out.print(each+" "));
    }

    public static void printLinkedList(Node head){

        Node temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }

    public static void printCLinkedList(Node head){

        Node temp = head;
        if(temp == null){
            System.out.print(" ");
            return;
        }

        System.out.print(temp.getData()+" ");
        temp = temp.getNext();

        while(temp != head){
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }

    public static TreeNode createDummyTree(){
        TreeNode leadNode70 = new TreeNode(100,null,null);
        TreeNode node80 = new TreeNode(80,null,leadNode70);
        TreeNode node30 = new TreeNode(30,null,node80);
        TreeNode leafNode90 = new TreeNode(90,null,null);
        TreeNode leafNode60 = new TreeNode(60,null,null);
        TreeNode node40 = new TreeNode(40,leafNode60,leafNode90);
        TreeNode root = new TreeNode(10,node30,node40);
        return root;

    }

    public static List<Integer> getDummyArrays(){
       return List.of(2,4,5,7,9,10,100,6,5,3,8);
    }

    public static List<String> getDummyListString() {
        return List.of("Java","C++","Python","Java");
    }
}
