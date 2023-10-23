package com.practice.programs.tree;

import com.practice.programs.java8.CommonUtil;

public class PrintLeftViewTree {

    public static void main(String[] args) {
        TreeNode root = CommonUtil.createDummyTree();
        printLeft(root,1);
    }

    static int maxLevel = 0;
    static void  printLeft(TreeNode root,int level){
        if(root == null)
            return;

        if(maxLevel < level){
            System.out.println(root.data);
            maxLevel = level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }
}
