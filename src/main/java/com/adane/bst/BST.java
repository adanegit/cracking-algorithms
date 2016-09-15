package com.adane.bst;

import com.adane.util.Node;

/**
 * Created by agebrem on 9/12/16.
 */

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int data) {

        Node<Integer> newNode = new Node(data);
        if(root == null) {
            root = newNode;
            return;
        }

        Node<Integer> current = root;
        Node<Integer> parent;

        while (true) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                if(current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if(current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public int findMin (Node<Integer> root) {
        if(root == null) {
            System.out.println("ERROR: Tree is empty");
            return -1;
        } else if (root.left == null) {
            return root.data;
        }

        return findMin(root.left);
    }

    public int findMax (Node<Integer> root) {
        if(root == null) {
            System.out.println("ERROR: Tree is empty");
            return -1;
        } else if (root.right == null) {
            return root.data;
        }

        return findMax(root.right);
    }

    public int findHeight (Node<Integer> root) {
        if(root == null) {
            return -1;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return max(leftHeight, rightHeight) + 1;
    }

    private int max(int leftHeight, int rightHeight) {
        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }
}

