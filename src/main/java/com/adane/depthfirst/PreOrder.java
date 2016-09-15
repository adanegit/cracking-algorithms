package com.adane.depthfirst;

import com.adane.util.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by agebrem on 9/14/16.
 */
public class PreOrder {

    String result = "";

    public String preorderTraversal(Node<Character> root) {
        preorderTraversalHelper(root);
        return result;
    }

    private void preorderTraversalHelper(Node<Character> root) {
        if(root == null){
            return ;
        }
        result += root.data + ",";
        preorderTraversalHelper(root.left);
        preorderTraversalHelper(root.right);

    }
}
