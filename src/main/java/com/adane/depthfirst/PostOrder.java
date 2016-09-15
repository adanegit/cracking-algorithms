package com.adane.depthfirst;

import com.adane.util.Node;

/**
 * Created by agebrem on 9/14/16.
 */
public class PostOrder {

    String result = "";

    public String postOrderTraversal(Node<Character> root) {
        postOrderTraversalHelper(root);
        return result;
    }

    private void postOrderTraversalHelper(Node<Character> root) {
        if(root == null){
            return ;
        }
        postOrderTraversalHelper(root.left);
        postOrderTraversalHelper(root.right);
        result += root.data + ",";

    }
}
