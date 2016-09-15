package com.adane.depthfirst;

import com.adane.util.Node;

/**
 * Created by agebrem on 9/14/16.
 */
public class InOrder {

    String result = "";

    public String InOrderTraversal(Node<Character> root) {
        InOrderTraversalHelper(root);
        return result;
    }

    private void InOrderTraversalHelper(Node<Character> root) {
        if(root == null){
            return ;
        }
        InOrderTraversalHelper(root.left);
        result += root.data + ",";
        InOrderTraversalHelper(root.right);

    }
}
