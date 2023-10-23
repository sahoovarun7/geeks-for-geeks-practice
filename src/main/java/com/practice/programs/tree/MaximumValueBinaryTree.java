package com.practice.programs.tree;

import com.practice.programs.java8.CommonUtil;

public class MaximumValueBinaryTree {

    public static void main(String[] args) {
       TreeNode root =  CommonUtil.createDummyTree();
       int maxVal = maximumValue(root);
       System.out.println("Max val is : "+maxVal);
    }

    static int maximumValue(TreeNode root){
        if(root == null)
            return -1;
        return Math.max(root.data,
                Math.max(maximumValue(root.left),maximumValue(root.right)));
    }
}
