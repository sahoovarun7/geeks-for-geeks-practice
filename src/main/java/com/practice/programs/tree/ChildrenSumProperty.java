package com.practice.programs.tree;

import com.practice.programs.java8.CommonUtil;

import java.util.LinkedList;
import java.util.Queue;

public class ChildrenSumProperty {

    public static void main(String[] args) {

        TreeNode node = CommonUtil.createDummyTree2();
        boolean ans = isValidSum(node);
        System.out.println("Is valid :  "+ans);
    }

    static boolean isValidSum(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            int levelSum = 0;
            int count = queue.size();
            for(int i=0;i<count;i++){

                TreeNode curr = queue.poll();
                if(curr.left != null){
                    levelSum += curr.left.data;
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    levelSum += curr.right.data;
                    queue.add(curr.right);
                }
                if(levelSum > 0 && levelSum != curr.data)
                    return false;
            }

        }
        return true;
    }
}
