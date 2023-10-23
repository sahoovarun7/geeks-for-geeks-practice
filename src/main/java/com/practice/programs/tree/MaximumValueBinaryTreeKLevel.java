package com.practice.programs.tree;

import com.practice.programs.java8.CommonUtil;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Maximum value of a binary tree only till k-level.
 *
 */
public class MaximumValueBinaryTreeKLevel {

    public static void main(String[] args) {
        TreeNode root = CommonUtil.createDummyTree();
        int ans = getMaxKLevel(3,root);
        System.out.println("Ans : "+ans);
    }

    static int getMaxKLevel(int k,TreeNode root){

        if(root == null)
            return -1;
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        bfs.add(null);
        int maxVal = root.data;
        int level = 1;
        while(!bfs.isEmpty()){
            if(level == k)
                return maxVal;
            TreeNode curr = bfs.poll();
            if(curr == null){
                level ++;
            }else{
                maxVal = Math.max(maxVal,curr.data);
                bfs.add(curr.left);
                bfs.add(curr.right);
                bfs.add(null);
            }

        }
        return maxVal;
    }

}
