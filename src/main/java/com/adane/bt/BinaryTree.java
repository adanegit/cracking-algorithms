package com.adane.bt;

import com.adane.util.Node;

/**
 * Created by agebrem on 9/12/16.
 */
public class BinaryTree {

    public static boolean isBinarySearchTree(Node<Integer> root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private static boolean isBSTUtil(Node<Integer> root, int min, int max) {
        if(root == null) {
            return true;
        }

        return (root.data > min && root.data < max
                && isBSTUtil(root.left, min, root.data)
                && isBSTUtil(root.right, root.data, max));
    }
}
