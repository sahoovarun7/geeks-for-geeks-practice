package com.practice.programs.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {

        TreeNode second = new TreeNode(2,null,null);
        TreeNode third = new TreeNode(3,null,null);
        TreeNode treeNode = new TreeNode(1,third,second);

        List<Integer> result = levelOrder(treeNode);

        result.stream().forEach(each -> System.out.print(each));
    }


    static ArrayList <Integer> levelOrder(TreeNode treeNode)
    {
        if(treeNode == null)
            new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        ArrayList<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            result.add(curr.data);
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
        return result;
    }
}
