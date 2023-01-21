package com.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
public static void insertBinaryTree(Node root  , int data) {
    if(root==null) {
        root = new Node(data);
    }
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()){
        root = q.poll() ;


        if(root.left!=null)
            q.offer(root.left);
        else{
            root.left = new Node(data);
            return;
        }
        if(root.right!=null)
            q.offer(root.right);
        else{
            root.right = new Node(data);
            return;
        }

    }


}

// all other functions as same as in binary search tree


}
